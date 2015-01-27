(function (angular) {
    var UserController = function ($scope, User) {
        $scope.users = [];
        $scope.loadAll = function() {
            User.query(function(result) {
                $scope.users = result;
            });
        };
        $scope.loadAll();

        $scope.create = function () {
               User.save($scope.user,
                function () {
                    $scope.loadAll();
                    $('#saveUserModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            $scope.user = User.get({id: id});
            $('#saveUserModal').modal('show');
        };

        $scope.delete = function (id) {
            $scope.user = User.get({id: id});
            $('#deleteUserConfirmation').modal('show');
        };

        $scope.confirmDelete = function (id) {
            User.delete({id: id},
                function () {
                    $scope.loadAll();
                    $('#deleteUserConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.user = {name: null, age: null, isAdmin: null, createdDate: null, id: null};
        };
    };

    UserController.$inject = ['$scope', 'User'];
    angular.module("App.controllers").controller("UserController", UserController);
}(angular));