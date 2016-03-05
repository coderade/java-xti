package io;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Accounts3 implements Serializable
{
	public String name;
	public transient double balance;

	public Accounts3() {}
	public Accounts3(String name, double balance) 
	{
		this.name = name;
		this.balance = balance;
	}

	public void ShowBalance()
	{
		System.out.println("The balance of the client " + name + " is " + balance);
	}

	public void Withdraw(double value)
	{
		balance -= value;
	}	

	public void Deposite(double value)
	{
		balance += value;
	}	

	public void Transfer(Accounts3 destiny, double value) 
	{
		this.Withdraw(value);
		destiny.Deposite(value);
		System.out.println("The client " + name + " deposited " + value + " for " + destiny.name);
	}

	public String getName() 
	{
		return name;
	}
	public double getBalance() 
	{
		return balance;
	}
}
