package Chapter8;

public class ServiceExam {

	public static void main(String[] args) {
		
		Service service = new ServiceImpl();
		
		service.defaultMetnod1();
		service.defaultMetnod2();
		
		System.out.println();
		
		Service.staticMethod1();
		Service.staticMethod2();
	}

}
