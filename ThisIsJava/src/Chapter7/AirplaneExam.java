package Chapter7;

public class AirplaneExam {

	public static void main(String[] args) {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = FlyMode.SUPERSONIC; //필드 변경 //명시적의미
		sa.fly();
		sa.land();
	}

}
