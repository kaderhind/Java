 app.factory('ZoneService',['$http','$q',function($http,$q){
    var factory={};
    factory.getZones=function(){
      var defer=$q.defer();
      $http.get('http://localhost:8080/planification/zones')
        .success(function(data) {
          defer.resolve(data)
        })
      return defer.promise;
    }
    return factory;
  }]);