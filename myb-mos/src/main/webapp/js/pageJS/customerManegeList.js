
//分页公共方法
function pageForword(pageIndex){
    if(pageIndex < 5){
        $(".pagination li").addClass("active").siblings().removeClass("active");
    }
    if(pageIndex <= 0){
        pageIndex=1;
    }
    var finance = "${finance}";
    $.ajax({
        type:"GET",
        data:"",
        datatype:"html",
        url:"../crm/showListCustomer.jhtml?pageIndex="+pageIndex,
        success:function(data){
            $(".table-striped").html($(data).find(".table-striped").html());//******
            $(".pagination").html($(data).find(".pagination").html());
        },error:function(){
            //展示错误提示的弹框
            alertInfo("连接超时了");
        }
    });
}

function go (){
    var pageIndex = $(".goPageIndex").val();
    pageForword(pageIndex);
}
function clearForm(formName) {
    document.getElementById(formName).reset();
}
$(function(){
    var endDate = "${endDate}";
    var startDate = "${startDate}";

    $(".startDate").val(startDate);
    $(".endDate").val(endDate);
    $(".downExcel").click(function(){
        $.ajax({
            type:"GET",
            data:"",
            datatype:"json",
            url:"http://192.168.2.108:8989/myb-mos-api/file/customerExcel?area=1",
            success:function(data){
                if (data=="1"){
                    alertInfo("下载成功");
                }else {
                    alertInfo("下载失败");

                }
            },error:function(){
                //展示错误提示的弹框
                alertInfo("连接超时了");
            }
        });


    });
    $(".moreFilter").click(function () {
        $(".hiddenFilter").toggle(1000);
    });
    $.ajax({
        type:"GET",
        dataType:"json",
        url:"../crm/obeyFilterInfo.jhtml?visitRecode=1",
        success:function(data){
            if (data != "0") {
                for (var i = 0; i < data.quyu.length; i++) {//大区
                    $("#quyu").append("<option value=\""+data.quyu[i].argValue+"\">"+data.quyu[i].argName+"</option>");
                }
            }
        },error:function(){
            //展示错误提示的弹框
            alertInfo("连接超时了");
        }
    });
    $(".select1,.select2").change(function () {
        var paramName = $(this).attr("class").split(" ")[1];
        $.post("../crm/obeyFilterInfo.jhtml?"+paramName+"="+$(this).val(),
            {},
            function(data){
                if (data != "0") {
                    for (var i = 0; i < data.quyu.length; i++) {//大区
                        $("#"+paramName).append("<option value=\""+data.obj[i].argValue+"\">"+data.ob[i].argName+"</option>");
                    }
                }
            });
    });

    $(".search").click(function(){
        var subForm = $("#yanzheng").serialize();
        $.ajax({
            type:"GET",
            dataType:"html",
            data:{"startDate":startDate,"endDate":endDate,"xiaozu":xiaozu},
            url:"../crm/crmUserManege.jhtml?"+subForm,
            success:function(data){
                console.info(data);
                $(".table-striped").html($(data).find(".table-striped").html());
//								alertInfo("下载成功");
            },error:function(){
                //展示错误提示的弹框
                alertInfo("连接超时了");
            }
        });

    });
});