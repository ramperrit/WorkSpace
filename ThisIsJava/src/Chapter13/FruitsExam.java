package Chapter13;

public class FruitsExam {

	public static void main(String[] args) {
		Fruits<Apple<String>> f1 = new Fruits<>();			//인스턴스 생성
		f1.set(new Apple<String>("사과1"));
		Fruits<Banana> f2 = new Fruits<>();
		f2.set(new Banana());
		
		Apple<String> apple = f1.get();		//강제 형변환
		String applesName = apple.name;
		System.out.println(applesName);
//		Banana banana = f2.get();
		
		String str = Fruits.method1("hi");
		System.out.println(str);
		
		Fruits<String> f3 = new Fruits<String>();
		Integer i = f3.<Integer>method2(10);
		System.out.println(i);
		
		
	}

}
