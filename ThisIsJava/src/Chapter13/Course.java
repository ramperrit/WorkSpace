package Chapter13;

import Chapter12.Student;

public class Course {
	
	//course1 = 사람이면 전부
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getName() + "이(가) 코스1을 등록함");
	}
	
	//student
	public static void registerCourse2(Applicant<? extends Chapter13.Student> applicant) {
		System.out.println(applicant.kind.getClass().getName() + "이(가) 코스2을 등록함");
	}
	
	//worker
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getName() + "이(가) 코스3을 등록함");
	}
	
}
