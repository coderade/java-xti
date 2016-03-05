package dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dates3
{

	public static void main(String[] args) 
	{
		Calendar c = Calendar.getInstance();
		c.set(1994, Calendar.AUGUST, 29);
		Date date = c.getTime();
		
		Locale defaults = Locale.getDefault();
		Locale brazil = new Locale("pt", "BR");//Construct a locale from language and country Brazil.
		Locale india = new Locale ("hi", "IN");//Construct a locale from language and country India.
		Locale italian = Locale.ITALY; //Construct a locale from language and country Italy.
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, brazil);//Formats the date for the Brazil locale
		System.out.println("Brazilian date format: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, defaults);//Formats the date for the default locale
		System.out.println("Default date format: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, india);//Formats the date for the India locale
		System.out.println("India date format: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRENCH);//Formats the date for the French locale
		System.out.println("French date format: " + f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.FULL, italian);//Formats the date for the Italy locale
		System.out.println("Italy date format: " + f.format(date));
		
	}
}
