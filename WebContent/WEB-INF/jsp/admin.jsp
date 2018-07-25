<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
	
	<!-- start: Meta -->
	<meta charset="utf-8" />
	<title>GeoStar-新员工管理系统</title>
	<meta name="description" content="SimpliQ - Flat & Responsive Bootstrap Admin Template." />
	<meta name="author" content="Łukasz Holeczek" />
	<meta name="keyword" content="SimpliQ, Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina" />
	<!-- end: Meta -->
	
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<!-- end: Mobile Specific -->
	
	<!-- start: CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet" />
	<link href="css/bootstrap-responsive.min.css" rel="stylesheet" />
	<link href="css/style.min.css" rel="stylesheet" />
	<link href="css/style-responsive.min.css" rel="stylesheet" />
	<link href="css/retina.css" rel="stylesheet" />
	<!-- end: CSS -->
	

	<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
	<!--[if lt IE 9]>
	  	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		<link id="ie-style" href="css/ie.css" rel="stylesheet">
	<![endif]-->
	
	<!--[if IE 9]>
		<link id="ie9style" href="css/ie9.css" rel="stylesheet">
	<![endif]-->
	
	<!-- start: Favicon and Touch Icons -->
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/apple-touch-icon-144-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/apple-touch-icon-114-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/apple-touch-icon-72-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" href="ico/apple-touch-icon-57-precomposed.png" />
	<link rel="shortcut icon" href="ico/favicon.png" />
	<!-- end: Favicon and Touch Icons -->	
		
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body>
		<!-- start: Header -->
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="btn btn-navbar" data-toggle="collapse" data-target=".top-nav.nav-collapse,.sidebar-nav.nav-collapse">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</a>
				<!-- 伸缩按钮 -->
				<!-- <a id="main-menu-toggle" class="hidden-phone open"><i class="icon-reorder"></i></a>	 -->	
				<div class="row-fluid">
				<!-- <a class="brand spa2" href="index.html"> -->
				<a class="brand span2" href="http://www.geostar.com.cn/">
					<span>GeoStar</span>
				</a>
				</div>		
				<!-- start: Header Menu -->
				<div class="nav-no-collapse header-nav">
					<ul class="nav pull-right">
						
						<!-- start: User Dropdown -->
						<li class="dropdown">
							<a class="btn account dropdown-toggle" data-toggle="dropdown" href="#">
								<div class="avatar"><img src="img/avatar.jpg" alt="Avatar" /></div>
								<div class="user">
									<span class="hello">Welcome!</span>
									<span class="name">超级管理员</span>
								</div>
							</a>
							<ul class="dropdown-menu">
								<li class="dropdown-menu-title">
								</li>
								<li><a href="${pageContext.request.contextPath }/login.jsp"><i class="icon-off"></i>退出登陆</a></li>
							</ul>
						</li>
						<!-- end: User Dropdown -->
					</ul>
				</div>
				<!-- end: Header Menu -->
				
			</div>
		</div>
	</div>
	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
			<!-- start: Main Menu -->
			<div id="sidebar-left" class="span2">
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<!-- 根据登陆权限不同展示不同的链接 -->
					 <c:if test="${login.qxjb==0}">
					 <li><a href="${pageContext.request.contextPath }/admin/pageInfo?type=three"><i class="icon-edit"></i><span class="hidden-tablet"> 超级管理员</span></a></li>
					 <li><a href="${pageContext.request.contextPath }/admin/pageInfo?type=one"><i class="icon-edit"></i><span class="hidden-tablet"> 人力资源管理中心</span></a></li>
					 </c:if>
					  <c:if test="${login.qxjb==1}">
					  <li><a href="${pageContext.request.contextPath }/admin/pageInfo?type=one"><i class="icon-edit"></i><span class="hidden-tablet"> 人力资源管理中心</span></a></li>
					  <li><a href="${pageContext.request.contextPath }/admin/pageInfo?type=two"><i class="icon-align-justify"></i><span class="hidden-tablet"> 个人管理中心</span></a></li>
					  </c:if>
					  <!-- 
						<li><a href="table.html"><i class="icon-edit"></i><span class="hidden-tablet"> 超级管理员</span></a></li>
						<li><a href="${pageContext.request.contextPath }/admin/pageInfo?type=one"><i class="icon-edit"></i><span class="hidden-tablet"> 人力资源管理中心</span></a></li>
						<li><a href="${pageContext.request.contextPath }/admin/pageInfo?type=two"><i class="icon-align-justify"></i><span class="hidden-tablet"> 个人管理中心</span></a></li>
					   -->
					</ul>
				</div>
			</div>
			<!-- end: Main Menu -->
				
						
			<!-- start: Content -->
			<div id="content" class="span10" >
			
			<!-- start: Table -->
			<div class="row-fluid">
				
				<div class="box span12">
					<div class="box-header">
						<h2><i class="icon-edit"></i>管理员设置</h2>
						<div class="box-icon">
							<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<div id="MyWizard" class="wizard">
							<ul class="steps" style="display: none">
								<li data-target="#step1" class="active"><span class="badge badge-info">创建</span></li>
								<li data-target="#step2"><span class="badge">查找</span></li>
								
							</ul>
							<div class="actions">
								<button type="button" class="btn btn-prev">创建新管理员</button>
								<button type="button" class="btn btn-success btn-next" >查找已有人员</button>
							</div>
						</div>
						<div class="step-content">
							<div class="step-pane active" id="step1">
								<div class="form-actions" style="color:#36a9e17a; padding: 5px 0px 5px; " >
										<label style="color: #5d97eb;padding-left: 15px;"> 创建管理员</label>
									</div>
								<div class="alert alert-info">
									<button type="button" class="close" data-dismiss="alert">×</button>
									<strong></strong>*为必填项。
								</div>
								<form class="form-horizontal" />
									<fieldset>	
										<div class="control-group">
											<label class="control-label" for="zhm">账户名</label>
											<div class="controls">
									  			<input type="text" id="zhm" required="required" />
									  			<span class="help-inline" style="color: red">*</span>
											</div>
								  		</div>
								  		<div class="control-group">
											<label class="control-label" for="mm">密 码</label>
											<div class="controls">
									  			<input type="text" id="mm" required="required"/>
									  			<span class="help-inline" style="color: red">*</span>
											</div>
								  		</div>
									</fieldset>
								</form>
								<div class="">
									<button type="submit" class="btn btn-primary" style="margin: 0% 5% 0% 18%">保存</button>
									&nbsp;
									<button class="btn" style="margin: 0% 5% 0% 0%">取消</button>
								</div>
								<div class="row-fluid">
									<div class="form-actions" style="color:#36a9e17a; padding: 5px 0px 5px; " >
										<label style="color: #5d97eb;padding-left: 15px;"> 管理员列表</label>
									</div>

										<div >
											  	<select id="select_bm" style="margin-bottom: 0px;">
											  		<option />-请选择部门-
													<option />人力资源部
													<option />综合办
													<option />自然资源与规划事业部
													<option />产品研发中心
													<option />融合应用事业部
													<option />智慧城市与地理信息应用事业部
											  	</select>
											
											<input type="text" class="input-large" style="margin-bottom: 0px;">&nbsp;
											<button class="btn btn-primary">Search</button>
										
											<div style="float: right;">
												<input class="input-file uniform_on" id="fileInput" type="file" style="position: right;"/>
											</div>
										</div>
										<br></br>
								

									<div class="widget">
										<div class="widget-header">
											
											<span class="tools">
												<a class="fs1" aria-hidden="true" data-icon="&#xe090;"></a>
											</span>
										</div>
										<div class="widget-body">
											<table class="table table-striped table-bordered no-margin">
												<thead>
													<tr>

														<th style="width:5%">
															<input type="checkbox" class="no-margin" />
														</th>
														<th style="width:40%">
															用户名
														</th>
														<th style="width:40%" class="hidden-phone">
															密 码
														</th>
														<th style="width:20%" class="hidden-phone">
															操 作
														</th>

													</tr>
												</thead>
												<tbody>
													<tr>
														<td>
															<input type="checkbox" class="no-margin" />
														</td>
														<td>
															办公室助理
														</td>
														<td class="hidden-phone">
															11111
														</td>
														<td class="hidden-phone">
															<a class="delete-row" data-original-title="Delete" href="#">
																<i class="icon-trash">
																</i>
															</a>
														</td>
													</tr>
													
												</tbody>
											</table>
										</div>
									</div>
								</div>
							</div>
							<div class="step-pane" id="step2">
								

								<div class="row-fluid">

										<div >
											  	<select id="select_bm" style="margin-bottom: 0px;">
											  		<option />-请选择部门-
													<option />人力资源部
													<option />综合办
													<option />自然资源与规划事业部
													<option />产品研发中心
													<option />融合应用事业部
													<option />智慧城市与地理信息应用事业部
											  	</select>
											
											<input type="text" class="input-large" style="margin-bottom: 0px;">&nbsp;
											<button class="btn btn-primary">查找</button>

											<div style="float: right;">
												<button class="btn"><i class="icon-plus">添加管理员</i></button>
											</div>
										</div>
										<br></br>

										<table class="table table-striped table-bordered no-margin">
											<thead>
												<tr>
													<th>
														<input type="checkbox" class="no-margin" />
													</th>
													<th>姓名</th>
													<th>工号</th>
													<th>入职部门</th>
													<th>入职岗位</th>
													<th>状态</th>
													<th>联系方式</th>
													<th>操作</th>
												</tr>
											</thead>   
											<tbody>
												<tr>
													<td>
														<input type="checkbox" class="no-margin" />
													</td>
													<td>汪天宇</td>
													<td class="center">2018</td>
													<td class="center">自然资源与规划事业部</td>
													<td class="center">项目经理</td>
													<td class="center">
														<span class="label label-success">试用</span>
													</td>
													<td class="center">18696455414</td>
													<td class="center">
														<a class="btn btn-success" href="form_1.html">
															<i class="icon-zoom-in "></i>  
														</a>
														<a class="btn btn-info" href="form_1.html">
															<i class="icon-edit "></i>  
														</a>
														<a class="btn btn-danger" href="#">
															<i class="icon-trash "></i> 
														</a>
													</td>
												</tr>

											</tbody>
										</table>            



									</div>

							</div>
							
						</div>
					</div>
					
				</div><!--/span-->

			</div><!--/row-->	
			<!-- end: Table -->
			</div>
			<!-- end: Content -->
				
				</div><!--/fluid-row-->
				
		
		<div class="clearfix"></div>
		
		<footer>
			<p>
				<span style="text-align:left;float:left">Copyright &copy; 2018自然资源新员工培训二组</span>
			</p>

		</footer>
				
	</div><!--/.fluid-container-->

	<!-- start: JavaScript-->
		<script src="js/jquery-1.10.2.min.js"></script>
	<script src="js/jquery-migrate-1.2.1.min.js"></script>	
		<script src="js/jquery-ui-1.10.3.custom.min.js"></script>	
		<script src="js/jquery.ui.touch-punch.js"></script>	
		<script src="js/modernizr.js"></script>	
		<script src="js/bootstrap.min.js"></script>	
		<script src="js/jquery.cookie.js"></script>	
		<script src='js/fullcalendar.min.js'></script>	
		<script src='js/jquery.dataTables.min.js'></script>
		<script src="js/excanvas.js"></script>
	<script src="js/jquery.flot.js"></script>
	<script src="js/jquery.flot.pie.js"></script>
	<script src="js/jquery.flot.stack.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<script src="js/jquery.flot.time.js"></script>
		
		<script src="js/jquery.chosen.min.js"></script>	
		<script src="js/jquery.uniform.min.js"></script>		
		<script src="js/jquery.cleditor.min.js"></script>	
		<script src="js/jquery.noty.js"></script>	
		<script src="js/jquery.elfinder.min.js"></script>	
		<script src="js/jquery.raty.min.js"></script>	
		<script src="js/jquery.iphone.toggle.js"></script>	
		<script src="js/jquery.uploadify-3.1.min.js"></script>	
		<script src="js/jquery.gritter.min.js"></script>	
		<script src="js/jquery.imagesloaded.js"></script>	
		<script src="js/jquery.masonry.min.js"></script>	
		<script src="js/jquery.knob.modified.js"></script>	
		<script src="js/jquery.sparkline.min.js"></script>	
		<script src="js/counter.min.js"></script>	
		<script src="js/raphael.2.1.0.min.js"></script>
	<script src="js/justgage.1.0.1.min.js"></script>	
		<script src="js/jquery.autosize.min.js"></script>	
		<script src="js/retina.js"></script>
		<script src="js/jquery.placeholder.min.js"></script>
		<script src="js/wizard.min.js"></script>
		<script src="js/core.min.js"></script>	
		<script src="js/charts.min.js"></script>	
		<script src="js/custom.min.js"></script>
	<!-- end: JavaScript-->
	

</body>
</html>