package ro.digitalstack.betfair.session05;

import java.util.UUID;

public interface AccountRepository {
    Account findAccountById(UUID id);
    void saveAccount(Account account);
}
