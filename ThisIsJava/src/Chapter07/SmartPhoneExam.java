package Chapter07;

public class SmartPhoneExam {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone();
		
		myPhone.model = "아이폰";
		myPhone.color = "검정";
		
		System.out.println("모델: "+myPhone.model);
		System.out.println("색상: "+myPhone.color);
	}

}
