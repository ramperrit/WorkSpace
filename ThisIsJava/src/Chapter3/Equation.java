package Chapter3;

import java.util.*;

public class Equation {

	public static void main(String[] args) {
		//입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("a값을 입력하세요 -->");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("b값을 입력하세요 -->");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println("c값을 입력하세요 -->");
		int c = Integer.parseInt(scan.nextLine());
		
		//방정식
		for (int x = 0; a*x <= c; x++) {
			for (int y = 0; b*y <= c; y++) {
				int result = a * x + b * y ;
				
				if(result == c) {
					System.out.printf("해당 방정식을 만족하는 모든 해를 출력합니다...\n (%d,%d)\n",x,y);
					
				}
			}
		}
		
	}

}
