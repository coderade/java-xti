
public class Car 
{
	String model;
	int MaxSpeed;
	int Oto100Km;
	Engine engine;
	
	public Car ()
	{
		
	}
	
	public Car(String model, int MaxSpeed, int Oto100Km)
	{
		this(model, MaxSpeed, Oto100Km, null);
	}

	public Car(String model, int MaxSpeed, int Oto100Km, Engine engine)
	{
		this.model = model;
		this.MaxSpeed = MaxSpeed;
		this.Oto100Km = Oto100Km;
		this.engine = engine;
		
	}
	
}
