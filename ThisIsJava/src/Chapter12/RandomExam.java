package Chapter12;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis()); //시간을 활용해서 중보없는 난수값 생성
		System.out.println(rand.nextInt(6)+1);  //주사위
	}

}
