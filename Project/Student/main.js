
        var app = angular.module('myApp', []);
        app.controller('myCtrl', function($scope) {
            $scope.username= "qwert";
            $scope.password= "gfdg";
			$scope.studSelected= "";
			$scope.adminSelected= "";
			$scope.login=function(){
				alert("You clicked login button!");
				//go to student dashboard
		}
				
        });
        
        app.controller('myCtrl2', function($scope,$http) {
            $scope.id= "";
            $scope.fullname= "asd";
            $scope.password= "";
            $scope.branch= "";
            $scope.email= "";
			$scope.signup=function(){
				
				//add student
				
		}
        });
		
		