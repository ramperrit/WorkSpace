package Chapter12;

import java.util.regex.Pattern;

public class PatternExam {

	public static void main(String[] args) {
		
		boolean tf = Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", "055-123-4567"); 
		System.out.println("(02|010)-\\d{3,4}-\\d{4}");
		System.out.println(tf);
		
		boolean em = Pattern.matches("\\w+@+\\w+\\.\\w+(\\.\\w+)?", "aaaaa@aaaa.aa.aa");
		System.out.print(em);
	}

}
