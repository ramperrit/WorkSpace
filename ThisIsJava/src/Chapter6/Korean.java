package Chapter6;

public class Korean {

	final String nation = "대한민국";  //수정불가 => 재할당 불가 //final static = 상수 constant
	final String ssn;               //final필드
	String name;
	
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
