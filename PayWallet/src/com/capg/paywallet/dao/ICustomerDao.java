package com.capg.paywallet.dao;

import com.capg.paywallet.exception.CustomerException;

public interface ICustomerDao {
	public boolean createAccount();
	public boolean showBalance();
	public boolean deposit();
	public boolean withdraw() throws CustomerException;
	public boolean fundTransfer();
	public boolean printTransactions();
	


}
