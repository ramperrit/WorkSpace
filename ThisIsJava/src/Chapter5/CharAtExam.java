package Chapter5;

public class CharAtExam {

	public static void main(String[] args) {
		
		String ssn = "956241230123";
		char gender = ssn.charAt(6);
		System.out.println(gender);
		switch(gender){
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
		}
	}

}
