package Chapter8_Example1;

public class Car extends Vehicle{
	private int gas;

	@Override
	public double calcTax() {
		double tax;
		if(gas >= 3000) {
			tax = getPrice()*0.05;
		}else if(gas < 3000 && gas >= 1500) {
			tax = getPrice()*0.03;
		}else {
			tax = getPrice()*0.01;
		}
		return tax;
	}

	@Override
	public String getInfo() {
		return "모델명: "+getModel()+", 가격: "+getPrice()+", 배기량: "+gas;
		
	}
	
	public Car(String model, int price, int gas) {
		setModel(model);
		setPrice(price);
		this.gas = gas;
	}


}
