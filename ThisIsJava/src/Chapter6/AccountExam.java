package Chapter6;

public class AccountExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		int myBalance = ac.getBalance();
		System.out.println(myBalance);
		ac.setBalance(9000);
		ac.withdraw(100);
		myBalance = ac.getBalance();
		System.out.println(myBalance);

	}

}
