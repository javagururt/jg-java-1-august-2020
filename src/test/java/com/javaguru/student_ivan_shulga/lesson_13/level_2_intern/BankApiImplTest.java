package com.javaguru.student_ivan_shulga.lesson_13.level_2_intern;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class BankApiImplTest { // пока не понял почему тест не проходит

    BankClient testBankClient = new BankClient("123", "TestBankClient");
    List<BankClient> clients = Arrays.asList(testBankClient);
    BankApiImpl victim = new BankApiImpl(clients);
    List<Role> roles = Arrays.asList(Role.CAN_SEARCH_CLIENTS);
    UserCredentials userCredentials = new UserCredentials(roles);

    @Test
    public void findByUid() throws AccessDeniedException {
        Optional<BankClient> expected = Optional.of(testBankClient);
        Optional<BankClient> actual = victim.findByUid(userCredentials, "123");
        assertEquals(expected, actual);
    }

}

/*
Создайте класс BankApiImpl так, что бы он реализовывал интерфейс BankApi:

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

}

Создайте класс BankApiImplTest и напишите тесты для метода findByUid().
 */