
public class CarTest {

	public static void main(String[] args) {

		Car Ferrari = new Car();
		Ferrari.MaxSpeed =350;
		Ferrari.model = "125S";
		Ferrari.Oto100Km = 3;
		Engine V12 = new Engine();
		V12.type ="V12";
		V12.enginePower = 690;
		Ferrari.engine = V12;
		
		
		Car Lamborghini = new Car("Lamborghini", 380, 4);
		Engine V8 = new Engine ("V8", 700);
		Lamborghini.engine = V8;
		
		
		Engine V3 = new Engine("V3", 230);
		Car RangerRover = new Car ("RangeRover", 370, 8, V3);
		System.out.println(RangerRover.MaxSpeed);
		
		Car Bugatti = new Car("Bugatti Veyron", 430, 4,  new Engine("V12", 1200) );
		System.out.println(Bugatti.engine.enginePower);
	}
	
 

}
