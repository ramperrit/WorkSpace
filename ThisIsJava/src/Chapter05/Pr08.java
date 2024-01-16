package Chapter05;

public class Pr08 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 96},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int avg = 0;
		int cnt = 0;
		
		//배열 항목의 전체 합과 평균을 구하라
		for(int[] i : array) {
			for(int j : i) {
				sum += j;
				cnt ++;
			}
			avg = sum/cnt;
			}
		System.out.println(sum);
		System.out.println(avg);
			

	}
	}

