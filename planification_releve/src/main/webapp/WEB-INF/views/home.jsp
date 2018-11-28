<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Relève</title>

<!-- Bootstrap Core CSS -->

<link href="<c:url value='/resources/css/bootstrap.min.css' />"
	rel="stylesheet" />
    <link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/bootstrap-select.min.css' /> ">
<!-- MetisMenu CSS -->
<link href="<c:url value='/resources/css/metisMenu.min.css' />"
	rel="stylesheet" />

<!-- Custom CSS -->
<link href="<c:url value='/resources/css/sb-admin-2.css' />"
	rel="stylesheet" />

<link href="<c:url value='/resources/css/shop-item.css' />"
	rel="stylesheet" />
	
<%-- <link rel="stylesheet" type="text/css"
    href="<c:url value='/resources/css/business-casual.css'/>" /> --%> 
<link rel="stylesheet" type="text/css"
    href="<c:url value='/resources/css/style.css' />" />

<link rel="stylesheet" type="text/css"
    href="<c:url value='/resources/css/angular-chart.css' />" /> 



<!-- Custom Fonts -->
<link
	href="<c:url value='/resources/font-awesome/css/font-awesome.min.css' />"
	rel="stylesheet" type="text/css" />

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->


</head>

<body ng-app="MyApp">

	<div id="wrapper" ng-controller="ProgreController">
		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html"> 
					<img alt="" src="<c:url value='/resources/img/logo.jpg' />" width="60px" height="30px" class="pull-left">
				</a>
			</div>
			<!-- /.navbar-header -->

			<ul class="nav navbar-top-links navbar-right">
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i
						class="fa fa-calendar fa-fw"></i> <i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu">
						<li><a href="#DispalyPlan">Afficher planification</a></li>
						<li><a href="#Planifier">Planifier</a></li>
					</ul> <!-- /.dropdown-messages --></li>
				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-tasks fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-tasks">
					</ul> <!-- /.dropdown-tasks --></li>
				<!-- /.dropdown -->

				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#userProfil"><i class="fa fa-user fa-fw"></i>
								User Profile</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
								Logout</a></li>
					</ul> <!-- /.dropdown-user --></li>
				<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->
			<!-- /.navbar-static-side -->
		</nav>

		<div ng-view></div>

		<!-- Page Content -->

		<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<c:url value='/resources/js/jquery.js'/>"></script>

	<!-- Bootstrap Core JavaScript -->
	<script type="text/javascript"
		src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
	 <script type="text/javascript"
		src="<c:url value='/resources/js/metisMenu.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/sb-admin-2.js'/>"></script> 

	<script type="text/javascript"
		src="<c:url value='/resources/js/bootstrap-select.min.js'/>"></script>

	<script type="text/javascript"
		src="<c:url value='/resources/angular/angular.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/angular/angular-route.min.js'/>"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/angular/angular-animate.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/angular/ui-bootstrap.min.js' />"></script>
	<%-- <script type="text/javascript"
		src="<c:url value='/resources/angular/angular-chart.min.js' />"></script> --%>

	<script type="text/javascript"
		src="<c:url value='/resources/js/app.js'/>"></script>
	<!-- Les services -->
	<script type="text/javascript"
		src="<c:url value='/resources/js/services/LotService.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/services/TourneeService.js' />"></script>

	<script type="text/javascript"
		src="<c:url value='/resources/js/services/PlanificationService.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/services/ProduitService.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/services/ReleveurService.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/services/ZoneService.js' />"></script>

	<script type="text/javascript"
		src="<c:url value='/resources/js/controllers/DatepickerPopupDemoCtrl.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/controllers/ExampleController.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/controllers/PaginationDemoCtrl.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/controllers/ControllerTable.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/controllers/ProgreTourneeCtrl.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/resources/js/controllers/AffichagePlanCtrl.js' />"></script>
	
</body>

</html>
