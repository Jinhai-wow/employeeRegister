<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
				<div class="row-fluid">
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
									<span class="name">${login.userid}</span>
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
				
				<div class="row-fluid actions">
													
					<input type="text" class="search span12" placeholder="..." />
				
				</div>	
				
				<div class="nav-collapse sidebar-nav">
					<ul class="nav nav-tabs nav-stacked main-menu">
						<li><a href="table.jsp"><i class="icon-edit"></i><span class="hidden-tablet"> 超级管理员</span></a></li>
						<li><a href="table.jsp"><i class="icon-edit"></i><span class="hidden-tablet"> 人力资源管理中心</span></a></li>
						<li><a href="main.jsp"><i class="icon-align-justify"></i><span class="hidden-tablet"> 个人管理中心</span></a></li>
					</ul>
				</div>
			</div>
			<!-- end: Main Menu -->
				
						
			<!-- start: Content -->
			<div id="content" class="span10">
			
			<div class="row-fluid">
				<div class="box span12">
					<div class="box-header">
						<h2><i class="icon-edit"></i>个人信息填写</h2>
						
					</div>
					<div class="box-content">
						<form class="form-horizontal" />
							<fieldset>
								 <div class="form-actions" style="color:#2e66de; padding: 5px 0px 5px; " >
							<label class="control-label">个人基本信息</label>
						    </div>
						    <div class="" style="width: 100%">
						    <div class="" style="width: 50%;float: left;background-color: #fff;">
							  <div class="control-group">
								<label class="control-label" for="focusedInput1">姓 名</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="xm" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">工 号</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="gh" type="text" value="" />
								</div>
								</div>
							  
							  <div class="control-group">
								<label class="control-label" for="disabledInput">工 资</label>
								<div class="controls">
								  <input class="input-xlarge disabled" id="gz" type="text" placeholder="100" disabled="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">性 别</label>
								<div class="controls">
								  <label class="checkbox inline">
									<input type="radio" name="optionsRadios" id="optionsRadios1" value="man" checked="" />
									男
								  </label>
								  <label class="checkbox inline">
									<input type="radio" name="optionsRadios" id="optionsRadios2" value="faleman" />女
								  </label>
								</div>
							  </div>
							 
							  <div class="control-group">
								<label class="control-label">籍 贯</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="jg" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">民 族</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="mz" type="text" value="" />
								</div>
							  </div>
							  
							  <div class="control-group">
								<label class="control-label">身份证号码</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="sfzhm" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">出生年月日</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="csrq" type="text" value=""  placeholder="请以年/月/日的格式填写，如2018/7/20" />
								</div>
							  </div>

							  <div class="control-group">
								<label class="control-label" for="selectError3">是否已生育</label>
								<div class="controls">
								  <select id="selectError3">
									<option />是
									<option />否
								  </select>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">婚姻状况</label>
								<div class="controls">
								  <label class="checkbox inline">
									<input type="radio" name="optionsRadios" id="hy_1" value="0" checked="" />
									已婚
								  </label>
								  
								  <label class="checkbox inline">
									<input type="radio" name="optionsRadios" id=hy_2" value="1" />未婚
								  </label>
								  <label class="checkbox inline">
									<input type="radio" name="optionsRadios" id=hy_3" value="2" />其他
								  </label>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">参加工作时间</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="gzsj" type="text" value="" />
								</div>
							  </div>
							  </div>
						<div class="" style="width: 50%;float: right;background-color: #fff;">
							 <div class="control-group">
								<label class="control-label">入职部门</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="bm" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">入职岗位</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="gw" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">工作性质</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="xz" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">毕业学校</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="xx" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">专业</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="zy" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">毕业时间</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="bysj" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">最高学历</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="zgxl" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">学历名称</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="xlmc" type="text" value="" />
								</div>
							  </div>
							  
							  <div class="control-group">
								<label class="control-label">政治面貌</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="zzmm" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">入党时间</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="rdsj" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">党组织关系</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="dzzgx" type="text" value="" />
								</div>
							  </div>
						</div>
						<div class="control-group" style="width: 100%">
								<label class="control-label">爱好特长</label>
								<div class="controls">
								  <input class="input-xlarge focused" style="width: 90%" id="ahtc" type="text" value="" />
								</div>
							  </div>
					</div>

							<div class="form-actions" style="color:#2e66de; padding: 5px 10px 5px; " >
							<label class="control-label">个人联系方式</label>
						    </div>
						    <div class="" style="width: 100%;background-color: #fff;">
						    	<div class="" style="width: 50%;float: left;background-color: #fff;">


							  <div class="control-group">
								<label class="control-label">通讯地址</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="txdz" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">邮 编</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="yb" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">现住地址</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="xzdz" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">住宅电话</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="zzdh" type="text" value="" />
								</div>
							  </div>
							  </div>
							  <div class="" style="width: 50%;float: right;background-color: #fff;">
							  <div class="control-group">
								<label class="control-label">移动电话</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="yddh" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">紧急联系人及电话</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="jjlx" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">个人邮箱</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="gryx" type="text" value="" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">公司邮箱</label>
								<div class="controls">
								  <input class="input-xlarge focused" id="gsyx" type="text" value="" />
								</div>
							  </div>
							  </div>
							  </div>
							  
							  <div class="form-actions">
								<button type="submit" class="btn btn-primary" style="margin: 2% 5% 0% 30%">保存</button>
								&nbsp;
								<button class="btn" style="margin: 2% 5% 0% 5%">取消</button>
							  </div>
							</fieldset>
						  </form>
					
					</div>
				</div><!--/span-->
			
			</div><!--/row-->
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