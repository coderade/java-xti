package dates;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numbers {

	public static void main(String[] args) throws ParseException 
	{
		double balance = 1000.39;
		
		NumberFormat number = NumberFormat.getInstance();//Returns a general-purpose number format for the current default FORMAT locale.
		System.out.println(number.format(balance));
		
		number = NumberFormat.getIntegerInstance();//Returns an integer number format for the current default FORMAT locale.
		System.out.println(number.format(balance));
		
		number = NumberFormat.getPercentInstance();//Returns a percentage format for the current default FORMAT locale
		System.out.println(number.format(balance));
		
		number = NumberFormat.getCurrencyInstance();//Returns a currency format for the current default FORMAT locale. 
		System.out.println(number.format(balance));
		
		number.setMaximumFractionDigits(1);//Sets the maximum number of digits allowed in the fraction portion of a number. 
		System.out.println(number.format(balance));
		
		//INTERNATIONALIZATION
		Locale brazil = new Locale("pt", "BR");//Construct a locale from language and country Brazil.
		Locale france = Locale.FRANCE;//Construct a locale from language and country France.
		
		number = NumberFormat.getCurrencyInstance(brazil);//Returns a general-purpose number format for the Brazil locale.
		System.out.println(number.format(balance));
			
		number = NumberFormat.getCurrencyInstance(france);//Returns a general-purpose number format for the France locale.
		System.out.println(number.format(balance));
		
		//CONVERTING
		number = NumberFormat.getCurrencyInstance();
		System.out.println(number.parse("$1.000,39"));//Parses text from the beginning of the given string to produce a number
		
		
	}

}
