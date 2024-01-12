package Chapter8;

public class ImplClass implements InterfaceC{

	@Override
	public void methodB() {
		System.out.println("methodB");
	}

	@Override
	public void methodA() {
		System.out.println("methodA");
		
	}

	@Override
	public void methodC() {
		System.out.println("methodC");
		
	}
	
}
