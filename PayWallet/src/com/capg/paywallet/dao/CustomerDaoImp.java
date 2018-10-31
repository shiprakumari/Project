package com.capg.paywallet.dao;

import java.util.Scanner;

import com.capg.paywallet.exception.CustomerException;

public class CustomerDaoImp implements ICustomerDao {
	double balance=500;
	
	Scanner scanner = new Scanner(System.in);
 
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
	public boolean withdraw() throws CustomerException{
		// TODO Auto-generated method stub
		String accountNumber;
		
		System.out.println("enter mobile no to withdraw amount");
		 long mobileNumber= scanner.nextLong();
		String pan =scanner.next();
		
			if(mobileNumber == customerList.getmobileNumber && pan == customerList.getpan) {
				System.out.println("enter the amount to withdraw");
				double withdrawAmount= scanner.nextDouble();
				if(withdrawAmount > balance) {
					throw new CustomerException();
				}
				else if(withdrawAmount<=0){
						throw new CustomerException();
				}
				else {
					balance = balance-withdrawAmount;
					System.out.println("current balance is" +balance);
				}
		 }
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

}
