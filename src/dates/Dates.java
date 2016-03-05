package dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates 
{

	public static void main(String[] args) 
	{
		// starts in 1970/01/01
		System.out.println(System.currentTimeMillis());//Returns the current time in milliseconds

		
		Date now = new Date();
		System.out.println(now);
		
		Date date = new Date(3232);
		System.out.println(date);
		
		System.out.println(now.getTime());//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT 

		
		System.out.println(date.compareTo(now));//Compares two Dates for ordering
		
		Calendar c = Calendar.getInstance();//Gets a calendar using the default time zone and locale. 
		c = new GregorianCalendar();
		
		c.set(1994,7,29);//Sets the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH
		System.out.println(c.getTime());//Returns a Date object representing this Calendar's time value
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		
		c.set(Calendar.YEAR, 1970);
		c.set(Calendar.DAY_OF_MONTH, 16);
		c.set(Calendar.MONTH, 11);
		
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE);//Sets the given calendar field value and the time value (millisecond offset from the Epoch)
		c.clear(Calendar.MILLISECOND);// of this Calendar undefined
		
		System.out.println(c.getTime());
		
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.YEAR, -2);
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH,20);
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH, 25);
		System.out.println(c.getTime());
		
		/*GRETTING WITH GOOD MORNING, GOOD AFTERNOON, GOOD EVENING*/
		
		Calendar day = Calendar.getInstance();
		int hour = day.get(Calendar.HOUR_OF_DAY);
		
		if (hour<=12) 
		{
			System.out.println("Good Morning!");	
		}
		else if (hour >12 && hour <19) 
		{
			System.out.println("Good Afternoon!");	
		}
		else 
		{
			System.out.println("Good Evening!");
		}

		
	}
	

}
