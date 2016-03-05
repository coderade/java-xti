package Inheritance;

public class Square implements calculableArea
{
	double side;
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea()
	{
		return side * side;
	}

}
