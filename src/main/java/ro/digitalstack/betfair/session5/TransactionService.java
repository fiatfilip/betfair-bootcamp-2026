package ro.digitalstack.betfair.session5;

import java.util.UUID;

public class TransactionService {
    AccountRepository accountRepository;
    public void transfer(UUID sourceId, UUID destinationId, double amount) {
        Account sourceAccount = accountRepository.findAccountById(sourceId);
        Account destinationAccount = accountRepository.findAccountById(destinationId);
        sourceAccount.debit(amount);
        destinationAccount.credit(amount);
        accountRepository.saveAccount(sourceAccount);
        accountRepository.saveAccount(destinationAccount);
    }
}
