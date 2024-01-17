package Chapter12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");   //M, m 구분
		String str = sf.format(date); 
		System.out.println(str);
	}

}
