package Chapter07;

public class Phone {

	public String model;
	public String color;
	
//	public Phone(String model, String color) {
//	
//	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대: " + message);
	}
	public void hangUp() {
		System.out.println("통화를 종료합니다.");
	}
}
