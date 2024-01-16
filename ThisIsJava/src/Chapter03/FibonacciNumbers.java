package Chapter03;

import java.util.*;

public class FibonacciNumbers {

	public static void main(String[] args) {

		//입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 --> ");
		int num = Integer.parseInt(scan.nextLine());
		
		//초기값 설정
		int first = 0;
		int second = 1;
		int next = 0;
		
		//피보나치 수 계산
		for (int i = 0; i < num; i++) {
			next = first + second;
			first = second;
			second = next;
			System.out.println(first);
		}
		
		
	}

}
