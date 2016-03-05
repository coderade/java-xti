package Inheritance;

public class Duck extends Animal
{
	
	public Duck() 
	{
		super("Donald Duck", "fish", 10);
	}
		  
	public void MakeNoise()
	{
		System.out.println("Quack quack");
	}

	@Override
	public void Eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
}

