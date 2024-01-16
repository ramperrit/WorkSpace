package Chapter03;

import java.util.*;

public class BillCalc {

	public static void main(String[] args) {

		//입력 받기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구매 금액을 입력하세요 --> ");
		int buyPrice = Integer.parseInt(scan.nextLine());
		
		//변수 설정
		int discount = 0;
		int price = buyPrice - discount; 
		
		//10만원 미만
		if (buyPrice < 100000) {
			System.out.printf("구매 금액 : %d원\n",buyPrice);
			System.out.printf("할인액 : %d원\n",discount);
			System.out.printf("청구 금액 : %d원",price);
		}
		//10~30만원
		else if (100000<= buyPrice && buyPrice < 300000) {
			discount = 5000;
			System.out.printf("구매 금액 : %d원\n",buyPrice);
			System.out.printf("할인액 : %d원\n",discount);
			System.out.printf("청구 금액 : %d원",price);
		}
		//30만원 이상
		else {
			discount = 30000;
			System.out.printf("구매 금액 : %d원\n",buyPrice);
			System.out.printf("할인액 : %d원\n",discount);
			System.out.printf("청구 금액 : %d원",price);
		}
		
	}

}

