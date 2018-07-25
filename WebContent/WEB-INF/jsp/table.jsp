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
	<link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath }/css/bootstrap-responsive.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath }/css/style.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath }/css/style-responsive.min.css" rel="stylesheet" />
	<link href="${pageContext.request.contextPath }/css/retina.css" rel="stylesheet" />
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
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="${pageContext.request.contextPath }/ico/apple-touch-icon-144-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath }/ico/apple-touch-icon-114-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath }/ico/apple-touch-icon-72-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath }/ico/apple-touch-icon-57-precomposed.png" />
	<link rel="shortcut icon" href="${pageContext.request.contextPath }/ico/favicon.png" />
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
								<div class="avatar"><img src="${pageContext.request.contextPath }/img/avatar.jpg" alt="Avatar" /></div>
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
				<!--  
				<div class="row-fluid actions">
													
					<input type="text" class="search span12" placeholder="..." />
				
				</div>	
				-->
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
					<div class="box-header" data-original-title="">
						<h2><i class="icon-user"></i><span class="break"></span>Members</h2>
						<div class="box-icon">
							<a href="#" class="btn-setting"><i class="icon-wrench"></i></a>
							<a href="#" class="btn-minimize"><i class="icon-chevron-up"></i></a>
							<a href="#" class="btn-close"><i class="icon-remove"></i></a>
						</div>
					</div>
					<div class="box-content">
						<table class="table table-striped table-bordered bootstrap-datatable datatable">
						  <thead>
							  <tr>
								  <th>姓名</th>
								  <th>工号</th>
								  <th>入职部门</th>
								  <th>入职岗位</th>
								  <th>状态</th>
								  <th>联系方式</th>
								  <th>操作</th>
							  </tr>
						  </thead>   
						  <tbody id="data">
							<tr>
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
			<!-- end: Table -->
			</div>
			<!-- end: Content -->
				
				</div><!--/fluid-row-->
				
		<div class="modal hide fade" id="myModal">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h3>Settings</h3>
			</div>
			<div class="modal-body">
				<p>Here settings can be configured...</p>
			</div>
			<div class="modal-footer">
				<a href="#" class="btn" data-dismiss="modal">Close</a>
				<a href="#" class="btn btn-primary">Save changes</a>
			</div>
		</div>
		
		<div class="clearfix"></div>
		
		<footer>
			<p>
				<span style="text-align:left;float:left">Copyright &copy; 2018自然资源新员工培训二组</span>
			</p>

		</footer>
				
	</div><!--/.fluid-container-->

	<!-- start: JavaScript-->
		<script src="${pageContext.request.contextPath }/js/jquery-1.10.2.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery-migrate-1.2.1.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery-ui-1.10.3.custom.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.ui.touch-punch.js"></script>	
		<script src="${pageContext.request.contextPath }/js/modernizr.js"></script>	
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.cookie.js"></script>	
		<script src='${pageContext.request.contextPath }/js/fullcalendar.min.js'></script>	
		<script src='${pageContext.request.contextPath }/js/jquery.dataTables.min.js'></script>
		<script src="${pageContext.request.contextPath }/js/excanvas.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.flot.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.flot.pie.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.flot.stack.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.flot.resize.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/jquery.flot.time.js"></script>
		
		<script src="${pageContext.request.contextPath }/js/jquery.chosen.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.uniform.min.js"></script>		
		<script src="${pageContext.request.contextPath }/js/jquery.cleditor.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.noty.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.elfinder.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.raty.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.iphone.toggle.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.uploadify-3.1.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.gritter.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.imagesloaded.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.masonry.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.knob.modified.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.sparkline.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/counter.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/raphael.2.1.0.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/justgage.1.0.1.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/jquery.autosize.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/retina.js"></script>
		<script src="${pageContext.request.contextPath }/js/jquery.placeholder.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/wizard.min.js"></script>
		<script src="${pageContext.request.contextPath }/js/core.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/charts.min.js"></script>	
		<script src="${pageContext.request.contextPath }/js/custom.min.js"></script>
	<!-- end: JavaScript-->
</body>
<script>
//查询数据异步刷新
function selectData(){
	 var username = document.getElementById("username").value;
	    var password = document.getElementById("password").value;
	    if(username=="" || password ==""){
	        alert("登陆账号和密码不能为空");
	        return false;
	    } 
	//异步登录验证
	    $.ajax({
	            url:"/employeeRegister/savedata?type=login&username="+username+"&password="+password,
	            type:"post",
	            success: function(response){  
	        if(Format(response)=="false"){
	        alert("密码错误请重新输入！");
	        return false;
	         } 
	        else if(Format(response)=="none"){
	        	  alert("用户不存在！");
	              return false;
	        }
	        else{
	        	document.forms['form1'].submit();

	        }
	      }
	        });
	}
	//重置按钮事件
	function btncz(){
		var txt0=document.getElementById("txt0").value="";
		var txt1=document.getElementById("txt1").value="";
		var txt2=document.getElementById("txt2").value="";
		document.getElementById("zt").value="";
		
	}
	//每次查询之前清除表格中数据
	function deleteData(){
		var tab= document.getElementById("data");
		var row=tab.rows.length;
		if(row>1){
		for(var i=0;i<row;i++){
			tab.deleteRow(i);
			row=row-1;
			i=i-1;
		}
		}
	}
</script>
</html>