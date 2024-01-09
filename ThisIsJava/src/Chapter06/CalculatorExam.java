package Chapter06;

public class CalculatorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.plus(10,10);
		cal.powerOn();
		System.out.println(cal.plus(10,20));
		System.out.println(cal.minus(10,20));
		System.out.println(cal.plus(15.5,17.5));
		
		//                         배열로도 가능 int[]
		System.out.println(cal.sum(1,2,3,4,5,6,7,8,9,10));
		cal.powerOff();
	}

}
