package polimorfism;

public class Multiplication extends MathOperations
{
	@Override
	public double calculate(double v, double a) 
	{	
		System.out.print("\nThe rsult of multiplication of the numbers is: ");
		return v*a;
	}
}
