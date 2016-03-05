package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class File03
{
	static Path accounts1 = Paths.get("C:/Java/Files/accounts.txt");
	static ArrayList<Account> accounts = new ArrayList<>();

	public static void Writes()
	{

		Charset utf = StandardCharsets.UTF_8;

		try (BufferedWriter l = Files.newBufferedWriter(accounts1, utf);)
		{
			l.write("Valdeci Gomes;100000;");
			l.write("Joao da Silva;50000;");
			l.write("Maria Gomes;20000;");

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}


	}

	public static void Reads()
	{

		byte[] returns;
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Double> salarys = new ArrayList<>();

		try {
			returns = Files.readAllBytes(accounts1);
			String[] values = (new String(returns)).split(";");



			Double r = null;
			for (String v : values)
			{
				if (v.matches("\\d.+"))
				{
					r = Double.parseDouble(v);
					salarys.add(r);
				}
				else
				{
					names.add(v);

				}


			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		accounts.add(new Account(names.get(0), salarys.get(0)));
		accounts.add(new Account(names.get(1), salarys.get(1)));
		accounts.add(new Account(names.get(2), salarys.get(2)));

		for (Account account : accounts)
		{
			account.ShowBalance();
		}

		/*accounts.get(0).ShowBalance();
		accounts.get(1).ShowBalance();
		accounts.get(2).ShowBalance();
		accounts.get(3).ShowBalance();
		accounts.get(4).ShowBalance();
		accounts.get(5).ShowBalance();*/

	}

	public static void main(String[] args)
	{

		accounts.add(new Account("Maria", 1000.9));
		accounts.add(new Account("Valdeci", 40000.0));
		accounts.add(new Account("Joao",10000));

		File03.Writes();
		File03.Reads();

	}

}
