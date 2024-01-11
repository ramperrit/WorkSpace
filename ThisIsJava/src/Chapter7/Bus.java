package Chapter7;

public class Bus extends Vehicle {
	@Override
	public void run(String name) {
		super.run(name);
		System.out.println("버스가 움직입니다.");
	} 

}
