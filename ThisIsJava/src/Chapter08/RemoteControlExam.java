package Chapter08;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		// 인터페이스 타입 = 구현 클래스를 모두 가진다. //타입에 명시된 매서드만 visible
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);

		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(15);
		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();

		//인스턴스 구현필요없는 static 값
		RemoteControl.changeBattery();
		
//		System.out.println(RemoteControl.MAX_VOLUME);
//		System.out.println(RemoteControl.MIN_VOLUME);
		
		
		
	}

}
