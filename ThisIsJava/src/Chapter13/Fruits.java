package Chapter13;

public class Fruits<K> {

	private K kind;
	
	public static <T> T method1(T t) {
		return t;
	}
	
	public <K> K method2(K k) {
		return k;
	}
	
	
	public void set(K obj) {
		this.kind = obj;
	}
	
	public K get() {
		return this.kind;
	}
}
