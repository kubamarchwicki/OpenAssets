var openAssets = angular.module('openAssets', [ 'ngResource' ]);

openAssets.config(function($routeProvider) {
	$routeProvider.when('/', {
		controller : function($scope, $location, $routeParams, $http, RandomImageInfo) {
			return OpenAssetsCtrl($scope, $location, $routeParams, $http, RandomImageInfo);
		},
		templateUrl : 'home.html'
	}).when('/asset/:documentId', {
		controller : function($scope, $location, $routeParams, $http, ImageInfoById) {
			return OpenAssetsCtrl($scope, $location, $routeParams, $http, ImageInfoById);
		},		
		templateUrl : 'home.html'
	}).when('/thankyou', {
		controller : ThankYouCtrl,
		templateUrl : 'thankyou.html'
	}).otherwise({
		redirectTo : '/'
	});
});

openAssets.service('RandomImageInfo', function($http) {
	return $http.get('rest/documents/random');
});

openAssets.service('ImageInfoById', function($http, $routeParams) {
	return $http.get('rest/documents/' + $routeParams.documentId);
});

function ThankYouCtrl($scope, $location) {
	$scope.fillAnother = function() {
		$location.path("/");
	};
}

function OpenAssetsCtrl($scope, $location, $routeParams, $http, Service) {

	var currentIndex = 1;

	var selectPage = function(index) {
		$(".document-container").hide();
		$(".page_link").removeClass("active");
		$("#link_page" + index).addClass("active");
		$("#page" + index).show();

		currentIndex = index;
	}

	bindImageInfo = function(data, status, headers, config) {
		data.images.forEach(function(docimage) {
			if (docimage.id === "page1") {
				docimage.button_class = "active";
			} else {
				docimage.page_class = "hidden-page";
			}
		});
		$scope.docimages = data.images;

		$scope.form_definition = app.form_definition;
		$scope.userinput = {
			'document_id' : data.document_id,
			'ep_object_id' : data.ep_object_id
		};

		$scope.is_last = function() {
			return (currentIndex == $scope.docimages.length);
		}
	}

	retrieveExampleOutput = function() {
		return $http.get('examples/output.json');
	}

	postDocument = function(document) {
		return $http.post('rest/transcriptions/', document);
	}

	documentUpdateSuccesfull = function(data, status, headers, config) {
		console.log("Document updated succesfully");
		$location.path('/thankyou');
	}

	documentUpdateError = function(data, status, headers, config) {
		console.warn("Document not updated - Statuscode: " + status);
		$location.path('/thankyou');
	}

	$scope.saveInput = function($location) {
		postDocument($scope.userinput).success(documentUpdateSuccesfull).error(
				documentUpdateError);
		$scope.userinput = {
			'document_id' : $scope.userinput.document_id,
			'ep_object_id' : $scope.userinput.ep_object_id
		};
	};

	$scope.page_selected = selectPage;
	$scope.is_last = false;
	$scope.next_page = function(event) {
		event.preventDefault();
		selectPage(currentIndex + 1);
	}

	Service.success(bindImageInfo);		

}
