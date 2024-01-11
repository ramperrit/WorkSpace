package Chapter7;

public class Computer extends Calculator {
	
	@Override
	public double areaCircle(double r) {
		//부모 메소드 실행
		super.areaCircle(r);
		
		System.out.println("Computer의 areaCircle() 메소드입니다.");
		return Math.PI * r * r;
	}
}
