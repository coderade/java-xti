package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	//static isn't stored;

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) throws Exception
	{
		String[] names = {"Valdeci", "Joao", "Maria"};

		Account account1 = new Account("Valdeci", 543000.32);
		Account account2 = new Account("Joao", 200300.00);
		Account account3 = new Account("Maria", 120000);

		//WRITING THE OBJECT
		FileOutputStream fos = new FileOutputStream("C:/Java/Files/object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(account1);
		oos.writeObject(account2);
		oos.writeObject(account3);
		oos.close();

		//READING THE OBJECT
		FileInputStream fis = new FileInputStream("C:/Java/Files/accounts.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);
		Account acc1 = (Account) ois.readObject();
		Account acc2 = (Account) ois.readObject();
		Account acc3 = (Account) ois.readObject();
		ois.close();
		acc1.ShowBalance();
		acc2.ShowBalance();
		acc3.ShowBalance();





	}

}
