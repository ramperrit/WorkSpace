package Chapter12;

import java.lang.reflect.*;

public class CarExam {

	public static void main(String[] args) {
		Class c = Car.class;  //클래스로부터 Class객체를 가져옴
		
		Car car = new Car();
		Class c1 = car.getClass();
		
		Class c2 = null;
		try {  //런타임중 클래스가 없을때를 대비
			c2 = Class.forName("Chapter12.Car");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}
		
		System.out.println(c2.getPackageName());
		System.out.println(c2.getSimpleName());
		System.out.println(c2.getName());
		
		Field[] fields = c2.getDeclaredFields();
		System.out.println("생성자 수: " + fields.length);
		for(Field f : fields) {
			System.out.print(f.getType());
			System.out.println(" " + f.getName());
		}
		
		Constructor[] constructors = c2.getConstructors(); //생성자 배열에 담아 가져옴
		System.out.println("생성자 수: " + constructors.length);
		for(Constructor C : constructors) {
			System.out.println(C.getName());
			Class[] types = C.getParameterTypes();
			for(Class t : types) {
				System.out.println(", " + t);
			}
			System.out.println();
		}
		
		//메소드 정보
		Method[] methods = c2.getDeclaredMethods();
		System.out.println("메서드 수: " + methods.length);
		for(Method m : methods) {
			System.out.print(m.getName() + ", ");
		}
		
		
	}

}
