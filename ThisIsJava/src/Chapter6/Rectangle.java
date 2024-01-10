package Chapter6;

public class Rectangle {
	
	//자동 생성
	Rectangle(){
		System.out.println("Rectangle 객체를 생성하였습니다.");
	}
		
	int area(int x, int y) {
		int result = x * y;
		System.out.println("가로가 " + x + ", 세로가 " + y + "인 직사각형의 넓이 : " + result);
		return result;
	}
	
	int round(int x, int y) {
		int result = 2*(x+y);
		System.out.println("가로가 " + x + ", 세로가 " + y + "인 직사각형의 둘래 : " + result);
		return result;
	}
	
	double area(double x, double y) {
		double result = x * y;
		System.out.println("가로가 " + x + ", 세로가 " + y + "인 직사각형의 넓이 : " + result);
		return result;
	}

}
