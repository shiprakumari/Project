package com.capg.paywallet.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capg.paywallet.bean.CustomerBean;
import com.capg.paywallet.dao.CustomerDaoImp;
import com.capg.paywallet.dao.ICustomerDao;
import com.capg.paywallet.exception.CustomerException;

public class CustomerDaoImpTest {
private static ICustomerDao customerDao  = null;

public static void createInstance(){
	customerDao= new CustomerDaoImp();
}
	
	@Test(expected = CustomerException.class)
	public void testMobileNumberForNull() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
		
		
		
		
		
	}
		
	
	
	
}
	


