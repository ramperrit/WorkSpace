package Chapter2;

import Chapter7.A;

public class C extends A{
	public void mathod() {
//		A a = new A();
		//protected : 불러오기 불가
		
		// 자식으로 상속 시 protected 불러오기 가능
		super.method();
		super.field = "";
	}
}
