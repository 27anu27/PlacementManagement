
        var app = angular.module('myApp', ['ngRoute']);
		app.config(function($routeProvider) {
        $routeProvider

            // route for the home page
            .when('/', {
                templateUrl : 'pages/home.html',
                controller  : 'mainController'
            })

            // route for the about page
            .when('/about', {
                templateUrl : '../Student/StudentIndex.html',
                controller  : 'aboutController'
            })

            // route for the contact page
            .when('/contact', {
                templateUrl : '../Admin/AdminIndex.html',
                controller  : 'contactController'
            });
    });

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        app.controller('myCtrl', function($scope,$location,$http) {
			
            $scope.username= "qwert";
            $scope.password= "gfdg";
			
			
			$scope.login=function(){
				//alert("You clicked login button!");
				var path;
				if($scope.who){
				//true then student login
				alert("Student Login");
				path = '../Student/StudentIndex.html';
			}
			else{
				//false then admin login
				alert("Admin Login");
				path = '../Admin/AdminIndex.html';
			
			}
			$location.url(path);
		}
				
        });
        
        app.controller('myCtrl2', function($scope,$http) {
            $scope.id= "";
            $scope.fullname= "asd";
            $scope.password= "";
            $scope.branch= "";
            $scope.email= "";
			$scope.signup=function(){
				alert("New Student Created, now login using same credentials.");
				//add student
				
		}
        });
		
		