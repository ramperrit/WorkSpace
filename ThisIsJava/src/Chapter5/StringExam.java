package Chapter5;

public class StringExam {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = "abc";
		String str4 = "abc";
		
		//string 비교
		System.out.println(str1.equals(str2));
		
		System.out.println(str3 == str4);
		
		//hashCode
		System.out.println("str1's hashCode: " + str1.hashCode());
		System.out.println("str4's hashCode: " + str4.hashCode());
		System.out.println(equals2(str1,str4));
		
		
	}
	private static boolean equals2(String origin, String str) {
	return origin.hashCode() == str.hashCode();
	}
}
