package Chapter7;

public class Taxi extends Vehicle{
	@Override
	public void run(String name) {
		super.run(name);
		System.out.println("택시가 움직입니다.");
	}
}
