package com.rts.evaluation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {

	@Id
	private String accountNumber;

	private String accountHolderName;

	private String accountType;

	private double balance;

	private String phoneNumber;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String accountNumber, String accountHolderName, String accountType, double balance,
			String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", balance=" + balance + ", phoneNumber=" + phoneNumber + "]";
	}

}
