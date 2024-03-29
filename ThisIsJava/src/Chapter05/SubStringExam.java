package Chapter05;

public class SubStringExam {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		//3번부터 끝까지 잘라냄
		String str = subject.substring(3);
		System.out.println(str);
		
		//0부터 2 앞까지
		String str2 = subject.substring(0,2);
		System.out.println(str2);
		
		//문자열 찾기 ( -1 반환 : 문자가 없다)
		int index = subject.indexOf("자바");
		System.out.println(index);
		
		if(index != -1) {
			System.out.println("자바에 관련된 검색어가 있습니다.");
		}else {
			System.out.println("자바에 관련된 검색어가 없습니다.");
		}
  
		//split
		String fruit = "사과 딸기 포도 귤";
		String[] fruitList =  fruit.split(" ");
		System.out.println(fruitList[1]);
	}

}
