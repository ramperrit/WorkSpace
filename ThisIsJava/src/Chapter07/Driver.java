package Chapter07;

public class Driver {
	public Vehicle vehicle;
	public String name;
	
	Driver(String name){
		this.name = name;
	}
	
	public void drive() {
		vehicle.run(this.name);
	}
	
}
