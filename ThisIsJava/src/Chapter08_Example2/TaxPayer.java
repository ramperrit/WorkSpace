package Chapter08_Example2;

public abstract class TaxPayer {
	private String name;
	private int payerNum;
	
	
	public abstract double calcTax();
	public abstract String getInfo();
	
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public int getPayerNum() {
		return payerNum;
	}
	public int setPayerNum(int payerNum) {
		return this.payerNum = payerNum;
	}
	

}
