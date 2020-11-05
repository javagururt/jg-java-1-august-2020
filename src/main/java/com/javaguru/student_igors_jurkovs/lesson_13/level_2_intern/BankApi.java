package com.javaguru.student_igors_jurkovs.lesson_13.level_2_intern;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}