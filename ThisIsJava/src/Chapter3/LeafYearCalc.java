package Chapter3;

import java.util.*;

public class LeafYearCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를 입력하세요 ->");
		int year = Integer.parseInt(scan.nextLine());
		if (year%4 == 0 && !(year%100 == 0)) {
			System.out.println("윤년입니다.");
		}else if(year%400 == 0) {
			System.out.println("윤년입니다.");
		}
		else  {
			System.out.println("윤년이 아닙니다.");
		}
	}

}
