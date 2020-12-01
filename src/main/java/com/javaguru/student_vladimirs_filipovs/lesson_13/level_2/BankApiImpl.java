package com.javaguru.student_vladimirs_filipovs.lesson_13.level_2;

import com.javaguru.teacher.codereview.CodeReview;

import java.util.List;
import java.util.Optional;
@CodeReview(approved = true)
public class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.isContains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        } else {
            for (BankClient client : clients) {
                if (uid.equals(client.getUid())) {
                    return Optional.of(client);
                }
            }
        }
        return Optional.empty();
    }
}
