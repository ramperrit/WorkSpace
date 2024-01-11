package Chapter7;

public abstract class Animal {
	
	//공통 구현 가능
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	//모두 소리는 내는데 다 다름 > 무조건 구현 해야하는 항목
	public abstract void sound();
}
