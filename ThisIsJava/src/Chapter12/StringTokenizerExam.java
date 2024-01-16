package Chapter12;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String str = "홍길동 26 남성";  //주어진 데이터
		String[] datas = str.split(" "); //공백으로 구분하여 배열 생성
		String name = datas[0];
		String age = datas[1];
		String gender = datas[2];

		
		StringTokenizer st = new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			System.out.println("남은 토큰의 수: " + st.countTokens());
			System.out.println(st.nextToken()	);
		}
	}

}
