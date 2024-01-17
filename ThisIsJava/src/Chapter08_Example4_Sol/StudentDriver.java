package Chapter08_Example4_Sol;

import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("선남");
		Student s2 = new Student("선녀");
		
		while(true) {
			System.out.print(s1.name + "의 퀴즈 점수를 입력하라: ");
			boolean pass = s1.setQuizScore(Integer.parseInt(sc.nextLine()));
			if(pass) break;
		}
		while(true) {
			System.out.print(s1.name + "의 중간시험 점수를 입력하라: ");
			boolean pass = s1.setMiddleScore(Integer.parseInt(sc.nextLine()));
			if(pass) break;
		}
		while(true) {
			System.out.print(s1.name + "의 기말시험 점수를 입력하라: ");
			boolean pass = s1.setFinalScore(Integer.parseInt(sc.nextLine()));
			if(pass) break;
		}
		System.out.println(s1.name + "의 총점은 " + s1.getTotal() + "이고 학점은 " + s1.getGrade() + "이다.");
		
		while(true) {
			System.out.print(s2.name + "의 퀴즈 점수를 입력하라: ");
			boolean pass = s2.setQuizScore(Integer.parseInt(sc.nextLine()));
			if(pass) break;
		}
		while(true) {
			System.out.print(s2.name + "의 중간시험 점수를 입력하라: ");
			boolean pass = s2.setMiddleScore(Integer.parseInt(sc.nextLine()));
			if(pass) break;
		}
		while(true) {
			System.out.print(s2.name + "의 기말시험 점수를 입력하라: ");
			boolean pass = s2.setFinalScore(Integer.parseInt(sc.nextLine()));
			if(pass) break;
		}
		System.out.println(s2.name + "의 총점은 " + s2.getTotal() + "이고 학점은 " + s2.getGrade() + "이다.");
		
		sc.close();
	}

}
