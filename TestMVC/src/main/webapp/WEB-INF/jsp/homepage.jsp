<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Homepage</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
        
        
    </head>
</html>
<body  style="background-color:#D3D3D3" >
 <div ng-app="myApp" ng-controller="myCtrl">
 <h2 style="text-align:center" >Placement Management System</h2>
 
 <div class="container">
	<div class="row">
        <div class="span12">
    		<div class="" id="loginModal">
              <div class="modal-header">
                
                <h3>Sign In</h3>
              </div>
              <div class="modal-body">
                <div class="well">
                  
                  <div id="myTabContent" class="tab-content">
                    <div class="tab-pane active in" id="login">
                      <form class="form-horizontal" action='' method="POST">
                        <fieldset style="background-color:#00FFFF">
                          <div id="legend">
                            <legend class="">Login As</legend>
                            <input type="radio" name="who">Student</input>
                            <input type="radio" name="who">Admin</input>
                          </div>    
                          <div class="control-group">
                            <!-- Username -->
                            <label class="control-label"  for="username">Username</label>
                            <div class="controls">
                              <input type="text" id="username" ng-model="username" placeholder="" class="input-xlarge">
                            </div>
                          </div>
     
                          <div class="control-group">
                            <!-- Password-->
                            <label class="control-label" for="password">Password</label>
                            <div class="controls">
                              <input type="password" id="password" ng-model="password" placeholder="" class="input-xlarge">
                            </div>
                          </div>
     
     
                          <div class="control-group">
                            <!-- Button -->
                            <div class="controls">
                              <button class="btn btn-success">Login</button>
                            </div>
                          </div>
                        </fieldset>
                      </form>                
                    </div>
 </div>
                    <br/>
                    <h3>Student Sign Up</h3>
                    <div class="tab-pane fade" id="create" ng-app="myApp2" ng-controller="myCtrl2">
                      <form id="tab">
                        <label>ID (Username)</label><br/>
                        <input type="text" value="" class="input-xlarge" ng-model="id"><br/><br/>
                        <label>Full Name</label><br/>
                        <input type="text" value="" class="input-xlarge" ng-model="fullname"><br/><br/>
                        <label>Password</label><br/>
                        <input type="text" value="" class="input-xlarge" ng-model="password"><br/><br/>
                        <label>Branch</label><br/>
                        <input type="text" value="" class="input-xlarge" ng-model="branch"><br/><br/>
                        <label>Email</label><br/>
                        <input type="text" value="" class="input-xlarge" ng-model="email"><br/><br/>
     
                        <div>
                          <button class="btn btn-primary">Create Account</button>
                        </div>
                      </form>
                    </div>
                </div>
              </div>
            </div>
        </div>
	</div>
</div>
</div>
<script>
        var app = angular.module('myApp', []);
        app.controller('myCtrl', function($scope) {
            $scope.username= "";
            $scope.password= "";
        });
        var app2 = angular.module('myApp2', []);
        app.controller('myCtrl2', function($scope) {
            $scope.id= "";
            $scope.fullname= "";
            $scope.password= "";
            $scope.branch= "";
            $scope.email= "";
        });
        </script>
</body>
</html>