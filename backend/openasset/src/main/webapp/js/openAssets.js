angular.module('openAssets', ['ngResource']).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:OpenAssetsCtrl, templateUrl:'home.html'}).
      otherwise({redirectTo:'/'});
  });

function OpenAssetsCtrl($scope, $http) {

   var selectPage = function(page_id) {
        $(".document-container").hide();
        $(".page_link").removeClass("active");
        $("#link_"+page_id).addClass("active");
        $("#"+page_id).show();
   }


  retrieveImageInfo = function(){
    return $http.get('rest/document/random');
  }   
  
  bindImageInfo = function(data, status, headers, config) {
    $scope.docimages = data.images;
    $scope.form_definition = app.form_definition;
    $scope.userinput = {
      'document_id' : data.document_id,
      'ep_object_id' : data.ep_object_id
    };
  } 

  retrieveExampleOutput = function(){
    return $http.get('examples/output.json');
  }
  
  postDocument = function(document){
    return $http.post('rest/document/', document);
  }
  
  documentUpdateSuccesfull = function(data, status, headers, config) {
    console.log("Document updated succesfully");
  }
  
  documentUpdateError = function(data, status, headers, config) {
    console.warn("Document not updated - Statuscode: " + status);
  }
  
  updateDocument =  function(data, status, headers, config) {
    postDocument($scope.userinput).success(documentUpdateSuccesfull).error(documentUpdateError);
  }
  
  $scope.saveInput = function(){
    retrieveExampleOutput().success(updateDocument);
  };

  $scope.page_selected = selectPage;


  retrieveImageInfo().success(bindImageInfo);

  selectPage("page1");
}


