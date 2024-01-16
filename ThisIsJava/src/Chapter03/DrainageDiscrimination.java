package Chapter03;

import java.util.*;


public class DrainageDiscrimination {

	public static void main(String[] args) {
		//입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력해 주세요 ->");
		int num = Integer.parseInt(scan.nextLine());
		
		//3의 배수인가
		if (num%3==0) {
			System.out.println("3의 배수 입니다.");
		}
		//4의 배수인가
		if (num%4==0) {
			System.out.println("4의 배수 입니다.");
		}
		if (num%6==0) {
			System.out.println("6의 배수 입니다.");
		}
		if (num%8==0) {
			System.out.println("8의 배수 입니다.");
		}
}
}

