package Chapter05;

import java.util.Calendar;

public class WeekExam {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); //런타임 중에 Calendar객체는 반드시 하나만 존재
		
		int week = cal.get(Calendar.DAY_OF_WEEK); //ENUM : 특정 키워드에 값을 걸어둠
		System.out.println(week);
		
		switch(week) {
		case 1: today = Week.SUNDAY;
		break;
		case 2: today = Week.MONDAY;
		break;
		case 3: today = Week.TUESDAY;
		break;
		case 4: today = Week.WEDNESDAY;
		break;
		case 5: today = Week.THURSDAY;
		break;
		case 6: today = Week.FRIDAY;
		break;
		case 7: today = Week.SATURDAY;
		break;
		}
	if(today == Week.MONDAY) {
		System.out.println("오늘은 월요일입니다.");
	}
	}

}
