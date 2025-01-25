package com.bank.bank;

public class BankAccount {
    private int idUser;
    private double saldo;

    public BankAccount(int idUser, double saldo) {
        this.idUser = idUser;
        this.saldo = saldo;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

