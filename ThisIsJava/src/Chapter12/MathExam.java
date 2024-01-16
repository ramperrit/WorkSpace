package Chapter12;

public class MathExam {

	static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
	}
	
	static int maxVal(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
		max = Math.max(max, i);
		}
		return max;
	}
	
	static int maxVal2(int[] arr) {
		int max = Integer.MAX_VALUE;
		for(int i : arr) {
		max = Math.min(Math.abs(i),max);
		}
		return -max;
	}
	
	
	
	public static void main(String[] args) {

		//1
		System.out.println(distance(3, 6, 1, 2));
		
		
		//2
		int[] arr = {-123, -56, -32, -256, -4, -96};
		System.out.println(maxVal(arr));
		
		//2-2
		System.out.println(maxVal2(arr));
		
		
		
	}

}
