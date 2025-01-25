package com.bank.bank;

import org.springframework.stereotype.Service;

@Service
public class BankService {
    private final BankStorage bankStorage;

    public BankService(BankStorage bankStorage) {
        this.bankStorage = bankStorage;
    }

    public BankStatus Withdraw(int idUser, double saldo, double withdraw) {
        double result = saldo - withdraw;
        {
            if (result < 0) {
                return BankStatus.DECLINED;
            } else {
                return BankStatus.ACCEPTED;
            }
        }
    }

    public BankStatus Salary(int idUser, double saldo, double withdraw) {
        double dodatek = saldo + withdraw;
        return BankStatus.ACCEPTED;
    }
    public void Bank(int idUser, double saldo, double withdraw) {
        System.out.println("Numer klienta" + idUser + "Saldo: " + saldo);
    }
}


