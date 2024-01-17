package Chapter08_Example4_Sol;

import java.lang.reflect.Method;
import java.util.Scanner;

public class StudentDriver2 {
	
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Student s1 = new Student("선남");
		Student s2 = new Student("선녀");
		try {
			invokeMethod(s1, "퀴즈", "setQuizScore");
			invokeMethod(s1, "중간시험", "setMiddleScore");
			invokeMethod(s1, "기말시험", "setFinalScore");
			System.out.println(s1.name + "의 총점은 " + s1.getTotal() + "이고 학점은 " + s1.getGrade() + "이다.");
			invokeMethod(s2, "퀴즈", "setQuizScore");
			invokeMethod(s2, "중간시험", "setMiddleScore");
			invokeMethod(s2, "기말시험", "setFinalScore");
			System.out.println(s2.name + "의 총점은 " + s2.getTotal() + "이고 학점은 " + s2.getGrade() + "이다.");
		}catch (Exception e) {
			// 문제가 있음
		}
		
		
		sc.close();
	}
	
	private static void invokeMethod(Student s, String keyword, String methodName) throws Exception {
		while(true) {
			System.out.print(s.name + "의 " + keyword +" 점수를 입력하라: ");			
			if((boolean)s.getClass()
					.getDeclaredMethod(methodName, int.class)
					.invoke(s, Integer.parseInt(sc.nextLine()))) 
				break;
		}
	}

}
