package Chapter6;

public class CarExam2 {

	public static void main(String[] args) {
//		Car car1 = new Car(); //자동차 인스턴스 1
//		Car car2 = new Car(); //자동차 인스턴스 2
		
		
//		car1.gas = 10;
//		car2.gas = 20;
//		car1.gas = 30;
//		Car.gas = 10;
		
		
//		System.out.println("car1's gas : "+car1.gas);
//		System.out.println("car2's gas : "+car2.gas);
		System.out.println("car3's gas : "+Car.gas); // car#는 모두 같은 값을 가지므로 언급없어도 값이 출력됨 
		// gas값은 이미 클래스 영역에 존재하여 car3 인스턴스를 생성안해도 출력 가능  
		
		Car.printGas();
		
	}

}
