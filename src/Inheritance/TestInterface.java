package Inheritance;


public class TestInterface {

	public static void vol (calculableVolume vo)
	{
		System.out.println(vo.calculateVolume());
	}
	
	public static void area(calculableArea cb)
	{
		System.out.println(cb.calculateArea());
	}
	
	public static void main(String[] args) {
		area(new Square(2));
		vol(new Cube(4));
		area(new Cube (3));
		
	}
	

}
