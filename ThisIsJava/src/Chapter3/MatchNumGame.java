package Chapter3;

import java.util.*;

public class MatchNumGame {

	public static void main(String[] args) {
		
		//반복횟수 변수
		int reTry = 0;
		//리겜변수
		String conti;
		//리겜
		do {
			//준비값
		int answer = (int)(Math.random()*100 + 1);
		
		//입력값 준비
		Scanner scan = new Scanner(System.in);
		int num;
		
		//비교
		
		do {
			System.out.println("1~100 사이의 숫자를 입력하십시오. -->");
		    num = Integer.parseInt(scan.nextLine());
			reTry++;
			if(num > answer) {
				System.out.println("정답은 해당 숫자보다 작습니다.");
			} else if (num < answer) {
				System.out.println("정답은 해당 숫자보다 큽니다.");
			} else {
				System.out.println("정답입니다!");
				System.out.printf("추측 횟수는 %d번 입니다.\n",reTry);
			}
			
		} while (num != answer);
		     System.out.println("계속 하시겠습니까?(y/n):"); 
		     conti =  scan.nextLine();
		} while (conti.equals("y"));
		System.out.println("프로그램을 종료합니다.");
	}

}
