package Inheritance;

public final class Dog extends Animal 
{
	public Dog ()
	{
		super("Bob", "bone", 30);
	}

	@Override
	public void Eat() {
		
	}

	@Override
	public void MakeNoise() 
	{
		System.out.println("Auau");
		
	}
	
	public void sleep()
	{
		
	}
	
	

}
