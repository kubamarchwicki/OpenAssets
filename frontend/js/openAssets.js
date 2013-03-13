angular.module('openAssets', ['ngResource']).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:OpenAssetsCtrl, templateUrl:'home.html'}).
      otherwise({redirectTo:'/'});
  });

function OpenAssetsCtrl($scope, $http) {
  $http.get(window.location.pathname + 'examples/input.json').success(
    function(data, status, headers, config) {
      $scope.ep_object_id = data.ep_object_id;
      $scope.document_id = data.document_id;
      $scope.docimages = data.images;
    }
  );
  
  $scope.saveInput = function(){
    //Todo: Store the user-entered data on the server.
  };
}
 