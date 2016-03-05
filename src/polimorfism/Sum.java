package polimorfism;

public class Sum extends MathOperations
{
	@Override
	public double calculate(double v, double a) 
	{
		System.out.print("The sum of the numbers is: "); 
		return v + a;
	}
}
