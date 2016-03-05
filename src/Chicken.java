
public class Chicken 
{
	
	public int eggs; // Total eggs of the object chicken.
	
	public static int eggsFarm;// global variable
	
	public Chicken layEggs()
	{
		this.eggs++;
		Chicken.eggsFarm++;
		return this;
	}
	
	public static double eggsAverage(int chickens)  
	{
		return eggsFarm / chickens ;
	}
}
