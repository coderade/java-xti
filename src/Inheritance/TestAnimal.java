package Inheritance;

public class TestAnimal {

	public static void noise(Animal anima)
	{
		anima.MakeNoise();
	}
	
	public static void noiseWithoutPolimorfism (String animal)
	{
		if (animal.equals("Donald"))
		{
			System.out.println("The Donald is making noise!");
		}
		else if (animal.equals("Scoobydoo"))
		{
			System.out.println("The Scoobydoo is making noise!");
		}
	}
	public static void main(String[] args) 
	{
		Dog Scoobydoo = new Dog();
		Scoobydoo.food = "Scooby Snacks";
		Scoobydoo.weight = 20;
		Scoobydoo.MakeNoise();
		
		Duck Donald = new Duck();
		Donald.MakeNoise();
	
		
	
		/*System.out.println(Scoobydoo instanceof Dog);// Is ScoobyDoo a dog?

		System.out.println(Donald.equals(Scoobydoo));// Donald is equals ScoobyDoo?
		System.out.println(Scoobydoo.hashCode());
		System.out.println(Scoobydoo.toString());*/
	
		Scoobydoo.MakeNoise();
		noise(Donald);
		
		noiseWithoutPolimorfism("Donald");
		noiseWithoutPolimorfism("Scoobydoo");
	}
	
	

}
