package Chapter9;

public class Home {
	
	//필드 1
	//런타임 중 익명객체 구현
	RemoteControl rc = new RemoteControl() {
		//인터페이스 구현
		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}
	};

	//필드 2
	//상속 객체 > 익명
	RemoteControl rc2 = new RemoteControlImpl() {
		public void volumeUp() {
			System.out.println("볼륨을 높입니다.");
		}
	};
	
	//
	public void useRemoteControl(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
