app.controller("AffichagePlanCtrl",['$scope','LotService','ZoneService','ProduitService','TourneeService',
  function($scope,LotService,ZoneService,ProduitService,TourneeService){

    $scope.zemar=0;
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

    $scope.afficher=function(test){
      console.log("opss je suis dans l'affichage ")
      if(test.typeZone === undefined){
        test.typeZone=null;
        TourneeService.getTourneePlaning(test.produit,test.typeZone)
        .then(function(data) {
          $scope.Tournees = data;
          
        });
      }
      
    }
    
    var caluclateNumber=function(firstDate,lastDate){
        var millisecondsPerDay = 1000 * 60 * 60 * 24;
        var millisBetween = firstDate.getTime() - lastDate.getTime();
        var days = millisBetween / millisecondsPerDay;
        return Math.floor(days);
    }

    $scope.NumberOfDays=function(tournee){
      console.log("coco je suis dans NumberOfDays",tournee.reference);
      if ( tournee.dernierDateLecture !== null && tournee.dateDebut !== null){
        var lastDate= tournee.dernierDateLecture.split('-');
        lastDate=new Date(lastDate[0],lastDate[1]-1,lastDate[2]);
        var firstDate=tournee.dateDebut.split('-');
        firstDate=new Date(firstDate[0],firstDate[1]-1,firstDate[2])
        console.log("la date de debut",tournee.dateDebut)
        return $scope.zemar=caluclateNumber(firstDate,lastDate);
      }
      return $scope.zemar=null;
    }
}]);
