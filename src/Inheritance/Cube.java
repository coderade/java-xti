package Inheritance;

public class Cube implements calculableVolume, calculableArea
{
	double side;
	public Cube(double side) 
	{
		this.side = side;
	}
	@Override
	public double calculateVolume() {
		
		return 6* (side*side);
	}

	@Override
	public double calculateArea() {
		
		return side * side *side;
	}

}
