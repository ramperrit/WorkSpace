package Chapter03;

import java.math.*;

public class AccuracyExample {

	public static void main(String[] args) {
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - number * pieceUnit;
//		
//		System.out.println(result);
	
	
//	int apple = 1;
//	int number = 7;
//	double result = (apple*10-number)/10.0;
//	
//	  System.out.println(result);
		
		BigDecimal apple = new BigDecimal(1);
		BigDecimal pieceUnit = new BigDecimal("0.1");
		BigDecimal number = new BigDecimal(7);
		
		BigDecimal tmp = number.multiply(pieceUnit);
		BigDecimal result = apple.subtract(tmp);
		System.out.println(result);
		
	}
}