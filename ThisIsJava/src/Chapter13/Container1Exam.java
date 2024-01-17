package Chapter13;

public class Container1Exam {

	public static void main(String[] args) {
		Container1<String> container1 = new Container1<String>();
		container1.set("홍길동");
		String str = container1.get();

		Container1<Integer> container2 = new Container1<>();
		container2.set(6);
		int value = container2.get();
	}

}
