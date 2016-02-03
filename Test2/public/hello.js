var app = angular.module('project', []);

app.controller("HelloController", function Hello($scope, $http) {
	$http.get('http://localhost:8080/games')
	.success(function(data) {
		$scope.games = data;
	});
});