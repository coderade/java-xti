package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class File03_02 {

	private Path path = Paths.get("C:/Java/Files/accounts2.txt");	
	private Charset utf8 = StandardCharsets.UTF_8;
	public void AccountStore(ArrayList<Accounts3> accounts2)
	{		
		try (BufferedWriter writer = Files.newBufferedWriter(path, utf8))
		{
			for (Accounts3 account : accounts2) 
			{
				writer.write(account.getName() + ";" + account.getBalance() + "\n");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public ArrayList<Accounts3> AccountRecover()
	{
		ArrayList<Accounts3> accounts = new ArrayList<>();
		
		try( BufferedReader reads = Files.newBufferedReader(path, utf8)) 
		{
			String line = null;
			while ((line =reads.readLine())!= null ) {
				String[] v =line.split(";");
				System.out.println(v[0] + v[1]);
				Accounts3 account = new Accounts3(v[0], Double.parseDouble(v[1]));
				accounts.add(account);
				
				
			}
		} 
		catch (Exception e) 
		{
		}
		return accounts;
	}
		
	public static void main(String[] args)
	{
		ArrayList<Accounts3> accounts2 = new ArrayList<>();
		accounts2.add(new Accounts3("Valdeci", 10000));
		accounts2.add(new Accounts3("Bill Gates", 1000000));
		accounts2.add(new Accounts3("Mark Zuckberg", 100000));
		
		File03_02 operations = new File03_02();
		operations.AccountStore(accounts2);
		ArrayList<Accounts3> account2 = operations.AccountRecover();
		for (Accounts3 accounts : account2) 
		{
			accounts.ShowBalance();
		}
		
	}

}
