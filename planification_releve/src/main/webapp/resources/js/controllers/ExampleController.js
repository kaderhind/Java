app.controller("ExampleController",['$scope','LotService','ZoneService','ProduitService','TourneeService',
    'ReleveurService','PlanificationService','$http',function($scope,LotService,ZoneService,
      ProduitService,TourneeService,ReleveurService,PlanificationService,$http){

    var currentDay= new Date();
    $scope.currentProduit=currentDay.getFullYear()*100+(currentDay.getMonth()+1);
    console.log("le produit courant",$scope.currentProduit);
    $scope.Types = ['particulier', 'admin', 'indus'];
  	$scope.getLots = function(selectionType) {
      if (selectionType !== undefined || selectionType !== null) {
        console.log("c'est le type de lot",selectionType);
        LotService.getLots(selectionType).then(function(data) {
          $scope.Lots = data;
        });

      }
    }

    $scope.getZones=function(){
    	ZoneService.getZones().then(function(data){
    		$scope.Zones=data;
    	})
    }
    $scope.getZones();

    $scope.getProduits = function(selectionLot,selectionFourniture,selectionType) {
      if (selectionLot !== undefined || selectionLot !== null) {
        ProduitService.getProduits(selectionLot,selectionFourniture,selectionType)
        .then(function(data) {
          $scope.Produits = data;
        });
      }
    }

    $scope.save=function(test){
      if(test !== undefined){
        TourneeService.getTournee(test.produit,test.typeZone)
        .then(function(data) {
          $scope.Tournees = data;
          
        });
        ReleveurService.getReleveurs().then(function(data){
          $scope.Releveurs=data;
        })

      } 
    }
    

  $scope.send=function(B){
   var data=angular.toJson($scope.Tournees);
    var config= {
                headers : {
                    'Content-Type': 'application/json'
                }
            }

    $http.post('http://localhost:8080/planification/save/',data,config)
          .success(function(data,status,headers,config){
            console.log("c est le success",data);
          })
          .error(function(data,status,headers,config){
            console.log("c'est l erreur",data);
          })   
    }// fin de la fonction send



  }]);
