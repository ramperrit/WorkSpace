package Chapter05;

public class NsArray {

	public static void main(String[] args) {
//		int[][] array = {
//				{1,2,3},
//				{4,5,6},
//				{7,8,9}
//		};
//		//주소값 hashCode형태
//		System.out.println(array[0]);
//		//다차원 배열
//		System.out.println(array[0][2]);
		
		//초기값없이 사이즈만 결정 행,열중 하나만 설정해도 ㄱㅊ
		int[][] heights = new int[3][3];
		//1반
		heights [0][0] = 160;
		heights [0][1] = 165;
		heights [0][2] = 170;

		//2반
		for (int i=0; i<heights[0].length;i++) {
			heights[1][i] = 170;
		}
		
		//3반
		for (int i=0; i<heights[0].length;i++) {
			heights[2][i] = 180;
		}
		
		for(int i=0; i<heights.length; i++) {
			System.out.print((i+1)+"반 학생들의 키 : ");
			for(int j=0; j<heights[i].length; j++) {
				if(j==heights[i].length-1) {
				System.out.print(heights[i][j]);
				break;
			}
			System.out.print(heights[i][j] + ", ");
			}
		}
		System.out.println();
	}

}
