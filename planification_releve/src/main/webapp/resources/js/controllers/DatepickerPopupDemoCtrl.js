app.controller('DatepickerPopupDemoCtrl', function ($scope) {
  $scope.zemar=0;
  $scope.aid=null;
  $scope.today = function() {
    if($scope.tournee.dernierDateLecture !== null)
    {
       var lastDate=$scope.tournee.dernierDateLecture.split('-');
        $scope.tournee.dateDebut =new Date(lastDate[0],lastDate[1]-1,lastDate[2]);
        interval=$scope.tournee.dateDebut.getDate()+30;
        $scope.tournee.dateDebut.setDate(interval);
        $scope.tournee.dateFin=$scope.tournee.dateDebut;
        $scope.aid=new Date($scope.tournee.dateDebut.getFullYear(),$scope.tournee.dateDebut.getMonth(),$scope.tournee.dateDebut.getDate())
    }else{
      $scope.aid=new Date();
    }
  };
  $scope.today();

  $scope.clear = function() {
    $scope.dt = null;
  };

  $scope.inlineOptions = {
    customClass: getDayClass,
    minDate: new Date(2016,3,01),
    showWeeks: true
  };

  
 
  if($scope.tournee.dernierDateLecture !== null){
    $scope.dateDebutOptions = {
    formatYear: 'yy',
    maxDate: new Date($scope.aid.getFullYear(),$scope.aid.getMonth(),$scope.aid.getDate()+1),
    minDate: new Date($scope.aid.getFullYear(),$scope.aid.getMonth(),$scope.aid.getDate()-1),
    startingDay: 1,
    language: 'fr'
    };

    $scope.dateFinOptions = {
    dateDisabled: disabledFin,
    formatYear: 'yy',
    maxDate: new Date($scope.aid.getFullYear(),$scope.aid.getMonth(),$scope.aid.getDate()+2),
    minDate: new Date($scope.aid.getFullYear(),$scope.aid.getMonth(),$scope.aid.getDate()-1),
    startingDay: 1,
    language: 'fr'
  };

  }
  else
  {
    $scope.dateDebutOptions = {
      formatYear: 'yy',
      maxDate: new Date(2017,01,01),
      minDate: new Date(2016,03,01),
      startingDay: 1,
      language: 'fr'
    };

  
 
   $scope.dateFinOptions = {
    dateDisabled: disabled,
    formatYear: 'yy',
    maxDate: new Date(2017,01,01),
    minDate: new Date(2016,03,01),
    startingDay: 1,
    language: 'fr'
  };

}

 /*  $scope.dateOptions = {
    dateDisabled: disabled,
    formatYear: 'yy',
    maxDate: new Date($scope.aid.getFullYear(),$scope.aid.getMonth(),$scope.aid.getDate()+30),
    minDate: new Date($scope.aid.getFullYear(),$scope.aid.getMonth(),$scope.aid.getDate()-10),
    startingDay: 1,
    language: 'fr'
  };*/

  // Disable weekend selection
  function disabledFin(data) {
      var date = data.date;
      mode = data.mode;
      if($scope.tournee.dateDebut !== null){
        return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6 || date.getDate() < $scope.tournee.dateDebut.getDate()|| date.getDate() > $scope.tournee.dateDebut.getDate()+1);
      }
      return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
  }

   function disabled(data) {
      var date = data.date;
      mode = data.mode;
      if($scope.tournee.dateDebut !== null){
        return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6 || date.getDate() > $scope.tournee.dateDebut.getDate() +2 
                                                      || date.getDate() <$scope.tournee.dateDebut.getDate());
      }
      return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
  }

    var caluclateNumber=function(firstDate,lastDate){
        var millisecondsPerDay = 1000 * 60 * 60 * 24;
        var millisBetween = firstDate.getTime() - lastDate.getTime();
        var days = millisBetween / millisecondsPerDay;
        return Math.floor(days);
    }
   $scope.NumberOfDays=function(){
      if ( $scope.tournee.dernierDateLecture !== null && $scope.tournee.dateDebut !== null){
        var lastDate=$scope.tournee.dernierDateLecture.split('-');
        lastDate=new Date(lastDate[0],lastDate[1]-1,lastDate[2]);
        return $scope.zemar=caluclateNumber($scope.tournee.dateDebut,lastDate);
      }
      return $scope.zemar=null;

  }

  /*$scope.toggleMin = function() {
    $scope.inlineOptions.minDate = $scope.inlineOptions.minDate ? null : new Date();
    $scope.dateOptions.minDate = $scope.inlineOptions.minDate;
  };

  $scope.toggleMin();
*/
  $scope.open2 = function() {
    $scope.popup2.opened = true;
    if($scope.tournee.dateFin !== null){
      $scope.tournee.dateFin=null;
    }
  };

   $scope.setDate = function(year, month, day) {
     $scope.dt = new Date(year, month, day);
     console.log("c est la date",$scope.dt);
   };

  $scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
  $scope.format = $scope.formats[0];
  $scope.altInputFormats = ['M!/d!/yyyy'];

  $scope.popup1 = {
    opened: false
  };

  $scope.popup2 = {
    opened: false
  };

  var tomorrow = new Date();
  tomorrow.setDate(tomorrow.getDate() + 1);
  var afterTomorrow = new Date();
  afterTomorrow.setDate(tomorrow.getDate() + 1);
  $scope.events = [
    {
      date: tomorrow,
      status: 'full'
    },
    {
      date: afterTomorrow,
      status: 'partially'
    }
  ];

  function getDayClass(data) {
    var date = data.date,
      mode = data.mode;
    if (mode === 'day') {
      var dayToCheck = new Date(date).setHours(0,0,0,0);

      for (var i = 0; i < $scope.events.length; i++) {
        var currentDay = new Date($scope.events[i].date).setHours(0,0,0,0);

        if (dayToCheck === currentDay) {
          return $scope.events[i].status;
        }
      }
    }

    return '';
  }
});