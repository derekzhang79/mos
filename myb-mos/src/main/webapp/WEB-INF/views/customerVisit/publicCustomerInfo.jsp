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
</head>
<body>
<jsp:include page="../menu/header.jsp"></jsp:include>
<section id="contact-page">
	<div class="container1">
		<div class="row">
			<jsp:include page="../menu/headerNext.jsp"></jsp:include>
			<div class="col-lg-offset-2 main">
				<h3 class="page-header">公海客户信息</h3>
				<div class="row head">
					<div class="col-md-8" style="width: 40%;float: left;">
						<h4>基础信息</h4>
						<table class="table table-striped table-bordered " style="margin-bottom: 0px;">
							<tr>
								<td>部门</td>
								<td>${emp.bumen}</td>
							</tr>
							<tr>
								<td>销售</td>
								<td>${emp.xingming}</td>
							</tr>
							<tr>
								<td>美容院名称</td>
								<td>${fresh.name}</td>
							</tr>
							<tr>
								<td>地址</td>
								<td>${fresh.address}</td>
							</tr>
							<tr>
								<td>座机</td>
								<td>${fresh.telephone}</td>
							</tr>
							<tr>
								<td>是否区域内</td>
								<td><c:if test="${fresh.isArea == 0}">是</c:if>
									<c:if test="${fresh.isArea == 1}">否</c:if></td>
							</tr>
							<tr>
								<td>商圈</td>
								<td>${fresh.businessArea}</td>
							</tr>
							<tr>
								<td>是否连锁</td>
								<td><c:if test="${fresh.isLink == 1}">是</c:if>
									<c:if test="${fresh.isLink == 0}">否</c:if></td>
							</tr>
							<tr>
								<td>门店数（数字）</td>
								<td>${fresh.linkNum}</td>
							</tr>
						</table>
					</div>

				<div class="col-md-8" style="width: 40%;float: left;">
					<h4>客户进度</h4>
					<table class="table table-striped table-bordered " style="margin-bottom: 0px;">
						<tr>
							<td>是否陪访</td>
							<td><c:if test="${process.isEscort == 0}">无</c:if>
								<c:if test="${process.isEscort == 1}">有</c:if></td>
						</tr>
						<tr>
							<td>是否意向</td>
							<td>${process.clientLevel}</td>
						</tr>
						<tr>
							<td>是否有效</td>
							<td><c:if test="${process.isValide == 0}">无效</c:if>
								<c:if test="${process.isValide == 1}">有效</c:if></td>
						</tr>
						<tr>
							<td>拜访次数</td>
							<td>${visitTimes}</td>
						</tr>
						<tr>
							<td>拜访进度</td>
							<td>${process.process}</td>
						</tr>
						<tr>
							<td>跟踪策略及备注</td>
							<td>${process.note}</td>
						</tr>
						<tr>
							<td>未出单原因</td>
							<td>${process.reason}</td>
						</tr>
					</table>
				</div>
				</div>
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