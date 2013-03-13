'use strict';

/* Controllers */

function AssetsListController($scope) {
    $scope.assets = [
        {"id" :"153743001", "url" : "http://epanstwo.net/docs/imgs/153743/153743001.png"},
        {"id" :"153743002", "url" : "http://epanstwo.net/docs/imgs/153743/153743003.png"},
        {"id" :"153743003", "url" : "http://epanstwo.net/docs/imgs/153743/153743002.png"},
        {"id" :"153743004", "url" : "http://epanstwo.net/docs/imgs/153743/153743004.png"},
        {"id" :"153743005", "url" : "http://epanstwo.net/docs/imgs/153743/153743005.png"},
        {"id" :"153743006", "url" : "http://epanstwo.net/docs/imgs/153743/153743006.png"}
    ];
}

function AssetsDetailController($scope){
    $scope.assetId  = $routeParams.assetId;
}


