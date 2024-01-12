package Chapter8_Example2;

public class SalaryTaxPayer extends TaxPayer{
	private int salary;

	@Override
	public double calcTax() {
		double tax;
		if(salary <= 20000000) {
			tax = salary * 0.05;
		}else if (salary > 20000000 && salary <= 40000000) {
			tax = salary * 0.1;
		}else if (salary > 40000000 && salary <= 60000000) {
			tax = salary * 0.15;
		}else if (salary > 60000000 && salary <= 80000000) {
			tax = salary * 0.2;
		}else {
			tax = salary * 0.3;
		}
		return tax;
	}

	@Override
	public String getInfo() {
		return "이름: "+getName()+", 번호: "+getPayerNum()+", 월급: "+salary;
	}
	
	public SalaryTaxPayer(String name, int payerNum, int salary) {
		setName(name);
		setPayerNum(payerNum);
		this.salary = salary;
	}
	
}
