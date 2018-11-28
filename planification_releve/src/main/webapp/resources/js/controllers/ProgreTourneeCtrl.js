app.controller('ProgreController',['$scope','LotService','TourneeService','$uibModal', '$log','$interval',
	function($scope,LotService,TourneeService,$uibModal, $log,$interval){
		$scope.showLot=false;
		$scope.val=1;
		$scope.getLotsByType=function(type,fourniture){
			
			if(type !== undefined && fourniture !== undefined){
				console.log("le type ",type);
				console.log("la fourniture ",fourniture);
				LotService.getLots(type).then(function(data){
					$scope.listLot=data;
					$scope.showLot=true;
				});
				$scope.showLot=true;
			}

		}
		$scope.getTourneeByLot=function(lot){
			if(lot!== undefined){
				$scope.lot=lot;
				TourneeService.getTourneeByLot(lot).then(function(data){
					$scope.listTournee=data;
				});

			}
		}

		$interval(function(){
			if($scope.lot!== undefined){
				$scope.getTourneeByLot($scope.lot);
			}
		}, 900000);

		  $scope.animationsEnabled = true;
		  $scope.open = function (size,releveur) {

		    var modalInstance = $uibModal.open({
		      animation: $scope.animationsEnabled,
		      templateUrl: 'myModalContent.html',
		      controller: 'ModalInstanceCtrl',
		      size: size,
		      resolve: {
		        items: function () {
		          return releveur;
		        }
		      }
		    });
		}
		  $scope.toggleAnimation = function () {
		    $scope.animationsEnabled = !$scope.animationsEnabled;
		  };
	}
]);

app.controller('ModalInstanceCtrl', function ($scope, $uibModalInstance, items) {

  $scope.items = items;
  $scope.labels = ["Download Sales", "In-Store Sales", "Mail-Order Sales"];
  $scope.data = [300, 500, 100];
  $scope.cancel = function () {
    $uibModalInstance.dismiss('cancel');
  };
});