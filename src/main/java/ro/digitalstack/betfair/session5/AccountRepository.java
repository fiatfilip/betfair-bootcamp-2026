package ro.digitalstack.betfair.session5;

import java.util.UUID;

public interface AccountRepository {
    Account findAccountById(UUID id);
    void saveAccount(Account account);
}
