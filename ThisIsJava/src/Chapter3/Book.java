package Chapter3;

import java.util.*;

public class Book {

	public static void main(String[] args) {

		//입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("책을 몇권 읽으셨나요? -->");
		int book = Integer.parseInt(scan.nextLine());
		
		//Switch-case문
		
		switch(book/10){
			//10권 미만
			case 0:
				System.out.println("조금 더 노력하세요");
				break;
			//10~19
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이시네요!");
				break;
			//20~29
			case 2:
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			//30~
			default:
				System.out.println("당신은 다독왕입니다!");

		}
	}

}
