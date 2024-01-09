package Chapter06;

public class Car { //명시적 초기화
	String model = "현대 자동차";
	int speed = 60;      // 필드값
	boolean start = true;
	
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
	
	

}

// 디폴트 << 명시적 초기화 << 초기화 블럭 << 생성자 
// 가장 마지막으로 받는 값은 생성자