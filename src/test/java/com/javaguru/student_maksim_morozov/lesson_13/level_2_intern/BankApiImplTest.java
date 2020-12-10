package com.javaguru.student_maksim_morozov.lesson_13.level_2_intern;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;

import java.util.*;

class BankApiImplTest extends TestCase {

    private final List<BankClient> clients = new ArrayList<>();
    private BankApiImpl test;
    private BankClient bankClient;
    private UserCredentials userCredentials;
    private UserCredentials userCredentials1;
    private final List<Role> roles = new ArrayList<>();
    private final List<Role> roles1 = new ArrayList<>();
    private Object BankClient;
    private Object UserCredentials;

    @Before
    public void setUp(){
        test = new BankApiImpl(clients);
        roles.add(Role.CAN_NOT_SEARCH_CLIENTS);
        roles1.add(Role.CAN_SEARCH_CLIENTS);
        userCredentials = new UserCredentials(roles1);
        userCredentials = new UserCredentials(roles);
        bankClient = new BankClient("3", "Maksim");
        clients.add(bankClient);
    }
    public void testFindByUidThrow(){
        try {
            test.findByUid(userCredentials1,"1");
            Assert.fail("Expected AccessDeniedException");}
        catch (AccessDeniedException e) {
            Assert.assertNotEquals("", e.getMessage());
        }
    }
    public void testFindByUidUid() throws AccessDeniedException{
        assertEquals(Optional.of(BankClient), test.findByUid(userCredentials, "3"));
    }
    public void testFindByUidEmpty() throws AccessDeniedException{
        assertEquals(Optional.empty(), test.findByUid((com.javaguru.student_maksim_morozov.lesson_13.level_2_intern.UserCredentials) UserCredentials, "2"));
    }
}