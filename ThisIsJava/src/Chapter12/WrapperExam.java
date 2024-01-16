package Chapter12;

public class WrapperExam {

	public static void main(String[] args) {

		Integer I = new Integer(100); //deprecated(더이상 사용되지 않는)   ==> 더이상 사용하지 않는게 좋음을 알려줌
		Integer i = 100;              //권장 형태    //객체
		int a = 10;					  //원시타입
		
		//객체와 원시타입의 연산시 언박싱을 자동으로 해줌
		System.out.println(i + a);
		
		Integer b = 300;
		Integer c = 300;
		System.out.println(b==c);  // false : int 범위 -127~127 
		System.out.println(b.equals(c)); // true
		
	}

}
