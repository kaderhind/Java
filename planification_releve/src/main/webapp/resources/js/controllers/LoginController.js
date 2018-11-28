app.controller("LoginController",['$scope','$http',function($scope,$http){
	$scope.login=function(){
	var data=angular.toJson($scope.responsableZone);
	var config={
		headers: {
			'Content-Type':'application/json'
		}
	}

	$http.post('http://localhost:8080/planification/login/',data,config)
          .success(function(data,status,headers,config){
            console.log("c est le success",data);
            redirectTo:'/home';
          })
          .error(function(data,status,headers,config){
            console.log("c'est l erreur",data);
          })
	}

}]);