package Chapter7;

public class ChildExam {

	public static void main(String[] args) {

		Child child = new Child();
		
		Parent parent = new Parent();
		
		//다형성
		method(child);
		method(parent);
		
		//자동 형변환
//		Parent parent = child;
//		
//		parent.method();
//		parent.method2();
////		parent.method3(); ////error - nonvisible
//		
//		Child child2 = (Child)parent;
//		
//		child2.method3();  // visible
//		
	}
	
	static void method(Parent p) {
		p.method2();
	}

}
