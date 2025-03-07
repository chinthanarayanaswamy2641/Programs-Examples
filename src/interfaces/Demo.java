package interfaces;

public class Demo {

	public static void main(String[] args) {
		Vehicle c=new Car();
		Vehicle b=new Bike();
		c.start();
		c.stop();
		b.start();
		b.stop();
	}

}
