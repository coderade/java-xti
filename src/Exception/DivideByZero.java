package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {
	
	public static void Divide(Scanner v)
	throws InputMismatchException, ArithmeticException
	{
		System.out.println("Enter a number ");
		int a = v.nextInt();
		System.out.println("Enter the divisor ");
		int b = v.nextInt();
		System.out.println("The division of the first number by the second is: " + a/b);
	}
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		boolean continues = true;
		
		do 
		{
			try 
			{	
				Divide(v);
				continues= false;
			}
			
	
			catch (InputMismatchException|ArithmeticException e) 
			{
				System.err.println("The number is invalid! ");
				v.nextLine();//removes the entry in error and starts over
				e.getMessage();
			}
			finally
			{
				System.out.println("Game over!");				
			}
		} while (continues);
		
	}

}
