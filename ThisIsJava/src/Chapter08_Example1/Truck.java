package Chapter08_Example1;

public class Truck extends Vehicle{
	private double weight;

	@Override
	public double calcTax() {
		double tax;
		if(weight >= 10000) {
			tax = getPrice()*0.04;
		}else if(weight < 10000 && weight >= 5000) {
			tax = getPrice()*0.02;
		}else {
			tax = getPrice()*0.01;
		}
		return tax;
	}

	@Override
	public String getInfo() {
		return "모델명: "+getModel()+", 가격: "+getPrice()+", 적재 중량: "+weight;
	}
	
	public Truck(String model, int price, double weight) {
		setModel(model);
		setPrice(price);
		this.weight = weight;
	}
}
