package Chapter8;

public class BusExam {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); error
		
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
		Vehicle taxi = new Taxi();
		
		System.out.println();
		
		ride(taxi);
		ride(bus);
		
	}
	
	static void ride(Vehicle v) {
		v.run();
		if(v instanceof Bus b) {
//			Bus b = (Bus)v; 숨겨짐
			b.checkFare();
		}
	}

}
