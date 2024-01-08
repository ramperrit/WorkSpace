package Chapter5;

import java.util.*;

public class Student2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//학급 수 받기
		System.out.println("학급 수를 입력하세요 -->");
		int classNum = Integer.parseInt(scan.nextLine());
		
	    // 2차원 배열
		int[][] heights = new int [classNum][];
		String[][] studentNames = new String[classNum][];
		
		//반의 학생수 받기
		for (int i=0;i<classNum;i++) {
		System.out.print((i+1)+"반의 학생 수를 입력하세요-->");
		int studentNum = Integer.parseInt(scan.nextLine()); //3
		// 학생수를 heights의 행에 설정
		heights[i] = new int[studentNum]; // [ , , ]
		
		// 학생수를 s.N.의 행에 설정
		studentNames[i] = new String [studentNum]; // [ , , ]
	
		//각 반의 이름,키 데이터 받기
				for (int j=0;j<studentNum;j++) {
					System.out.println("----------입력----------");
					System.out.print((i+1)+"반의"+(j+1)+"번 학생의 이름과 키를 공백으로 구분하여 입력하세요-->");
					String input = scan.nextLine();
					String[] info = input.split(" ");
					//s.N. 의 열에 info[0]값 부여
					studentNames[i][j] = info[0];
					// 정수로 받기
					int height = Integer.parseInt(info[1]);
					// heights의 열에 정수값 부여
					heights[i][j] = height;
					
				}
		}
		//출력
				for(int i=0;i<heights.length;i++){
					System.out.print((i+1)+"반 학생들의 키: ");
					for(int j=0;j<heights[i].length;j++) {
						if(j==heights[i].length-1) {
						System.out.print(studentNames[i][j]+"("+heights[i][j]+")");
						break;
					}
					System.out.print(studentNames[i][j]+"("+heights[i][j]+")"+", ");
					
				}System.out.println();
		}
	}
}

//split 안쓰기 => next써서 buffer값 가져오기
// names [][] = scan.next();
// height[][] = Integer.parseInt(scan.next());


// 배열 분리 단점
// 







