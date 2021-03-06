/**
A jQuery plugin for search hints

Author: Lorenzo Cioni - https://github.com/lorecioni
*/

(function($) {
	$.fn.autocomplete = function(params) {
		
		//Selections
		var currentSelection = -1;
		var currentProposals = [];
		
		//Default parameters
		params = $.extend({
			hints: [],
			placeholder: '请输入用户名（手机号）',
			width: 200,
			height: 16,
			showButton: true,
			buttonText: '添加权限',
			onSubmit: function(text){},
			onBlur: function(){}
		}, params);

		//Build messagess
		this.each(function() {
			//Container
			var searchContainer = $('<div></div>')
				.addClass('autocomplete-container')
				.css('height', 'auto');	
				
			//Text input		
			var input = $('<input type="text" autocomplete="off" name="query">')
				.attr('placeholder', params.placeholder)
				.addClass('autocomplete-input')
				.css({
					'width' : params.width,
					'height' : params.height
				});
			
			if(params.showButton){
				input.css('border-radius', '3px 0 0 3px');
			}

			//Proposals
			var proposals = $('<div></div>')
				.addClass('proposal-box')
				.css('width', "100%")
				.css('top', input.height() + 20);
			var proposalList = $('<ul></ul>')
				.addClass('proposal-list');

			proposals.append(proposalList);
			
			input.keydown(function(e) {
				switch(e.which) {
					case 38: // Up arrow
					e.preventDefault();
					$('ul.proposal-list li').removeClass('selected');
					if((currentSelection - 1) >= 0){
						currentSelection--;
						$( "ul.proposal-list li:eq(" + currentSelection + ")" )
							.addClass('selected');
					} else {
						currentSelection = -1;
					}
					break;
					case 40: // Down arrow
					e.preventDefault();
					if((currentSelection + 1) < currentProposals.length){
						$('ul.proposal-list li').removeClass('selected');
						currentSelection++;
						$( "ul.proposal-list li:eq(" + currentSelection + ")" )
							.addClass('selected');
					}
					break;
					case 13: // Enter
						if(currentSelection > -1){
							var text = $( "ul.proposal-list li:eq(" + currentSelection + ")" ).html();
							input.val(text);
						}
						currentSelection = -1;
						proposalList.empty();
						
						//调用当前选中的用户有什么权限
						searchUserMenu();
//						params.onSubmit(input.val());
						break;
					case 27: // Esc button
						currentSelection = -1;
						proposalList.empty();
						input.val('');
						break;
				}
			});
				
			input.bind("change paste keyup", function(e){
				if(e.which != 13 && e.which != 27 
						&& e.which != 38 && e.which != 40){				
					currentProposals = [];
					currentSelection = -1;
					proposalList.empty();
					if(input.val() != ''){
						var word = "^" + input.val() + ".*";
						proposalList.empty();
						for(var test in params.hints){
							if(params.hints[test].match(word)){
								currentProposals.push(params.hints[test]);	
								var element = $('<li></li>')
									.html(params.hints[test])
									.addClass('proposal')
									.click(function(){
										input.val($(this).html());
										proposalList.empty();
							//调用当前选中的用户有什么权限
										
										searchUserMenu();
//										params.onSubmit(input.val());
									})
									.mouseenter(function() {
										$(this).addClass('selected');
									})
									.mouseleave(function() {
										$(this).removeClass('selected');
									});
								proposalList.append(element);
							}
						}
					}
				}
			});
			
			input.blur(function(e){
				currentSelection = -1;
				//proposalList.empty();
				params.onBlur();
			});
			
			searchContainer.append(input);
			searchContainer.append(proposals);		
			
			if(params.showButton){
				//Search button
				var button = $('<div></div>')
					.addClass('autocomplete-button')
					.html(params.buttonText)
					.css({
						'height': params.height + 2,
						'line-height': params.height + 2 + 'px'
					})
					.click(function(){
						proposalList.empty();
						params.onSubmit(input.val());
					});
				searchContainer.append(button);	
			}
	
			$(this).append(searchContainer);	
			
			if(params.showButton){
				//Width fix
				searchContainer.css('width', params.width + button.width() + 50);
			}
		});

		return this;
	};
	
	
})(jQuery);

	function searchUserMenu(){
		
		$("input:checkbox").each(function(){
			$(this).attr("checked",false);
		})
		var inp = $(".autocomplete-input").val();
		var inp1 = inp.split("(")[1];
		var inp2= inp1.split(")")[0];
		$.ajax({
			url:"../role/searchUserByPermission.jhtml",
			data:{"mobile":inp2},
			type:"POST",
			dataType:"json",
			success:function(data){
				if(data != "0"){
					$(".sel").each(function(){
						
						for(var s=0; s<data.length; s++){
							
							if($(this).val()==(data[s])){
								$(this).attr("checked","checked");
							}
						}
					});
					
				}else {
					var dialog = jDialog.alert('获取用户权限失败',{},{
		   				showShadow: false,// 不显示对话框阴影
		   				buttonAlign : 'center',
		   				events : {
		   					show : function(evt){
		   						var dlg = evt.data.dialog;
		   					},
		   					close : function(evt){
		   						var dlg = evt.data.dialog;
		   					},
		   					enterKey : function(evt){
		   					},
		   					escKey : function(evt){
		   						evt.data.dialog.close();
		   					}
		   				}
		   			  });
				}
				
				},error:function(){
					var dialog = jDialog.alert('连接超时了',{},{
		   				showShadow: false,// 不显示对话框阴影
		   				buttonAlign : 'center',
		   				events : {
		   					show : function(evt){
		   						var dlg = evt.data.dialog;
		   					},
		   					close : function(evt){
		   						var dlg = evt.data.dialog;
		   					},
		   					enterKey : function(evt){
		   					},
		   					escKey : function(evt){
		   						evt.data.dialog.close();
		   					}
		   				}
		   			  });
			}
			
		});
	}