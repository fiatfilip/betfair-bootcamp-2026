package ro.digitalstack.betfair.session05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {
    @Mock
    AccountRepository accountRepository;
    @InjectMocks
    TransactionService transactionService;
    @Test
    public void transferWorks() {
        UUID sourceAccountId = UUID.randomUUID();
        UUID targetAccountId = UUID.randomUUID();
        Account sourceAccount = new Account(sourceAccountId, 1000, Currency.RON);
        Account targetAccount = new Account(targetAccountId, 2000, Currency.RON);

        Mockito.when(accountRepository.findAccountById(sourceAccountId)).thenReturn(sourceAccount);
        Mockito.when(accountRepository.findAccountById(targetAccountId)).thenReturn(targetAccount);

        transactionService.transfer(sourceAccountId, targetAccountId, 1000);

        Assertions.assertEquals(0, sourceAccount.getBalance());
        Assertions.assertEquals(3000,  targetAccount.getBalance());
    }
}
