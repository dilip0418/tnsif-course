package com.dilip.dayTwelveCodes.lambdaDemo.withFunctionalInterfaces.real;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Transaction {
    String description;
    double amount;

    Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
}

public class ConsumerExample {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Purchase", 150.0));
        transactions.add(new Transaction("Withdrawal", 200.0));
        transactions.add(new Transaction("Deposit", 100.0));

        Consumer<Transaction> processTransaction = transaction -> {
            System.out.println("Processing: " + transaction.description);
            // We can perform any processing on the data here.
        };

        transactions.forEach(processTransaction);
    }
}

