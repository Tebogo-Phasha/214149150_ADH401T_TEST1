package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


import model.Transaction;
import service.TransactionEJB;

@ManagedBean(name = "transactionController")
@SessionScoped

public class TransactionController {

	@EJB
	private TransactionEJB transactionService;
	
	
	@ManagedProperty(value = "#{transaction}")
	private Transaction transaction;

	
	
	public void addTransaction() {
		transactionService.addNew(transaction.getEntity());
		System.out.println("In Use");
	}
	


	public Transaction getTransaction() {
		return transaction;
	}


	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
}
