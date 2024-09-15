package assign5_5;

public class Main {

	public static void main(String[] args) {
		Car c = new Car();
		c.startEngine();
		c.stopEngine();
		
		Motorcycle m = new Motorcycle();
		m.startEngine();
		m.stopEngine();
		
		Vehicle v = new Car();
		v.startEngine();
		v.stopEngine();
		
		Vehicle v1 = new Motorcycle();
		v1.startEngine();
		v1.stopEngine();
		
		Vehicle v2 =new Vehicle();
		v2.startEngine();
		v2.stopEngine();
	}

}
