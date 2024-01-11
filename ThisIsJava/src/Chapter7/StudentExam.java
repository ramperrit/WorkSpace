package Chapter7;

public class StudentExam {
	
	public static void personInfo(Person person) {
		System.out.println("name: "+person.name);
		person.walk();
		if(person instanceof Student student) {
			System.out.println("studentNo: "+student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		Person p = new Person("홍길동");
		personInfo(p);
		
		System.out.println();
		
		Person s = new Student("홍길동",10);
		personInfo(s);
	}

}
