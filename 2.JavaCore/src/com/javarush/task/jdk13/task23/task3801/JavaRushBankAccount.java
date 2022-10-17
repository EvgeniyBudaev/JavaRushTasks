package com.javarush.task.jdk13.task23.task3801;

public class JavaRushBankAccount {
    private String ownerName;

    @LongPositive
    private long amount;

    public JavaRushBankAccount(String ownerName) {
        this.ownerName = ownerName;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}
