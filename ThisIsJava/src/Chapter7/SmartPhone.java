package Chapter7;

public class SmartPhone extends Phone {

	public boolean wifi;
	
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이의 상태를 변경합니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
//	SmartPhone(String model, String color){
////		super.color = color;
////		super.model = model;
//		super(model, color);
//	}
}
