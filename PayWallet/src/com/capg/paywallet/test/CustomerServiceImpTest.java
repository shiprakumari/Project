package com.capg.paywallet.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capg.paywallet.bean.CustomerBean;
import com.capg.paywallet.dao.CustomerDaoImp;
import com.capg.paywallet.dao.ICustomerDao;
import com.capg.paywallet.exception.CustomerException;
import com.capg.paywallet.service.CustomerServiceImp;
import com.capg.paywallet.service.ICustomerService;

public class CustomerServiceImpTest {

	private static ICustomerService customerService  = null;

	public static void createInstance(){
		customerService= new CustomerServiceImp();
	}
		
	@Test(expected = CustomerException.class)
		public void testMobileNumberForNull() throws CustomerException{
			CustomerBean customerBean = new CustomerBean();
            
            customerBean.setMobileNumber("7730901400");
            customerBean.setPan("CRVDJ1619");
            boolean result= customerService.validateData(customerBean);
            assertFalse(result);
            }
	@Test
	public void testMobileNumberForNumber() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
        
        customerBean.setMobileNumber("7730901400");
        customerBean.setPan("CRVDJ1619");
        boolean result= customerService.validateData(customerBean);
        assertTrue(result);
        }
	@Test(expected = CustomerException.class)
	public void testMobileNumberForChar() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
        
        customerBean.setMobileNumber("7730901400");
        customerBean.setPan("CRVDJ1619");
        boolean result= customerService.validateData(customerBean);
        assertFalse(result);
        }
	@Test(expected = CustomerException.class)
	public void testMobileNumberForLength() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
        
        customerBean.setMobileNumber("7730901400");
        customerBean.setPan("CRVDJ1619");
        boolean result= customerService.validateData(customerBean);
        assertTrue(result);
        }
	@Test(expected = CustomerException.class)
	public void testPanForLength() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
        
        customerBean.setMobileNumber("7730901400");
        customerBean.setPan("CRVDJ1619");
        boolean result= customerService.validateData(customerBean);
        assertTrue(result);
        }
	
	@Test(expected = CustomerException.class)
	public void testPanForNull() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
        
        customerBean.setMobileNumber("7730901400");
        customerBean.setPan("CRVDJ1619");
        boolean result= customerService.validateData(customerBean);
        assertFalse(result);
        }
	@Test(expected = CustomerException.class)
	public void testPan() throws CustomerException{
		CustomerBean customerBean = new CustomerBean();
        
        customerBean.setMobileNumber("7730901400");
        customerBean.setPan("CRVDJ1619");
        boolean result= customerService.validateData(customerBean);
        assertTrue(result);
        }
	
	
	
	
	
}
