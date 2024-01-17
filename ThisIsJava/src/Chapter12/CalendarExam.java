package Chapter12;

import java.util.Calendar;

public class CalendarExam {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();         //싱글톤 패턴
		
//		System.out.println(cal.get(Calendar.YEAR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));  //일 월 화 수 목 금 토
//		System.out.println(cal.get(Calendar.SUNDAY));
//		System.out.println(cal.get(Calendar.AM));
//		System.out.println(cal.get(Calendar.HOUR));
		
//		if(cal.get(Calendar.AM_PM)==cal.get(Calendar.AM)) {
//			System.out.println("오전입니다.");
//		}else {
//			System.out.println("오후입니다.");
//		}
//		
		
		
		//example		
		String day = null;
		if(cal.get(Calendar.DAY_OF_WEEK) == 4) {
			day = "수요일";
		}
		
		String dayTime;
		if(cal.get(Calendar.AM_PM) == 0) {
			dayTime = "오전";
		}else {
			dayTime = "오후";
		}
		
		System.out.println(cal.get(Calendar.YEAR) + "년"+ " " + cal.get(Calendar.MONTH)+1 + "월" + " " + cal.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println(day + " " + dayTime);
		System.out.println(cal.get(Calendar.HOUR) + "시" + " " + cal.get(Calendar.MINUTE) + "분" + " " +cal.get(Calendar.SECOND) + "초"); 
		
	}

}
