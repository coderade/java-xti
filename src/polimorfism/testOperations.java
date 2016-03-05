package polimorfism;

import java.util.Scanner;

public class testOperations {

		
	public static void calculationWithoutPolimorfism(String o, double v, double a)
	{
		if (o.equals("Sum")) 
		{
			double res = v +a;
			System.out.println(res);
			
		}
		else if (o.equals("Multiplication"))
		{
			double res = v *a;
			System.out.println(res);
			
		}
		else 
		{
			System.out.println("Enter a operation please!");
		}
		
	}
	public static void calculation (MathOperations m, double v, double a)
	{ 
		System.out.print(m.calculate(v, a));
	}
	
	public static void main(String[] args) {

	System.out.println("Enter the first number");
	@SuppressWarnings("resource")
	Scanner f = new Scanner(System.in);
	String fi = (f.nextLine());
	System.out.println("Enter the second number");
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	String se = (s.nextLine());
	
	
	Double first = 0.0;
	first = Double.parseDouble(fi);
	Double second = 0.0;  
	second= Double.parseDouble(se);
	
	
	calculation(new Sum(),first, second);
	calculation(new Multiplication(), first, second);
	
	calculationWithoutPolimorfism("Multiplication", first,second);
	calculationWithoutPolimorfism("Sum",first, second);
	}

}
		