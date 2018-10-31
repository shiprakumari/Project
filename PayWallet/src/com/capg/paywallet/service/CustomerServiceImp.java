package com.capg.paywallet.service;


import com.capg.paywallet.bean.CustomerBean;
import com.capg.paywallet.dao.CustomerDaoImp;
import com.capg.paywallet.dao.ICustomerDao;
import com.capg.paywallet.exception.CustomerException;
import com.capg.paywallet.exception.ExceptionMessage;

public class CustomerServiceImp implements ICustomerService {
	ICustomerDao dao = new CustomerDaoImp();

	@Override
	public boolean createAccount() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean showBalance() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deposit() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean withdraw() throws CustomerException {
		return dao.withdraw();
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean fundTransfer() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean printTransactions() {
		return false;
		// TODO Auto-generated method stub
		
	}
	public boolean validateData(CustomerBean e) throws CustomerException {
        // TODO Auto-generated method stub

        boolean isValid = true;
        

        if (!(e.getMobileNumber().length() > 10))
        {
               throw new CustomerException();
               }

        if (!(e.getPan().length()>10 ))
        {
               throw new CustomerException();
               }

        
        return isValid;

 }

}
