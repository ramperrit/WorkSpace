package Chapter6;

public class Car { //명시적 초기화
	String model = "현대 자동차";
	int speed = 60;      // 필드
	boolean start = true;
	static int gas; // 정적 멤버 = class 멤버 => 이 값은 같은 필드를 가지는 인스턴스간에 공유하는 값 => 마지막 값을 필드가 같은 인스턴스들 모두가 가짐
	
	// 초기값 블럭
	{  
		model = "기아자동차";
		speed = 60;
	}
	
	// 생성자
	Car() {
		speed = 30;
	}
	
	Car(int speed){
		
		this.speed = speed;
		//필드값 = int 변수값
	}
	
	//타입이 다르면 오버로딩이 가능하다
	Car(String m){
		model = m;
	}
	
	// 입력값의 순서가 달라져도 오버로딩이 가능하다
	Car(String model, int speed, boolean start){
		this.model = model  ;
		this.speed = speed ;
		this.start = start  ;
	}
	Car(String m, boolean st, int s){
		model = m  ;
		speed = s ;
		start = st  ;
	}
	
	String drive(String name) {
		return name + "을 태우고 " + this.speed + "의 속도로 출발합니다.";
	}
	
	static void printGas() {
		System.out.println(gas);
//		System.out.println(speed); 불가능 => speed는 인스턴스가 필요한 멤버 // 정적 메소드 안에는 인스턴스멤버가 들어갈수없다. // 메모리에 올리는 시기가 다름
	}
	
	static {
		gas = 20;
	}

}

// 디폴트 << 명시적 초기화 << 초기화 블럭 << 생성자 
// 가장 마지막으로 받는 값은 생성자
