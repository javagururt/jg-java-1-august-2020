package com.javaguru.student_ivan_shulga.lesson_13.level_2_intern;

class AccessDeniedException extends Exception {

}

/*
Для описания ошибки обозначающей, что у пользователя нет
прав вызывать метод findByUid() нужно создать свой класс ошибки:

class AccessDeniedException extends Exception {

}

И изменить сигнатуру метода findByUid() в интерфейсе следующим образом:

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}

Теперь из сигнатуры метода следует, что данный метод может
вернуть ("кинуть") ошибку типа AccessDeniedException.
 */