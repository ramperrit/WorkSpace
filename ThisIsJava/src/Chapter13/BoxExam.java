package Chapter13;

public class BoxExam {

	public static <K extends Number> Box<K> boxing(K k){  //제한된 타입
		Box<K> box = new Box<K>();
		box.set(k);
		return box;
	}
	
	
	public static void main(String[] args) {
//		Box<Integer, String> box1 = new Box<>();  //정수박스
//		Box<String, Boolean> box2 = new Box<>();    //문자열박스
//		
//		box1.content = 100;
//		box1.content2 = "abc";
//		box2.content = "string";
//		box2.content2 = true;
//		
//		System.out.println(box1.content + ", " + box1.content2);
//		System.out.println(box2.content + ", " + box2.content2);
		
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
//		Box<String> box2 = boxing("Hello");
//		String stringValue = box2.get();
//		System.out.println(stringValue);
		
		Box<Double> box3 = boxing(123.45678);
		double doubleValue = box3.get();
		System.out.println(doubleValue);
	}
//
}
