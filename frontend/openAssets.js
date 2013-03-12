angular.module('openAssets', []).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:InitializeForms, templateUrl:'home.html'}).
      otherwise({redirectTo:'/'});
  });

function InitializeForms($scope) {
  //TODO: retrieve list of images and add them to the model so they are shown in the view (using databinding)
}
 