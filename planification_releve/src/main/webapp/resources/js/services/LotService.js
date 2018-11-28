 app.factory('LotService',['$http','$q',function($http,$q){
      var factory = {};
    factory.getLots = function(selectionType) {
      console.log("ici c'est le service",selectionType);
      var defer = $q.defer();
      $http.get('http://localhost:8080/planification/lots/',{
        params:{
          "type":selectionType
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