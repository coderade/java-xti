package Exception;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args)
	{
		System.out.println("Enter a number from 0 to 10 please!");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		assert(num> 0 && num <10): "Invalid number!";
		System.out.println("The number is "+ num);
	}

}
