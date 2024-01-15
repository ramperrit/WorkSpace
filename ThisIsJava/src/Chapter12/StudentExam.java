package Chapter12;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(2, "홍길동");
		Student s3 = new Student(1, "김자바");
		
		//아이디값 String으로 받으면 같음
		if(s1.equals(s3)) {           //s2랑 비교하면 같음
			System.out.println("두 객체는 동등하게 취급합니다.");
		}else {
			System.out.println("두 객체는 다르게 취급합니다.");
		}
		
		//아이디 값 hashCode로 받으면 다름
		if(s1.hashCode() == s3.hashCode()) {        //s2의 id를 1로 변경하고 s2와 비교하면 같음
			System.out.println("두 객체는 동등하게 취급합니다.");
		}else {
			System.out.println("두 객체는 다르게 취급합니다.");
		}
		
		
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
		
		//record
		StudentRecord sr = new StudentRecord(1, "홍길동");
		System.out.println(sr.id());
		System.out.println(sr.name());
		System.out.println(sr);
		StudentRecord sr2 = new StudentRecord(1, "김자바");
		System.out.println(sr.equals(sr2));
		System.out.println(sr.hashCode() == sr2.hashCode());
	}

}
