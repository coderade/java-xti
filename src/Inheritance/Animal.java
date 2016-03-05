package Inheritance;

public abstract class Animal 
{
	double weight;
	String food;
	String name;
	protected int key;
	
	public abstract void sleep();
	
	public Animal(String name, String food, double weight) 
	{
		this.name = name;
		this.weight = weight;
		this.food = food;
	}
	public abstract void Eat();
	
	public abstract void MakeNoise();
	
}
