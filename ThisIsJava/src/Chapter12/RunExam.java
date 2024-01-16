package Chapter12;

import java.io.*;

public class RunExam {

	public static void main(String[] args) throws IOException {
		InputStreamReader rd = new InputStreamReader(System.in);
		
		int gear = 0;
		int speed = 0;
		
		while(gear<3){
		System.out.println("------------------------");
		System.out.println("1. 증속 | 2. 감속 | 3. 중지");
		System.out.println("------------------------");		
		
		switch(gear) {
		case 0 :
			System.out.println("현재 속도= "+ speed);
			System.out.println("선택: ");
			gear = System.in.read()-48;
			System.in.read();
			System.in.read();
			break;
		case 1 :
			speed++;
			System.out.println("현재 속도= "+ speed);
			System.out.println("선택: ");
			gear = System.in.read()-48;
			System.in.read();
			System.in.read();
			break;
		case 2 :
			speed--;
			System.out.println("현재 속도= "+ speed);
			System.out.println("선택: ");
			gear = System.in.read()-48;
			System.in.read();
			System.in.read();
			break;
		}
	}
		System.out.println("프로그램 종료");
}
}
