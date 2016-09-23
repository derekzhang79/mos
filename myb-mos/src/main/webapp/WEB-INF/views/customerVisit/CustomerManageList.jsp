<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en"><head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>MOS-美业邦</title>

	<!-- Bootstrap -->
	<link href="../css/bootstrap.min.css" rel="stylesheet">
	<link href="../css/back-style.css" rel="stylesheet">
	<link href="../css/dashboard.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="../css/calendar/jquery.datetimepicker.css"/>
	<link href="../css/bootstrap/bootstrap-datetimepicker.min.css?v=2016817" rel="stylesheet" media="screen">
	<script src="../js/jquery-2.1.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/validate.js"></script>
	<script src="../js/alertInfo.js"></script>
	<script src="../js/pageJS/customerManegeList.js"></script>

</head>
<body>
<jsp:include page="../menu/header.jsp"></jsp:include>
<section id="contact-page">
	<div class="container1">
		<div class="row">
			<jsp:include page="../menu/headerNext.jsp"></jsp:include>
			<div class="col-lg-offset-2 main">
				<h3 class="page-header">客户管理列表</h3>
				<div class="row head">
					<div class="col-md-8" style="width: 100%;">
						<form id="yanzheng">
							<table class="table-nobordered" width="100%">
								<tbody>
								<tr>
									<td colspan="2">
										<input type="text" class="form-control" name="shopName"  placeholder="请输入美容院名称" >
									</td>
									<td colspan="2">
										<select id="status" class="form-control" name="status">
											<option value="">请选择状态</option>
											<option value="1">已完成</option>
											<option value="2">已分配</option>
										</select>
									</td>
									<td colspan="3">
										<select id="quyu" class="form-control select1" name="quyu">
											<option value="">请选择大区</option>
										</select>
									</td>
									<%--<c:if test="${employee.userName eq 'admin' }">
                                        <td><a href="http://101.201.42.115:8989/myb-mos-api/file/customerExcel?area=1"   class="btn btn-info btn-sm">下载excel</a></td>
                                    </c:if>--%>
								</tr>
								<tr>
									<td colspan="2">
										<select id="xiaozu" class="form-control select2" name="xiaozu">
											<option value="">请选择小组</option>
										</select>
									</td>
									<td colspan="2">
										<select id="xiaoshou" class="form-control select3" name="xiaoshou">
											<option value="">请选择销售</option>
										</select>
									</td>
									<td colspan="3">
										<a href="javascript:void(0)"   class="btn btn-info btn-sm search" >查询</a>
										<a href="javascript:void(0)"  onclick="clearForm('yanzheng');" class="btn btn-info btn-sm clear" >清空</a>&nbsp;
										<a href="javascript:void(0)"  class="btn btn-info btn-sm morefilter" >更多条件>></a>
									</td>
								</tr>

								<tr class="hiddenFilter" style="text-align: right;display: none;">
									<td>是否使用其他软件：</td>
									<td><input type="radio" name="isOtherApp" class="isOtherApp" value="1">是
										<input type="radio" name="isOtherApp" class="isOtherApp" value="0">否</td>
									<td>是否有效：</td>
									<td><input type="radio" name="isValid" class="isValid" value="1">是
										<input type="radio" name="isValid" class="isValid" value="0">否</td>
									<td>拜访次数：</td>
									<td><input type="text" class="form-control minVisitNum" name="minVisitNum"  style="width: 50px;"></td>
									<td><input type="text" class="form-control maxVisitNum" name="maxVisitNum"  style="width: 50px;"></td>
								</tr>
								<tr class="hiddenFilter" style="text-align: right;display: none;">
									<td>是否区域内：</td>
									<td><input type="radio" name="isArea" class="isArea" value="1">是
										<input type="radio" name="isArea" class="isArea" value="0">否</td>
									<td colspan="2">
										<select id="clientLevel" class="form-control" name="clientLevel" >
											<option value="">是否意向</option>
											<option value="A">A</option>
											<option value="B">B</option>
											<option value="C">C</option>
											<option value="D">D</option>
										</select>
									</td>
									<td>门店数（数字）：</td>
									<td><input type="text" class="form-control minLinkNum" name="minLinkNum"  style="width: 50px;"></td>
									<td><input type="text" class="form-control maxLinkNum" name="maxLinkNum" style="width: 50px;"></td>
								</tr>
								<tr class="hiddenFilter" style="text-align: right;display: none;">
									<td>是否连锁：</td>
									<td><input type="radio" name="isLink" class="isLink" value="1">是
										<input type="radio" name="isLink" class="isLink" value="0">否</td>
									<td colspan="2">
										<select id="process" class="form-control" name="process">
											<option value="">拜访进度</option>
											<option value="播种">播种</option>
											<option value="收割">收割</option>
											<option value="肥田">肥田</option>
										</select>
									</td>
									<td>店面规模：</td>
									<td><input type="text" class="form-control minScale" name="minScale"  style="width: 50px;"></td>
									<td><input type="text" class="form-control maxScale" name="maxScale" style="width: 50px;"></td>
								</tr>
								<tr class="hiddenFilter" style="text-align: right;display: none;">
									<td>是否见过KP：</td>
									<td><input type="radio" name="seenBoss" class="seenBoss" value="1">是
										<input type="radio" name="seenBoss" class="seenBoss" value="0">否</td>
									<td colspan="2">
										<select id="duty" class="form-control" name="duty">
											<option value="">当前跟进人职务</option>
											<option value="1">老板</option>
											<option value="2">店长</option>
											<option value="3">店员</option>
										</select>
									</td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								<tr class="hiddenFilter" style="text-align: right;display: none;">
									<td>是否陪访：</td>
									<td><input type="radio" name="isEscort" class="isEscort" value="1">是
										<input type="radio" name="isEscort" class="isEscort" value="0">否</td>
									<td colspan="2">
										<select id="reason" class="form-control" name="reason">
											<option value="">未出单原因</option>
											<option value="1">价格</option>
											<option value="2">暂无</option>
											<option value="3">暂无</option>
										</select>
									</td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
								</tbody>
							</table>
						</form>
					</div>
				</div>
				<br>
				<table class="table table-striped table-bordered " style="margin-bottom: 0px;">
					<thead>
					<tr>
						<th>美容院名称</th>
						<th>美容院老板</th>
						<th>部门</th>
						<th>销售姓名</th>
						<th>店面规模</th>
						<th>门店数（数字）</th>
						<th>是否见过KP</th>
						<th>操作</th>
					</tr>
					</thead>
					<tbody id="allData">
					<c:forEach items="${shops}" var="shop">
						<tr>
							<td>
								<a href="JavaScript:void(0)" target="view_window"> ${fn:substring(shop.xiaozu, 0, 2)}</a>
							</td>
							<td>
									${shop.xiaozu}
							</td>
							<td>${shop.xingming}</td>
							<td>${shop.allCount}</td>
							<td>${shop.isValideCount}</td>
							<td>${shop.shopAllCount}</td>
							<td>${shop.shopValideCount}</td>
							<td><a href="../crm/queryCustomerInfo.jhtml?shopId=${shop.shopId}">查看详情</a></td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				<nav id="allpage">
					<ul class="pagination pull-right">
						<li >
							<a href="javascript:void(0)" aria-label="Previous" onclick="pageForword(${openAccountPageList.pageIndex -1})"><span aria-hidden="true">«</span></a>
						</li>

						<!--开总页数小于5   -->
						<c:if test="${openAccountPageList.totalPage<=5 }">
							<c:forEach begin="1" end="${openAccountPageList.totalPage}" var="currentPage">
								<li  <c:if test="${currentPage ==  openAccountPageList.pageIndex}">class="active"</c:if>><a href="javascript:void(0)" onclick="pageForword(${currentPage})">${currentPage}</a></li>
							</c:forEach>
						</c:if>

						<!--总页数大于5  -->
						<c:if test="${openAccountPageList.totalPage > 5}">
							<!--当前索引小于3  -->
							<c:if test="${openAccountPageList.pageIndex <= 3}">
								<c:forEach begin="1" end="5" var="currentPage">
									<li  <c:if test="${currentPage ==  openAccountPageList.pageIndex}">class="active"</c:if>><a href="javascript:void(0)" onclick="pageForword(${currentPage})">${currentPage}</a></li>
								</c:forEach>
							</c:if>

							<!--当前索引大于3  -->
							<c:if test="${openAccountPageList.pageIndex > 3}">
								<li><a href="javascript:void(0)" onclick="pageForword(1)">1</a></li>
								<li><a href="javascript:void(0)" >...</a></li>
								<!--当前页加2小于total  -->

								<c:choose>
									<c:when test="${openAccountPageList.pageIndex*1 + 2 < openAccountPageList.totalPage }">
										<c:forEach begin="${openAccountPageList.pageIndex -2 }" end="${openAccountPageList.pageIndex + 2}" var="currentPage">
											<li  <c:if test="${currentPage ==  openAccountPageList.pageIndex}">class="active"</c:if>><a href="javascript:void(0)" onclick="pageForword(${currentPage})">${currentPage}</a></li>
										</c:forEach>
										<li><a href="javascript:void(0)" >...</a></li>
										<li><a href="javascript:void(0)" onclick="pageForword(${openAccountPageList.totalPage})">${openAccountPageList.totalPage}</a></li>
									</c:when>
									<c:otherwise>
										<c:forEach begin="${openAccountPageList.totalPage -4}" end="${openAccountPageList.totalPage}" var="current">
											<li  <c:if test="${current ==  openAccountPageList.pageIndex}">class="active"</c:if>><a href="javascript:void(0)" onclick="pageForword(${current})">${current}</a></li>
										</c:forEach>
									</c:otherwise>
								</c:choose>
							</c:if>
						</c:if>

						<!--点击过之后的分页start当前页小于5  -->
						<c:if test="${openAccountPageList.pageIndex < openAccountPageList.totalPage}">
							<li>
								<a href="javascript:void(0)" aria-label="Next" onclick="pageForword(${openAccountPageList.pageIndex+1})"><span aria-hidden="true">»</span></a>
							</li>
						</c:if>

						<li style="display:inline-flex;">
							<input type="text"  class="form-control goPageIndex" style="width: 31%"/>
							<button onclick="go()">GO</button>
						</li>
					</ul>
				</nav>
			</div>
		</div>
	</div>
</section>
<script type="text/javascript" src="../js/bootstrap/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="../js/bootstrap/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>

<script type="text/javascript">
	//日期格式化插件
	$('.form_datetime').datetimepicker({
		minView: 'month',     //设置时间选择为年月日 去掉时分秒选择
		format:'yyyy-mm-dd',
		weekStart: 1,
		todayBtn:  1,
		autoclose: 1,
		todayHighlight: 1,
		startView: 2,
		forceParse: 0,
		showMeridian: 1,
		language: 'zh-CN'    //设置时间控件为中文
	});

</script>
<!--/#contact-page-->
<footer class="footer navbar-fixed-bottom">
	<div class="container">
		<p class="text-muted pull-right">美业邦 (北京) 科技有限公司 Copyright®2016</p>
	</div>
</footer>
</body>
</html>