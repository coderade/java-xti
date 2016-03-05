package Exception;

public class CopyOfCommonsExceptions {
	static int[] ArrayNull= new int [0];
	
	public static void main(String[] args) 
	{
		/*NullPointerException - Accessing or modifying the field of a null object.
		System.out.println(ArrayNull.length);
		*/
		
		/*ArrayIndexOutOfBoundsException- The index is either negative or greater than or equal to the size of the array
		System.out.println(ArrayNull[1]);
		*/
		
		/*ArithmeticException- Impossible divide a number by zero
		int v = 20/0;
		*/
		
		/*ClassCastException - Indicate that the code has attempted to cast an object to a subclass of which it is not an instance
		Animal a = new Duck();
		Dog Donald = (Dog) a;
		*/
		
		/*NumberFormatException
		String s = "t";
		int integer = Integer.parseInt(s);
		*/
	}
	

}
