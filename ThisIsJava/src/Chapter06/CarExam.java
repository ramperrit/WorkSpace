package Chapter06;

public class CarExam {

	public static void main(String[] args) {
	    Car myCar = new Car("dkdkdk", 60, true);//자동차 인스턴스
	    System.out.println("내 차의 모델명 : "+myCar.model);
	    System.out.println("내 차의 모델명 : "+myCar.speed);
	    System.out.println("내 차의 모델명 : "+myCar.start);
	    System.out.println(myCar.drive("홍길동"));
	}

}
