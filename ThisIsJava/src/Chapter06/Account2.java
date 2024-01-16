package Chapter06;

public class Account2 {
	private int balance;
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	
	
	public int getBalance() {
	  return this.balance;
	}
	
	public void setBalance(int money){
		if(money >=  MIN_BALANCE && money <= MAX_BALANCE) {
			this.balance = money;
		}
	}
	
}
