package Chapter7;

public class SuperSonicAirplane extends Airplane {
	
	//enum 불러오기
	public FlyMode flyMode = FlyMode.NOMAL;
	
	//anotation // 상속받을 때 실수 방지
	@Override
	public void fly() {
		 if(this.flyMode == FlyMode.SUPERSONIC) {
			 System.out.println("초음속 비행중입니다.");
		 }else {
			 super.fly();   // 부모의 fly 그대로 출력
		 }
	}
	
	
}
