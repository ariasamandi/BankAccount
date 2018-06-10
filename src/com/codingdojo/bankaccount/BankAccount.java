package com.codingdojo.bankaccount;
import java.lang.Math;
public class BankAccount {
	private String accountNumber;
	private double checkingsBalance;
	private double savingsBalance;
	private static int numberOfAccounts;
	public BankAccount() {
		numberOfAccounts++;
		generateAccountNumber();
	}
	public static int accountCount() {
		System.out.println("Number of Accounts = " + numberOfAccounts);
		return numberOfAccounts;
	}
	public double totalMoney() {
		double total = this.checkingsBalance + this.savingsBalance;
		System.out.println("Total = " + total);
		return total;
	}
	private long generateAccountNumber() {
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		System.out.println("Account Number = " + number);
		return number;
	}
	public double depositChecking(double deposit) {
		this.checkingsBalance += deposit;
		double total = this.checkingsBalance + this.savingsBalance;
		System.out.println("Checkings: Depositing $" + deposit);
		System.out.println("Checkcings = " + this.checkingsBalance);
		System.out.println("Total = " + total);
		return total;
	}
	public double depositSaving(double deposit) {
		this.savingsBalance += deposit;
		double total = this.checkingsBalance + this.savingsBalance;
		System.out.println("Savings: Depositing  $" + deposit);
		System.out.println("Savings = " + this.savingsBalance);
		System.out.println("Total = " + total);
		return total;
	}
	public double withdrawChecking(double amount) {
		double total = this.checkingsBalance + this.savingsBalance;
		if(total < amount) {
			return 0;
		}
		this.checkingsBalance -= amount;
		System.out.println("Chceking: Took out $" + amount);
		System.out.println("Checkings = " + this.checkingsBalance);
		System.out.println("Total = " + total);
		return total;
	}
	public double withdrawSaving(double amount) {
		double total = this.checkingsBalance + this.savingsBalance;
		if(total < amount) {
			return 0;
		}
		this.savingsBalance -= amount;
		total = this.checkingsBalance + this.savingsBalance;
		System.out.println("Saving: Took out $" + amount);
		System.out.println("Savings = " + this.savingsBalance);
		System.out.println("Total = " + total);
		return total;
	}
	public void viewAccount() {
		double total = this.checkingsBalance + this.savingsBalance;
		System.out.println("Checkings = " + this.checkingsBalance);
		System.out.println("Savings = " + this.savingsBalance);
		System.out.println("Total = " + total);
	}
	public double getCheckings() {
		return checkingsBalance;
	}
	public double getSavings() {
		return savingsBalance;
	}
	
	
}
