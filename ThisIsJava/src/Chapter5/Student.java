package Chapter5;

import java.util.*;

public class Student {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//학급 수 받기
		System.out.println("학급 수를 입력하세요 -->");
		int classNum = Integer.parseInt(scan.nextLine());
		
	    //배열
		int[][] heights = new int [classNum][];
		
		//반의 학생수 받기
		for (int i=0;i<classNum;i++) {
		System.out.print((i+1)+"반의 학생 수를 입력하세요-->");
		int studentNum = Integer.parseInt(scan.nextLine());
		heights[i] = new int[studentNum];
	
		//각 반의 키 데이터 받기
				for (int j=0;j<studentNum;j++) {
					System.out.println((i+1)+"반의"+(j+1)+"번 학생의 키를 입력하세요-->");
					heights[i][j] = Integer.parseInt(scan.nextLine());
				}
		}
				for(int i=0;i<heights.length;i++){
					System.out.print((i+1)+"반 학생들의 키: ");
					for(int j=0;j<heights[i].length;j++) {
						if(j==heights[i].length-1) {
						System.out.print(heights[i][j]);
						break;
					}
					System.out.print(heights[i][j]+", ");
					
				}System.out.println();
		}
	}
}
