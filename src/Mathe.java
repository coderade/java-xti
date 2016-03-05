public class Mathe
{
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return the highest number
	 */
	
	int Highest(int num1, int num2)
	{	
		int high;
		if (num1 > num2) 
		{
			high = num1;
			return high;
		}
		else 
		{
			high = num2;
			return high;
		}
		
	}
	
	/**double Sum (String test, double ... numbers)
	{
		System.out.println(test);
		double total =0;
		
		for (double n : numbers) 
		{
			total +=n;
		}
		return total;
	}
	
	
	/** @return the square root as Pell's equation*/
	int SquareRoot (int num)
	{
		int squareRoot =0, even= 1;
		while (num >= even)
		{
			num -= even;
			even += 2;
			squareRoot++;
		}
		
		return squareRoot;
	
	}
	
	//Overload Method
	
	
	double average (int x, int y)
	{
		System.out.print("\nTwo numbers: " + x + " and " + y +",");
		return (x+y)/2;
		
	}
	
	double average (String x, String y)
	{
		System.out.print("\nTwo String numbers: " + x + " and " + y +", ");
		int ix= Integer.parseInt(x);
		int iy= Integer.parseInt(y);
		return (ix+iy)/2;	
	}
	
	double average (int f)
	{	
		System.out.print("\nA number: " + f + ", ");
		return f;
	}
	
	double average (int ... numbers)
	{
		System.out.print("\nN numbers: ");
		int nTotal = 0;
		for (int n : numbers) 
		{
			nTotal +=n;

			
			System.out.print(n + ",");
			
		}
		return nTotal/numbers.length;
	}
}
