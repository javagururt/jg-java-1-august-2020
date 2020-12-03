package com.javaguru.student_ivan_shulga.lesson_13.level_2_intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        test.shouldNotThrowExceptionWhenCredentialsHasAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() { // когда нет  роли тест не проходит
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

    public void shouldNotThrowExceptionWhenCredentialsHasAppropriateRole() { // когда есть роль тест проходит
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = Arrays.asList(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

}

/*
Как правильно тестировать код, который может выкинуть ошибку?

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApi(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

}
 */