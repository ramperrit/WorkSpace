package Chapter08;

public interface Service {
	
	//----------------------------------------------인터페이스 구현 , 인터페이스화 필요
	default void defaultMetnod1() {
		System.out.println("defaultMetnod1의 종속 코드");
		defaultCommon();
	}
	default void defaultMetnod2() {
		System.out.println("defaultMetnod2의 종속 코드");
		defaultCommon();
	}
	
	private void defaultCommon() {
		System.out.println("defaultMetnod의 중복 코드");
	}
	
	
	//---------------------------------------------------------------------------
	static void staticMethod1() {
		System.out.println("staticMethod1의 종속 코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2의 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticCommon의 중복 코드");
	}
}
