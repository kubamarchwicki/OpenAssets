'use strict';

/* App Module */

angular.module('openAssets', []).
    config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/assets', {templateUrl: 'partials/asset-list.html',   controller: AssetsListController}).
        when('/assets/:assetId', {templateUrl: 'partials/asset-detail.html', controller: AssetsDetailController}).
            otherwise({redirectTo: '/assets'});
    }]);
