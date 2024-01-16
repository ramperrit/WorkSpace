package Chapter08_Example2;

public class Driver {

	public static void main(String[] args) {
		TaxPayer payer1 = new SalaryTaxPayer("선남", 100, 3000000);
		System.out.println(payer1.getInfo());
		System.out.println(payer1.getName() +"의 세금: " + calculate(payer1));
		TaxPayer payer2 = new BusinessTaxPayer("선녀", 200, 120000000, 75000000);
		System.out.println(payer2.getInfo());
		System.out.println(payer2.getName()+"의 세금: " + calculate(payer2));

	}
	private static double calculate(TaxPayer t) {
		return t.calcTax();
	}

}
