package Chapter13;

public class GenericExam1 {

	public static void main(String[] args) {
		Product<TV, String> product1 = new Product<TV, String>();
		
		product1.setKind(new TV());
		product1.setModel("삼성TV");
		
		TV tv = product1.getKind();
		System.out.println(product1.getModel());
		
		
		
		Product<Car, String> product2 = new Product<Car, String>();
		
		product2.setKind(new Car());
		product2.setModel("현대자동차");
		
		Car car = product2.getKind();
		System.out.println(product2.getModel());
	}

}
