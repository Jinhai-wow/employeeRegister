<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
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
	
		<div class="container-fluid-full" style="background-image:url(img/bj1.jpg);opacity: 0.85;background-repeat:no-repeat;background-size: cover;">
		<div class="row-fluid">
					
			<div class="row-fluid">
				<div class="login-box">
					<h2>登陆账户</h2>
					<form class="form-horizontal" action="${pageContext.request.contextPath}/savedata"method="post" name="form1">
						<fieldset>
						     <!-- 判断登陆类型 -->
							<input id ="types"type="hidden" name="type" value="login">
							<input class="input-large span12" name="username" id="username" type="text" placeholder="type username" />

							<input class="input-large span12" name="password" id="password" type="password" placeholder="type password" />

							<div class="clearfix"></div>
							
							<label class="remember" for="remember"><input type="checkbox" id="remember" />记住密码</label>
							
							<div class="clearfix"></div>
							<button type="button" class="btn btn-primary span12"onclick="formSubmit()">登 陆</button>
						</fieldset>	
					</form><!-- 
					<p>第一次进入系统的新员工请点击下方入口。</p>	 -->
					<form class="form-horizontal" action="${pageContext.request.contextPath }/savedata" method="post">
					 <!-- 判断登陆类型 -->
					<input id ="types"type="hidden" name="type" value="regist">
					<button type="submit" class="btn btn-primary span12" style="background-color: #a3a0a0;">新员工入口</button>
				    </form>
					<hr />
					<h3>忘记密码？</h3>
					<p>
						<!-- No problem, <a href="#">click here</a> to get a new password. -->
						请询问人力资源处，谢谢。
					</p>	
				</div>
			</div><!--/row-->
			
				</div><!--/fluid-row-->
				
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
<script type="text/javascript">
//登陆验证异步请求
function formSubmit() {
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
        alert("密码错误请重新输入!");
        return false;
         } 
        else{
        	document.forms['form1'].submit();

        }
      }
        });
}
//转换数据格式
function Format(val) {
    if (val == null || typeof (val) == "undefined" || (val + "") == "null") 
    {
        return "";
    } 
    else 
    {
        return val + "";
    }
}
</script>
</html>