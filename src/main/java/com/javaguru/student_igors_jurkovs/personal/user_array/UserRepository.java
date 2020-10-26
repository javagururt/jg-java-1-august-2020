package com.javaguru.student_igors_jurkovs.personal.user_array;

public interface UserRepository {

    User save(User user);

    User findById(String id);

}
