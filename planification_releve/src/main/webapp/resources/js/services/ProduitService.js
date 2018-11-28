 app.factory('ProduitService',['$http','$q',function($http,$q){
  	var factory={};
  	factory.getProduits=function(selectionLot,selectionFourniture,selectionType){
      console.log("ici le lot",selectionLot);
  		var defer=$q.defer();
  		$http.get('http://localhost:8080/planification/produit',
      {
        params:{
          "fourniture":selectionFourniture,
          "numero":selectionLot,
          "type":selectionType
        }
      })
        .success(function(data) {
          defer.resolve(data)
        })
        .error(function(data,status,headers,config){
          switch(status){
            case 400:{
              break;
            }
          }
          console.log(data,status);
        });
  		return defer.promise;
  	}
  	return factory;
  }]);