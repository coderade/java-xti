package dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates2 
{

	public static void main(String[] args) throws ParseException 
	{
		Calendar date = Calendar.getInstance();
		date.set(2014, Calendar.AUGUST, 29);
		Date time = date.getTime();
		System.out.println(time);
		
		//DATE FORMAT
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(time));
		
		//HOUR FORMAT
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(time));
		
		//DATE TIME FORMAT
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(time));
		
		//DATE FORMAT STYLES
		f= DateFormat.getDateInstance(DateFormat.DEFAULT);
		System.out.println("DEFAULT DATE: " + f.format(time));
		f= DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL DATE: " +f.format(time));
		f= DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("LONG DATE: " + f.format(time));
		f= DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("SHORT DATE: " + f.format(time));
		
		Date date2 = f.parse("1994/8/29");
		System.out.println(date2);

		//SIMPLE DATE FORMAT
		
				
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(time));
	}
	}


