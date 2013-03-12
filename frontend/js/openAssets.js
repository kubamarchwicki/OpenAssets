angular.module('openAssets', []).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:InitializeForms, templateUrl:'home.html'}).
      otherwise({redirectTo:'/'});
  });

function InitializeForms($scope) {
	$scope.docimages = [
	    {"url": "examples/docimage1.jpg"},
	    {"url": "examples/docimage2.gif"},
	    {"url": "examples/docimage3.jpg"}
	    
  ];
  //TODO: retrieve list of images and add them to the model so they are shown in the view (using databinding)
}
 