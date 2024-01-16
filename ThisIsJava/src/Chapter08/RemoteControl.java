package Chapter08;

public interface RemoteControl {
	public void turnOn();
	
	//반드시 선언과 동시에 초기화
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOff();
	void setVolume(int volume);
	void getVolume();
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음을 해제합니다.");
		}
	}
	
	//정적 메소드: rc. 호출 없이 호출가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
