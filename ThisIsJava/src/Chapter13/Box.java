package Chapter13;

public class Box<T> { //제네릭: Type parameter T // T에 타입을 입력해줄꺼임

	public T content; //어떤 타입일진 모르지만 일단 T라고 설정
	
	public T get() {
		return this.content;
	}
	
	public void set(T t) {
		this.content = t;
	}
}
