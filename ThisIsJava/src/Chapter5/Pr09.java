package Chapter5;

import java.util.*;

public class Pr09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[]scores = null;
		int choice =0;
		int sum =0;
		double avg =0;
		int max = 0;
		
		//반복 출력 while 
		while(true) {
		System.out.println("---------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
		System.out.println("---------------------------------------------");
		
		//선택값 받기
		System.out.println("선택> ");
		choice = Integer.parseInt(scan.nextLine());
		
		//1.학생수
		if(choice==1) {
		System.out.printf("선택> %d\n",choice);
		System.out.println("학생수> ");
		int numOfStudent = Integer.parseInt(scan.nextLine());
		scores = new int[numOfStudent];  // [,,,,]
		}
		
		
		//2.점수입력
		else if(choice==2) {
		System.out.printf("선택> %d\n",choice);
		for(int j=0;j<scores.length;j++) {
		System.out.printf("scores[%d]> ",j);
		scores[j] = Integer.parseInt(scan.nextLine());
		
		   }
		}
		
		//3. 점수리스트
		else if(choice==3) {
		System.out.printf("선택> %d\n",choice);
		for(int j=0;j<scores.length;j++) {
		System.out.printf("scores[%d]: %d\n",j,scores[j]);
		}
		}
		
		//4. 분석
		else if(choice==4) {
		System.out.printf("선택> %d\n",choice);
		for(int k : scores) {
			sum += k;
			max = Math.max(max,k);
			avg = sum/scores.length;
		}
		System.out.println("최고 점수: "+max);
		System.out.println("평균 점수: "+avg);
		}

		//5. 종료
		else if(choice==5) {
			System.out.println("선택>"+choice);
			System.out.println("프로그램 종료");
			break;
		}
	}
		scan.close();
	}

}
