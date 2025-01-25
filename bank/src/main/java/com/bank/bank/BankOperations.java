package com.bank.bank;

public class BankOperations {
    private BankAccount bankAccount;
    private double withdraw;
    private BankStatus bankStatus;

    public BankOperations(BankAccount bankAccount, double withdraw, BankStatus bankStatus) {
        this.bankAccount = bankAccount;
        this.withdraw = withdraw;
        this.bankStatus = bankStatus;
    }

    public BankAccount getKonto() {
        return bankAccount;
    }

    public void setKonto(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setPrzelewy(double withdraw) {
        this.withdraw = withdraw;
    }

    public BankStatus getStatus() {
        return bankStatus;
    }

    public void setStatus(BankStatus bankStatus) {
        this.bankStatus = bankStatus;
    }
}

