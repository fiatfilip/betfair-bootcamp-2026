package ro.digitalstack.betfair.session05;

import java.util.UUID;

public class Account {
    private final UUID id;
    private double balance;
    private Currency currency;

    public Account(UUID id, double balance, Currency currency) {
        this.id = id;
        this.balance = balance;
        this.currency = currency;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
        }
    }
}
