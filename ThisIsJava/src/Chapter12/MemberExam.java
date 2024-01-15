package Chapter12;

public class MemberExam {

	public static void main(String[] args) {
		
		Member m = new Member("test", "홍길동", 32); //기본생성자  - NoArgsConstructor
//		m.setId("test");
//		m.setName("홍길동");
//		m.setAge(32);
		System.out.println(m); // toString()
		
		Member m2 = new Member("test", "홍길동", 32); //모든 매게변수가 있는 생성자  - AllArgsConstructor
		if(m.equals(m2))System.out.println("동등함");
		if(m.hashCode() == m2.hashCode())System.out.println("동등함");
		
	}

}
