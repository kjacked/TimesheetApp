'use strict';

/**
 * @ngdoc function
 * @name timeSheetApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the timeSheetApp
 */
angular.module('timeSheetApp')
  .controller('TimesheetCtrl', function ($http, $scope) {



    $scope.timecard = {
      "email":"melanie@zipcoder.io",
      "startTime":"9:01pm",
      "endTime":"9:00am"
    };

    $scope.addEntry = function(timecard){
      console.log(timecard);
      TimeCard.addEntry(timecard);
    }

    $scope.submit = function(timecard){
      console.log(timecard);
      TimeCard.submit(timecard);
    }
    $scope.responses = [];
    $http.get("http://localhost:8080/timesheets/1").success(function(response){

      $scope.responses = response.data;
      console.log("is it working?");
      console.log(response);
    }).error(function(error){
      console.log(error);
    })
  });



