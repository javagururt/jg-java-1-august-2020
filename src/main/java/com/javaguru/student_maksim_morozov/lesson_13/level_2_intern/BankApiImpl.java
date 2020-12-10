package com.javaguru.student_maksim_morozov.lesson_13.level_2_intern;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements API{

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {

    }

    public void BankApiImpl(List<BankClient> clients){this.clients = clients;
    }
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid)
        throws AccessDeniedException{
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient bankClient : clients){
            if (bankClient.getUid().equals(uid)){
                return Optional.of(bankClient);
            }
        }
        return Optional.empty();
    }
}
