package com.capgemini.exercise1;

public class CurrentAccount extends Account{
	double overdraftLimit;
	CurrentAccount(long accNum,double balance, Person accHolder){
		super(accNum,balance,accHolder);
		this.overdraftLimit=90;
	}
	@Override
	public void deposit(double amt) {
		if((balance+amt) > overdraftLimit) {
			System.out.println("Limit Reached can't deposit");
		}
		else
			balance=balance+amt;
	}
}
