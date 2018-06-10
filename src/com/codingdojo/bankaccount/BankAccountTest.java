package com.codingdojo.bankaccount;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		BankAccount a = new BankAccount();
		b.accountCount();
		b.totalMoney();
		b.depositChecking(100.00);
		b.depositSaving(1000.00);
		b.withdrawSaving(100000000.00)
;		b.withdrawChecking(50.00);
		b.viewAccount();
	}
}
