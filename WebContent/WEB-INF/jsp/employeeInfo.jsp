<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
	

	<!-- start: Favicon and Touch Icons -->
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="ico/apple-touch-icon-144-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="ico/apple-touch-icon-114-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="ico/apple-touch-icon-72-precomposed.png" />
	<link rel="apple-touch-icon-precomposed" href="ico/apple-touch-icon-57-precomposed.png" />
	<link rel="shortcut icon" href="ico/favicon.png" />
	<!-- end: Favicon and Touch Icons -->	
		
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

<body onload="">
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
						<a class="btn account dropdown-toggle" href="${pageContext.request.contextPath}/login.jsp">返回</a>
					</ul>
				</div>
				<!-- end: Header Menu -->
			</div>
		</div>
	</div>
	<!-- start: Header -->
	
		<div class="container-fluid-full">
		<div class="row-fluid">
				
						
			<!-- start: Content -->
			<div id="content" class="span10 full">
			
			<div class="row-fluid">
				<div class="box span12">
					<div class="box-header">
						<h2><i class="icon-edit"></i>员工个人信息</h2>
						
					</div>
					<div class="box-content">
						<form class="form-horizontal" action="${pageContext.request.contextPath}/save" method="post" onsubmit="return checkdata()" >
							<fieldset>
								 <div class="form-actions" style="color:#2e66de; padding: 5px 0px 5px; " >
							<label class="control-label">个人基本信息</label>
						    </div>
						    <div class="" style="width: 100%">
						    <div class="" style="width: 50%;float: left;background-color: #fff;">
							  <div class="control-group">
								<label class="control-label" for="focusedInput1">姓 名</label>
								<div class="controls">
								  <input class="input-xlarge " disabled="" id="ygmc" type="text" value="${ygxx.ygmc }" name="ygmc" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">工 号</label>
								<div class="controls">
								  <input class="input-xlarge " disabled="" id="yggh" type="text" value="${ygxx.yggh }" name="yggh" />
								</div>
								</div>
							  
							  <div class="control-group">
								<label class="control-label" for="disabledInput">工 资</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="gz" name="xz" type="text" placeholder="100" disabled="" value="${ygxx.xz }"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">性 别</label>
								<div class="controls">
								
								  <c:if test="${ygxx.xb=='0'}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="男" name="mz" />
								  </c:if>
								   <c:if test="${ygxx.xb=='1'}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="女" name="mz" />
								  </c:if>
								  
								</div>
							  </div>
							 
							  <div class="control-group">
								<label class="control-label">籍 贯</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="jg" type="text" value="${ygxx.jg }" name="jg" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">民 族</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="${ygxx.mz }" name="mz" />
								</div>
							  </div>
							  
							  <div class="control-group">
								<label class="control-label">身份证号码</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="sfzhm" type="text" value="${ygxx.zjhm }" name="zjhm" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">出生年月日</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="csrq" type="text" value="${ygxx.csrq }" name="csrq"/>
								</div>
							  </div>

							  <div class="control-group">
								<label class="control-label" for="selectError3">是否已生育</label>
								<div class="controls">
								<c:if test="${ygxx.sfsy ==0}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="是" name="mz" />
								  </c:if>
								   <c:if test="${ygxx.sfsy==1}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="否" name="mz" />
								  </c:if>
								  
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">婚姻状况</label>
								<div class="controls">
								<c:if test="${ygxx.hyzk ==0}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="已婚" name="mz" />
								  </c:if>
								   <c:if test="${ygxx.hyzk==1}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="未婚" name="mz" />
								  </c:if>
								   <c:if test="${ygxx.hyzk==2}">
								  <input class="input-xlarge disabled" disabled="" id="mz" type="text" value="其他" name="mz" />
								  </c:if>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">参加工作时间</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled=""  id="gzsj" type="text" value="${ygxx.cjgzsj }" name="cjgzsj" />
								</div>
							  </div>
							  </div>
						<div class="" style="width: 50%;float: right;background-color: #fff;">
							 <div class="control-group">
								<label class="control-label">入职部门</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="bm" type="text" value="${ygxx.rzbm }" name="rzbm" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">入职岗位</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="gw" type="text" value="${ygxx.rzgw }" name="rzgw" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">工作性质</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="xz" type="text" value="${ygxx.gzxz }" name="gzxz" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">毕业学校</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="xx" type="text" value="${ygxx.byxx }" name="byxx"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">专业</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="zy" type="text" value="${ygxx.zy }" name="zy" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">毕业时间</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="bysj" type="text" value="${ygxx.bysj }" name="bysj"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">最高学历</label>
								<div class="controls">
								  <input class="input-xlarge disabled"disabled=""  id="zgxl" type="text" value="${ygxx.zgxl }" name="zgxl"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">学历名称</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="xlmc" type="text" value="${ygxx.xwmc }" name="xwmc"/>
								</div>
							  </div>
							  
							  <div class="control-group">
								<label class="control-label">政治面貌</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="zzmm" type="text" value="${ygxx.zzmm }" name="zzmm" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">入党时间</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="rdsj" type="text" value="${ygxx.rdsj }" name="rdsj" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">党组织关系</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="dzzgx" type="text" value="${ygxx.dzzgx }" name="dzzgx" />
								</div>
							  </div>
						</div>
						<div class="control-group" style="width: 100%">
								<label class="control-label">爱好特长</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" style="width: 90%" id="ahtc" type="text" value="${ygxx.grtc }" name="grtc" />
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
								  <input class="input-xlarge disabled" disabled="" id="txdz" type="text" value="${ygdz.txdz }" name="txdz"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">邮 编</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled="" id="yb" type="text" value="${ygdz.yb }" name="yb"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">现住地址</label>
								<div class="controls">
								  <input class="input-xlarge disabled"disabled=""  id="xzdz" type="text" value="${ygdz.xzdz }" name="xzdz" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">住宅电话</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled=""  id="zzdh" type="text" value="${ygdz.zzdh }" name="zzdh" />
								</div>
							  </div>
							  </div>
							  <div class="" style="width: 50%;float: right;background-color: #fff;">
							  <div class="control-group">
								<label class="control-label">移动电话</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled=""  id="yddh" type="text" value="${ygdz.yddh }" name="yddh"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">紧急联系人及电话</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled=""  id="jjlx" type="text" value="${ygdz.jjlxrdh }" name="jjlxrdh"/>
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">个人邮箱</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled=""  id="gryx" type="text" value="${ygdz.grdzyj }" name="grdzyj" />
								</div>
							  </div>
							  <div class="control-group">
								<label class="control-label">公司邮箱</label>
								<div class="controls">
								  <input class="input-xlarge disabled" disabled=""  id="gsyx" type="text" value="${ygdz.gsdzyj }" name="gsdzyj" />
								</div>
							  </div>
							  </div>
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
<script type="text/javascript">
//判断信息是否合法
function checkdata(){
	var msg="";
	var csrq=document.getElementById("csrq").value;
	var bysj=document.getElementById("bysj").value;
	var cjgzsj=document.getElementById("cjgzsj").value;
	var rdsj=document.getElementById("rdsj").value;
	var ygmc=document.getElementById("ygmc").value;
if(ygmc==""){
	msg+="姓名、";
	
}
if(bysj==""){
	msg+="毕业时间、";
	
}
if(cjgzsj==""){
	msg+="参加工作时间、";
	
}
if(csrq==""){
	msg+="出生日期、";
	
}
	if(msg!=""){
		alert(msg+"不能为空！");
		return false;
	}
}

</script>
</html>