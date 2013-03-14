angular.module('openAssets', ['ngResource']).
  config(function($routeProvider) {
    $routeProvider.
      when('/', {controller:OpenAssetsCtrl, templateUrl:'home.html'}).
      otherwise({redirectTo:'/'});
  });

function OpenAssetsCtrl($scope, $http) {

  retrieveImageInfo = function(){
    return $http.get('rest/document/random');
  }   

 var temporaryWrapper = function(documenturls) {
     var tempresult = [];
     var counter = 1;
     data.images.foreach(function(url) {
         tempresult.push({
             id: "page"+counter,
             url: url
         });
         counter++;
     });;


 }

  bindImageInfo = function(data, status, headers, config) {
    $scope.document_id = data.document_id;
     scope.docimages = wrapdocuments(tempresult);

    $scope.form_definition = app.form_definition;
  } 


  retrieveExampleOutput = function(){
    return $http.get('examples/output.json');
  }
  
  postDocument = function(document){
    return $http.post(window.location.pathname + 'result', document);
  }
  
  documentUpdateSuccesfull = function(data, status, headers, config) {
    console.log("Document updated succesfully");
  }
  
  documentUpdateError = function(data, status, headers, config) {
    console.warn("Document not updated - Statuscode: " + status);
  }
  
  updateDocument =  function(data, status, headers, config) {
    postDocument(data).success(documentUpdateSuccesfull).error(documentUpdateError);
  }
  
  $scope.saveInput = function(){
    retrieveExampleOutput().success(updateDocument);
  };
  
   retrieveImageInfo().success(bindImageInfo);
}


