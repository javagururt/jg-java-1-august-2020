package com.javaguru.student_maksim_morozov.lesson_13.level_2_intern;

import java.util.Optional;

interface API {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
        throws AccessDeniedException;
}
