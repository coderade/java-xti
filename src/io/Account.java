package io;


@SuppressWarnings("serial")
public class Account implements java.io.Serializable
{
transient String name;
 double balance; // used to indicate that a field should not be serialized

public Account() {}
public Account(String name,  double balance) {
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

public void Transfer(Account destiny, double value) 
{
	this.Withdraw(value);
	destiny.Deposite(value);
	System.out.println("The client " + name + " deposited " + value + " for " + destiny.name);
}
}
