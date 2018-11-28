var app=angular.module("MyApp", ['ngAnimate', 'ui.bootstrap','ngRoute']);

app.config(['$routeProvider',function($routeProvider){
	$routeProvider
	.when('/default',{
		templateUrl:'default'
	})
	.when('/userProfil',{
		templateUrl:'userProfil'
		
	})
	.when('/DispalyPlan',{
		templateUrl:'planification'
	})
	.when('/Planifier',{
		templateUrl:'Planifier'
	})
	
	.otherwise({redirectTo:'/default'});
}]);

