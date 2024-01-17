package Chapter13;

public class Container2 <T, K>{

	private T t;
	private K k;
	
	public T getKey() {
		return t;
	}
	public T setKey(T t) {
		return this.t = t;
	}
	public K getValue() {
		return k;
	}
	public K setValue(K k) {
		return this.k = k;
	}
	
	public void set(T t, K k){
		this.t = t;
		this.k = k;
	}
}
