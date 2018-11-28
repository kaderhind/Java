<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">	
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<title>Insert title here</title>
	
	<!-- Bootstrap Core CSS -->
    <link href="<c:url value='/resources/css/bootstrap.min.css' />" rel="stylesheet"/>

    <!-- MetisMenu CSS -->
    <link href="<c:url value='/resources/css/metisMenu.min.css' />" rel="stylesheet"/>

    <!-- Custom CSS -->
    <link href="<c:url value='/resources/css/sb-admin-2.css' />" rel="stylesheet"/>

    <!-- Custom Fonts -->
    <link href="<c:url value='/resources/font-awesome/css/font-awesome.min.css' />" rel="stylesheet" type="text/css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	
</head>
<body ng-app="MyApp">
	<div class="container">
		<div class="row" ng-controller="LoginController">
			<div class="col-md-4 col-md-offset-4">
				<div class="login-panel panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">Se connecter</h3>
					</div>
					<div class="panel-body">
						<form  novalidate role="form">
							<fieldset>
								<div class="form-group">
									<input type="text" class="form-control" placeholder="login" ng-model="responsableZone.matricule"
										autofocus>
								</div>
								<div class="form-group">
									<input class="form-control" placeholder="Password"
										 type="password" ng-model="responsableZone.password">
								</div>
								<div class="checkbox">
									<label> <input name="remember" type="checkbox"
										value="Remember Me">Remember Me
									</label>
								</div>
								<!-- Change this to a button or input when using this as a form -->
								<!-- <button ng-click="login()" class="btn btn-lg btn-success btn-block">OK</button> -->
								<a href="#home" ng-click="login()" class="btn btn-lg btn-success btn-block">OK</a>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- jQuery -->
    <script src="<c:url value='/resources/js/jquery.js'/>"></script>

    <!-- Bootstrap Core JavaScript -->
    <script type="text/javascript" src='<c:url value='/resources/js/bootstrap.min.js'/>'></script>
    <script type="text/javascript" src="<c:url value='/resources/js/metisMenu.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/sb-admin-2.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/angular/angular.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/angular/angular-route.min.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/resources/angular/angular-animate.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/resources/angular/ui-bootstrap.min.js' />"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/app.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/js/controllers/LoginController.js' />"></script>
	
</body>
</html>