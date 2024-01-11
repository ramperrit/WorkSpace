package Chapter7;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver("홍길동");
		
		Bus bus = new Bus();
		driver.vehicle = bus;
		driver.drive();
		
		Taxi taxi = new Taxi();
		driver.vehicle = taxi;
		driver.drive();
	}
	
	static void method(Parent p) {
		p.method2();
		if(p instanceof Child c) {
			c.method();
		}
	}

}
