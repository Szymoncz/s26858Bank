package com.bank.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {

	private final BankStorage bankStorage;
	private final BankService bankService;

	public BankApplication(BankStorage bankStorage, BankService bankService) {
		this.bankStorage = bankStorage;
		this.bankService = bankService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		BankStorage bankStorage = new BankStorage();
		BankService bankService = new BankService(bankStorage);
		BankApplication bankApplication = new BankApplication(bankStorage, bankService);
		bankApplication.initProcess();
	}

	public void initProcess() {
		BankAccount bankAccount1 = new BankAccount(1, 1000);
		BankAccount bankAccount2 = new BankAccount(2, 3000);
		BankAccount bankAccount3 = new BankAccount(3, 2000);

		bankStorage.addKonto(bankAccount1);
		bankStorage.addKonto(bankAccount2);
		bankStorage.addKonto(bankAccount3);

		System.out.println("Konta zostały dodane:");
		System.out.println(bankAccount1.getIdUser());
		System.out.println(bankAccount1.getSaldo());
		System.out.println(bankAccount2.getIdUser());
		System.out.println(bankAccount2.getSaldo());
		System.out.println(bankAccount3.getIdUser());
		System.out.println(bankAccount3.getSaldo());
	}
}

