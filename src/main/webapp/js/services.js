/**
 * Created by N1 on 27.01.2015.
 */
(function (angular) {
    var UserFactory = function ($resource) {
        return $resource('/users/:id', {
            id: '@id'
        }, {
            save:   { 
                method:'POST'
            },
            update: {
                method: "POST"
            },
            remove: {
                method: "DELETE"
            },
            get: {
                method: "GET",
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    data.createdDate = new Date(data.createdDate);
                    return data;
                }
            }
        });
    };

    UserFactory.$inject = ['$resource'];
    angular.module("App.services").factory("User", UserFactory);
}(angular));