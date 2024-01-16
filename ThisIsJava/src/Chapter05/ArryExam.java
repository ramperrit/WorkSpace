package Chapter05;

public class ArryExam {

	public static void main(String[] args) {
		int[] heights = new int[5]; //초기값:[0,0,0,0,0]
		heights [0] = 170;
		heights [1] = 174;
		heights [2] = 176;
		heights [3] = 179;
		heights [4] = 180;
		
		// 배열의 복사 : 얕은 복사 or 깊은 복사
	    //얕은 복사 : 공유하고 있는 모든 변수가 영향을 받음
//		int[] heights2 = heights;
//		heights2[0] = 190;
		
		//깊은 복사 : 같은 값을 가져와서 새로운 배열 형성
		//case1
//		int[] heights2 = new int[heights.length];
//		for(int i=0; i<heights.length; i++) {
//			heights2[1] = heights[1];
//		}
		//case2
		int[] heights2 = new int[heights.length];
		//원배열의 0번부터 복사해서 본배열을 0번부터5번까지 붙여넣기
		System.arraycopy(heights, 0, heights2, 0, 5);
		heights2[0]=190;
		
		
		
		for (int i=0; i<heights.length;i++) {
			System.out.println((i+1)+"번째 학생의 키 : "+heights[i]);
		}
		
		System.out.println();
		
		
		for (int i=0; i<heights2.length;i++) {
			System.out.println((i+1)+"번째 학생의 키 : "+heights2[i]);
		}
	}

}
