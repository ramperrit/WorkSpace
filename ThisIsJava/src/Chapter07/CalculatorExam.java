package Chapter07;

public class CalculatorExam {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원의 넓이 : "+cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원의 넓이 : "+com.areaCircle(r));
	}

}