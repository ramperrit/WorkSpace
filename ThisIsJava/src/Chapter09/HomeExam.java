package Chapter09;

public class HomeExam {

	public static void main(String[] args) {
		Home home = new Home();
		
		home.rc.turnOn();
		home.rc.turnOff();
		
//		RemoteControl rc = new RemoteControlImpl();
//		home.useRemoteControl(rc);
		
		
		//1회성, 재사용 없을 때 사용
//		RemoteControl rc = new RemoteControl() {
//			
//			@Override
//			public void turnOn() {
//				System.out.println("전원을 켭니다.");
//			}
//			@Override
//			public void turnOff() {
//				System.out.println("전원을 끕니다.");
//			}
//		};
//		home.useRemoteControl(rc);
		
		
	}

}
