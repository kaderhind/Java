app.factory('TourneeService',['$http','$q',function($http,$q){
    var factory = {};
    factory.getTournee = function(produit,typeZone) {
      var defer = $q.defer();
      $http.get('http://localhost:8080/planification/Tournees/',
      {
        params:{
          "produit":produit,
          "zoning":typeZone
        }
      })
        .success(function(data) {
          console.log(data);
          defer.resolve(data)
        })
      return defer.promise;
    }

    factory.getTourneeByLot=function(lot){
      var defer = $q.defer();
      $http.get('http://localhost:8080/planification/TourneesByLot',
      {
        params:{
          "lot_num":lot.lotPK.numero,
          "pol_type":lot.lotPK.type
        }
      })
        .success(function(data) {
          console.log(data);
          defer.resolve(data)
        })
      return defer.promise;
    }
    factory.getTourneePlaning=function(produit,typeZone){
      var defer = $q.defer();
      $http.get('http://localhost:8080/planification/TourneesPalnification/',
      {
        params:{
          "produit":produit,
          "zoning":typeZone
        }
      })
        .success(function(data) {
          console.log(data);
          defer.resolve(data)
        })
      return defer.promise;
    }
    return factory;
  }]);

