package Chapter11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingExam {

	public static void main(String[] args) {
		String[] arr = new String[] {"100","1oo"};
		
		try {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			int value = Integer.parseInt(arr[i]);
			}
		}
//		catch(NumberFormatException e) {
//			System.out.println("숫자가 아닌 것이 포함되어있습니다.");
//		}
//		catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 인덱스가 초과했습니다.");
//		}
		catch(Exception e) {
			System.out.println("처리 불가능");
		}
		FileInputStream fis;
		try {
			fis = new FileInputStream("abc.txt");
			fis.close();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}catch(IOException e) {
			System.out.println();
		}
		finally {
			
		}
	}

}
