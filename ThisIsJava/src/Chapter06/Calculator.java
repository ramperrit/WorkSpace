package Chapter06;

public class Calculator {

	boolean power = false;
	
	
	//전원 켜기
	void powerOn() {
		this.power = true;
		System.out.println("전원을 켭니다.");
	}
	//전원 끄기
	void powerOff() {
		this.power = false;
		System.out.println("전원을 끕니다.");
	}
	
	double plus(double x, double y) {
		double result = 0;
		if(power) {
			return x + y;
		}else {
			System.out.println("전원이 꺼져있습니다.");
		}
		return result;
	}
	int minus(int x, int y) {
		int result = 0;
		if(power) {
			return x - y;
		}else {
			System.out.println("전원이 꺼져있습니다.");
		return result;
	    }
    }
	
	// 제한없이 값받기 => 배열로 받음 => 배열로 써도 ㄱㅊ
	//      int[] values
	int sum(int...values) {
		int result = 0;
		for(int v : values) {
			result += v;
		}
		return result;
	}
	
}