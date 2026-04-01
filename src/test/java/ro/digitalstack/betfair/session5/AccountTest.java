package ro.digitalstack.betfair.session5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.UUID;

public class AccountTest {
    @Test
    public void creditWorks(){
        Random random = new Random();
        Account testAccount = new Account(UUID.randomUUID(), 1000, Currency.RON);
        double credit = random.nextDouble();
        testAccount.credit(credit);
        Assertions.assertEquals(1000 + credit, testAccount.getBalance());
    }

    @Test
    public void negativeCreditDoesNotWork(){
        Random random = new Random();
        Account testAccount = new Account(UUID.randomUUID(), 1000, Currency.RON);
        double credit = random.nextDouble();
        testAccount.credit(-credit);
        Assertions.assertEquals(1000, testAccount.getBalance());
    }

    @Test
    public void debitWorks(){
        Random random = new Random();
        Account testAccount = new Account(UUID.randomUUID(), 1000, Currency.RON);
        double debit = random.nextDouble();
        testAccount.debit(debit);
        Assertions.assertEquals(1000 - debit, testAccount.getBalance());
    }

    @Test
    public void negativeDebitDoesNotWork(){
        Random random = new Random();
        Account testAccount = new Account(UUID.randomUUID(), 1000, Currency.RON);
        double debit = random.nextDouble();
        testAccount.debit(-debit);
        Assertions.assertEquals(1000, testAccount.getBalance());
    }

    @Test
    public void debitDoesNotWorkForMoreThanBalanceAmount(){
        Account testAccount = new Account(UUID.randomUUID(), 1000, Currency.RON);
        testAccount.debit(1001);
        System.out.println(testAccount.getBalance());
        Assertions.assertEquals(1000, testAccount.getBalance());
    }
}
