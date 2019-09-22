package model;

import java.io.Serializable;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "transaction")
@SessionScoped

public class Transaction implements Serializable {


	private static final long serialVersionUID = 1L;
	private String customerName;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountryt;
	private int accountNumber;
	private double amount;
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountryt() {
		return destinationCountryt;
	}
	public void setDestinationCountryt(String destinationCountryt) {
		this.destinationCountryt = destinationCountryt;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	

	
	public TransactionEntity getEntity() {
		TransactionEntity transactionEntity = new TransactionEntity();
		transactionEntity.setCustomerName(customerName);
		transactionEntity.setSourcePassport(sourcePassport);
		transactionEntity.setDestinationPassport(destinationPassport);
		transactionEntity.setDestinationBank(destinationBank);
		transactionEntity.setDestinationCountryt(destinationCountryt);
		transactionEntity.setAccountNumber(accountNumber);
		transactionEntity.setAmount(amount);
		return transactionEntity;
		
	} 
}
