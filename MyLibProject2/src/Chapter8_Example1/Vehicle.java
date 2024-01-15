package Chapter8_Example1;

public abstract class Vehicle {
	
	private String model;
	private int price;
	int weight;
	
	public abstract double calcTax();
	public abstract String getInfo();

	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getPrice() {
		return price;
	}
	public int setPrice(int price) {
		return this.price = price;
	}
	
}
