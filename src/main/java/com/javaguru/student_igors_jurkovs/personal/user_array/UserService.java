package com.javaguru.student_igors_jurkovs.personal.user_array;

class UserService {

    private final UserRepository repository;

    UserService(UserRepository repository) {
        this.repository = repository;
    }

    void saveUser(User user) {
        //validation
        repository.save(user);
    }

    User findById(String id) {
        return repository.findById(id);
    }
}
