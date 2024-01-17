package Chapter12;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExam {

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		String date = ldt.format(sdf);
		System.out.println(date);
		
		LocalDateTime my = ldt.minusYears(1);
		System.out.println(my.format(sdf));
		
		LocalDateTime mm = ldt.minusMonths(1);
		System.out.println(mm.format(sdf));
		

		LocalDateTime nextYear = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
		long dDay = ldt.until(nextYear, ChronoUnit.DAYS);
		System.out.println("남은 월 수: "+dDay);
	}

}
