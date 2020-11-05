package com.javaguru.student_igors_jurkovs.lesson_13.level_2_intern;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.*;

import static org.junit.Assert.*;

public class BankApiImplTest {

    private final BankClient bankClient1 = new BankClient("1", "Test1");
    private final BankClient bankClient2 = new BankClient("2", "Test2");
    private final BankClient bankClient3 = new BankClient("3", "Test3");
    private final BankClient bankClient4 = new BankClient("4", "Test4");
    private final List<BankClient> clients = Arrays.asList
            (bankClient1, bankClient2, bankClient3, bankClient4);

    private final List<Role> roles1 = Collections.singletonList(Role.CAN_SEARCH_CLIENTS);
    private final List<Role> roles2 = Collections.singletonList(Role.CAN_NOT_SEARCH_CLIENTS);
    private final UserCredentials canSearch = new UserCredentials(roles1);
    private final UserCredentials canNotSearch = new UserCredentials(roles2);
    private final BankApiImpl victim = new BankApiImpl(clients);

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void findByUid() throws AccessDeniedException {
        Optional<BankClient> expected = Optional.of(bankClient1);
        Optional<BankClient> result = victim.findByUid(canSearch, "1");
        assertEquals(expected, result);
    }

    @Test
    public void canNotFindByUid() throws AccessDeniedException {
        Optional<BankClient> expected = Optional.empty();
        Optional<BankClient> result = victim.findByUid(canSearch, "5");
        assertEquals(expected, result);
    }

    @Test
    public void AccessDenied() throws AccessDeniedException {
        exception.expect(AccessDeniedException.class);
        victim.findByUid(canNotSearch, "1");
    }
}