package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization02
{
	
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException
	{
		ArrayList<Accounts3> accounts2 = new ArrayList<>();
		accounts2.add(new Accounts3("Valdeci", 10000));
		accounts2.add(new Accounts3("Bill Gates", 1000000));
		accounts2.add(new Accounts3("Mark Zuckberg", 100000));
		
		Serialization02 operations = new Serialization02();
		operations.AccountStore(accounts2);
		
		ArrayList<Accounts3> account2 = operations.AccountRecover();
		
		for (Accounts3 accounts : account2) 
		{
			accounts.ShowBalance();
		}
	}
	
	public void AccountStore(ArrayList<Accounts3> accounts2) 
	{	
		
		try(FileOutputStream fos = new FileOutputStream("C:/Java/Files/accounts.ser");)
		{
			try (ObjectOutputStream oos = new ObjectOutputStream(fos);)
			{
				oos.writeObject(accounts2);
			}
			
		} 
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Accounts3> AccountRecover() throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try (FileInputStream fis = new FileInputStream("C:/Java/Files/accounts.ser"))
		{
			try(ObjectInputStream ois = new ObjectInputStream(fis))
			{
				return (ArrayList<Accounts3>) ois.readObject();
			}
		}
	}	

}
