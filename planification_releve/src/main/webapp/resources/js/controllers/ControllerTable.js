app.controller("ControllerTable",['$scope',function($scope){

    $scope.submit=function(){
      console.log("les donnes sont",$scope.tournee.releveur);
    }

  }]);