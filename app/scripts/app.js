'use strict';

/**
 * @ngdoc overview
 * @name timeSheetApp
 * @description
 * # timeSheetApp
 *
 * Main module of the application.
 */
angular
  .module('timeSheetApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/TimeSheet.html',
        controller: 'TimesheetCtrl',
        controllerAs: 'timesheet'
      })
      .otherwise({
        redirectTo: '/'
      });
  });
