package Chapter09;

public class RemoteControlImpl implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
