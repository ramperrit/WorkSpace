package Chapter08;

public class SmartTvImpl implements SmartTv{

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
	
}
