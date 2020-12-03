package com.javaguru.student_ivan_shulga.lesson_13.level_2_intern;

import java.util.Objects;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }

}

/*
Для описания клиентов банка, данных к которым мы хотим дать доступ,
создайте класс BankClient:

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    // созжайте конструктор класса, в котором вы получите значения указанных свойств

    // создайте get() методы для каждого из свойств

}
 */