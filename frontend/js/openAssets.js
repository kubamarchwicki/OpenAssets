angular.module('openAssets', ['ngResource']).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:InitializeForms, templateUrl:'home.html'}).
      otherwise({redirectTo:'/'});
  });

function InitializeForms($scope, $http) {
  $http.get(window.location.pathname + 'examples/input.json').success(
    function(data, status, headers, config) {
      $scope.docimages = data.images;
    }
  );
}
 