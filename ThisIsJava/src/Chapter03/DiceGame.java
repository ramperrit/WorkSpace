package Chapter03;

import java.util.*;
import java.math.*;

public class DiceGame {

	public static void main(String[] args) {
		
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);
		int dice3 = (int) (Math.random() * 6 + 1);
		int money;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 주사위를 굴리시겠습니까? -> [enter]");
		scan.nextLine();
		System.out.println("첫 번째 주사위 값 :"+dice1);
		System.out.println("두 번째 주사위를 굴리시겠습니까? -> [enter]");
		scan.nextLine();
		System.out.println("두 번째 주사위 값 :"+dice2);
		System.out.println("세 번째 주사위를 굴리시겠습니까? -> [enter]");
		scan.nextLine();
		System.out.println("세 번째 주사위 값 :"+dice3);
		
		if(dice1 == dice2 && dice2 == dice3) {
			 money = 10000 + dice1 * 100;
			System.out.println("총 상금은 "+ money +"원 입니다.");
		}else if(((dice1 == dice2)&&(dice2!=dice3)) || ((dice1==dice3)&&(dice1!=dice2))) {
			 money = 1000 + dice1 * 100;
			System.out.println("총 상금은 "+ money +"원 입니다.");
		}else if((dice2 == dice3)&&(dice2!=dice1)) {
			 money = 1000 + dice1 * 100;
			System.out.println("총 상금은 "+ money +"원 입니다.");
		}else if((dice1 >= dice2) && (dice1 >= dice3)) {
			 money = dice1 * 100;
			System.out.println("총 상금은 "+ money +"원 입니다.");
		}else if((dice2 >= dice1) && (dice2 >= dice3)) {
			 money = dice2 * 100;
			System.out.println("총 상금은 "+ money +"원 입니다.");
		}else if((dice3 >= dice1) && (dice3 >= dice2)) {
			 money = dice3 * 100;
			System.out.println("총 상금은 "+ money +"원 입니다.");
			}
		
	}

}
