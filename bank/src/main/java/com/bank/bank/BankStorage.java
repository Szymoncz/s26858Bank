package com.bank.bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BankStorage {
    private List<BankAccount> bankAccountList;

    public BankStorage() {
        this.bankAccountList = new ArrayList<>();
    }
    public void addKonto(BankAccount bankAccount) {
        bankAccountList.add(bankAccount);
    }
    public List<BankAccount> getKontoList() {
        return bankAccountList;

    }

}

