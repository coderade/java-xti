
public class TestEnum {

	public static void Walk (Measures measure, int total)
	{
		if (measure == Measures.MT) 
		{
			System.out.println("You walk " + total + " " +  Measures.MT.title );
		}
		else if (measure == Measures.MM)
		{
			System.out.println("You walk " + total + " " + Measures.MM.title );
		}
		else 
		{
			System.out.println("You walk " + total + " " + Measures.CM.title);
		}
	}
	public static final double PI = 3.14;
	
	public static void main(String[] args)
	{	
		System.out.println(Measures.MM.title);
		
		for (Measures M : Measures.values()) 
		{
			System.out.println(M + ": " + M.title);
		}
		
		Walk (Measures.CM, 100);
		Walk (Measures.CM, 1500);
		Walk (Measures.MM, 5000000);
	}

}
