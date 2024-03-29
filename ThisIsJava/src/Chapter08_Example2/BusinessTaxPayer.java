package Chapter08_Example2;

public class BusinessTaxPayer extends TaxPayer{
	private int sales;
	private int cost;
	
	public BusinessTaxPayer(String name, int payerNum, int sales, int cost) {
		setName(name);
		setPayerNum(payerNum);
		this.sales = sales;
		this.cost = cost;
	}
	
	@Override
	public double calcTax() {
		double tax;
		int result = sales - cost;
		if(result <= 0) {
			tax = 0;
		}else if(result > 0 && result <= 40000000) {
			tax = result * 0.1; 
		}else{
			tax = result * 0.2;
		}
		return tax;
	}


	
	@Override
	public String getInfo() {
		return "이름: "+getName()+", 번호: "+getPayerNum()+", 총매출액: "+sales+", 총비용: "+cost;
	}
	
	
	
	
}
