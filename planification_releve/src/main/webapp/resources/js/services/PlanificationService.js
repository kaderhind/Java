 app.factory('PlanificationService',['$http','$q',function($http,$q){
      var factory = {};
    factory.sendPlaning = function(selectionType) {
      console.log("ici c'est le service",selectionType);
      var defer = $q.defer();
      $http.post('http://localhost:8080/planification/save/',selectionType)
        .success(function(data) {
          console.log(data);
          defer.resolve(data)
        })
      return defer.promise;
    }
    return factory;
  }]);