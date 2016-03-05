
public class ChickenTest {

	public static void main(String[] args) 
	{
		Chicken pintadinha = new Chicken();
		pintadinha.layEggs().layEggs().layEggs().layEggs();
		System.out.println("The chicken pintadinha lays " + pintadinha.eggs + " eggs!");
		
		Chicken woody = new Chicken();
		woody.layEggs().layEggs();
		System.out.println("The chicken woody lays " + woody.eggs + " eggs!");
		System.out.println("All chickens lay " + Chicken.eggsFarm + " eggs!");
		System.out.println("The average of eggs is: " + (Chicken.eggsAverage(2) + " for Chicken!"));
	}

}
