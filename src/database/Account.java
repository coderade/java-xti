package database;

public class Account
{
	int number;
	String name;
	double balance;
	
	public Account(int number, String name, double balance) 
	{
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	@Override
	public String toString() 
	{
		return number + ", " + name + ", " + balance;
	}
}
