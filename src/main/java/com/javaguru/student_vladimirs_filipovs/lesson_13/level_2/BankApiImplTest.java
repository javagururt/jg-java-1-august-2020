package com.javaguru.student_vladimirs_filipovs.lesson_13.level_2;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
     BankApiImplTest bankApiImplTest = new BankApiImplTest();
     bankApiImplTest.shouldThrowException();
    }

    public void shouldThrowException(){
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch (AccessDeniedException e){
            System.out.println("TEST OK");
        }
    }
}
