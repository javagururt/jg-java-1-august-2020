package com.javaguru.student_igors_jurkovs.personal.user_array;

import java.util.UUID;

class UserArrayRepository implements UserRepository {

    private final User[] database = new User[10];

    @Override
    public User save(User user) {
        for (int i = 0; i < database.length; i++) {
            if (database[i] == null) {
                user.setId(UUID.randomUUID().toString());
                database[i] = user;
                break;
            }
        }

        return user;
    }

    @Override
    public User findById(String id) {
        for (User user : database) {
            if (user != null && user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
