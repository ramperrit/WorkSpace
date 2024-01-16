package Chapter12;

public class StringBuliderExam {

	public static void main(String[] args) {
		String name = "홍길동";
		String age = "29";
		String gender = "남성";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("이름은 ");
		sb.append(name);
		sb.append("이고 나이는 ");
		sb.append(age);
		sb.append("이고 성별은 ");
		sb.append(gender);
		sb.append("입니다.");
		
		sb.insert(9, ","); 
		sb.insert(19, ","); 
		
		sb.replace(sb.length()-16, sb.length()-14, "35");
		
		String str = sb.toString();
		System.out.println(str);
	}

}
