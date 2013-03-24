angular.module('openAssets', ['ngResource']).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:OpenAssetsCtrl, templateUrl:'home.html'}).
      when('/thankyou', {controller:ThankYouCtrl, templateUrl:'thankyou.html'}).
      otherwise({redirectTo:'/'});
  });

function ThankYouCtrl($scope, $location){
  $scope.fillAnother = function(){
    $location.path("/");
  };
}

function OpenAssetsCtrl($scope, $location, $routeParams, $http) {

   var currentIndex = 1;
   
   var selectPage = function(index) {
        $(".document-container").hide();
        $(".page_link").removeClass("active");
        $("#link_page"+index).addClass("active");
        $("#page"+index).show();
        
        currentIndex = index;
   }
   
  retrieveRandomImageInfo = function(){
    return $http.get('rest/document/random');
  }   
  
  bindImageInfo = function(data, status, headers, config) {
    data.images.forEach(function(docimage) {
        if(docimage.id === "page1") {
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

  retrieveExampleOutput = function(){
    return $http.get('examples/output.json');
  }
  
  postDocument = function(document){
    return $http.post('rest/transcription/', document);
  }

  documentUpdateSuccesfull = function(data, status, headers, config) {
    console.log("Document updated succesfully");
    $location.path('/thankyou');
  }

  documentUpdateError = function(data, status, headers, config) {
    console.warn("Document not updated - Statuscode: " + status);
    $location.path('/thankyou');
  }

  $scope.saveInput = function($location){
    postDocument($scope.userinput).success(documentUpdateSuccesfull).error(documentUpdateError);  
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

  retrieveRandomImageInfo().success(bindImageInfo);

}


