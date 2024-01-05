package Chapter3;

import java.util.*;
import java.math.*;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int dice1 = (int) Math.random() * 6 + 1;
		int dice2 = (int) Math.random() * 6 + 1;
		int dice3 = (int) Math.random() * 6 + 1;
		
		if(dice1 == dice2 && dice2 == dice3) {
			int money = 10000 + dice1 * 100;
			System.out.println(money);
		}else if(((dice1 == dice2)&&(dice2!=dice3)) || ((dice1==dice3)&&(dice1!=dice2))) {
			int money = 1000 + dice1 * 100;
		}else if((dice2 == dice3)&&(dice2!=dice1)) {
			int money = 1000 + dice1 * 100;
		}else {
			int money = 1000 +  * 100;
		}
		
		System.out.println("첫 번째 주사위를 굴리시겠습니까? -> [enter]");
		
		
	}

}
