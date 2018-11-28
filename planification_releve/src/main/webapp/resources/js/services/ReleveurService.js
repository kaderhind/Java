app.factory('ReleveurService',['$http','$q',function($http,$q){
    var factory = {};
    factory.getReleveurs = function(selectionType) {
      var defer = $q.defer();
      $http.get('http://localhost:8080/planification/Releveurs/')
           .success(function(data) {
            console.log(data);
            defer.resolve(data)
          })
      return defer.promise;
    }
    return factory;
  }]);