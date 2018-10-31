package com.capg.paywallet.service;

import com.capg.paywallet.bean.CustomerBean;
import com.capg.paywallet.exception.CustomerException;

public interface ICustomerService {
	public boolean createAccount();
	public boolean showBalance();
	public boolean deposit();
	public boolean withdraw() throws CustomerException;
	public boolean fundTransfer();
	public boolean printTransactions();
	public boolean validateData(CustomerBean e) throws CustomerException;
	

}
