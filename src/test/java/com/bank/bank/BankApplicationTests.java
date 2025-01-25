package com.bank.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BankAccountServiceTest {
	private BankService bankService;
	private BankStorage bankStorage;
	@BeforeEach
	public void setUp(){
		bankStorage = new BankStorage();
		bankService = new BankService(bankStorage);
	}
	@Test
	public void testWithdraw(){
		//Given
		BankAccount bankAccount1 = new BankAccount(1, 1000);
		bankStorage.addKonto(bankAccount1);

		//When
		BankStatus result = bankService.Withdraw(1,1000,500);

		//Then
		double expected = 1000 - 500;
		assertThat(result).isEqualTo(BankStatus.ACCEPTED);
	}

	@Test
	public void testSalary(){
		//Given
		BankAccount bankAccount2 = new BankAccount(1, 10000);
		bankStorage.addKonto(bankAccount2);

		//When
		BankStatus dodatek = bankService.Withdraw(1,10000,500);

		//Then
		double expected = 10000 + 500;
		assertThat(dodatek).isEqualTo(BankStatus.ACCEPTED);
	}

}