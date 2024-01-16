package Chapter03;

import java.util.*;

public class RoomNum {

	public static void main(String[] args) {
		//입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("출입증에 표기된 호수를 입력하세요 -->");
		int roomNum = Integer.parseInt(scan.nextLine());
		
		switch(roomNum){
		case 101 :
			System.out.println("출입 가능한 연구실:");
			System.out.println("1. 101호");
			break;
		case 102 :
			System.out.println("출입 가능한 연구실:");
			System.out.println("1. 101호");
			System.out.println("2. 102호");
			break;
		case 103 :
			System.out.println("출입 가능한 연구실:");
			System.out.println("1. 101호");
			System.out.println("2. 102호");
			System.out.println("3. 103호");
			break;
		case 201 :
			System.out.println("출입 가능한 연구실:");
			System.out.println("1. 101호");
			System.out.println("2. 102호");
			System.out.println("3. 103호");
			System.out.println("4. 201호");
			break;
		case 202 :
			System.out.println("출입 가능한 연구실:");
			System.out.println("1. 101호");
			System.out.println("2. 102호");
			System.out.println("3. 103호");
			System.out.println("4. 201호");
			System.out.println("5. 202호");
			break;
		case 301 :
			System.out.println("출입 가능한 연구실:");
			System.out.println("1. 101호");
			System.out.println("2. 102호");
			System.out.println("3. 103호");
			System.out.println("4. 201호");
			System.out.println("5. 202호");
			System.out.println("6. 301호");
			break;
			default:
				System.out.println("다시 입력해주세요");
		}
		

	}

}
