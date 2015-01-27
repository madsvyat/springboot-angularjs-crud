(function (angular) {
    angular.module("App.controllers", []);
    angular.module("App.services", []);
    angular.module("App", ["ngResource", "App.controllers", "App.services"]);
}(angular));