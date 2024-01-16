package Chapter05;

public class ForEach {

	public static void main(String[] args) {
		String[] strArr = {"자바", "파이썬", "리액트", "AWS"};
		
		for(int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		for(String item : strArr) {
			System.out.println(item);
		}

	}

}
