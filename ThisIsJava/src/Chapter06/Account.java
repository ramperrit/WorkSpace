package Chapter06;

//public 지움 => default : 패키지 내부에서만 사용 가능
class Account {
	// 클래스 내부에서만 사용 가능
	private int balance;
	String accountNum;
	String name;
	int money;	
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	Account[] accounts = new Account[100];
	
	Account(){}
	
	//잔액 확인
	public int getBalance() {
		return this.balance;
	}
	
	//계좌 개설 초기값
	public void setBalance(int money){
		if(money >=  MIN_BALANCE && money <= MAX_BALANCE) {
			this.balance = money;
		}
	}
	
	//출금
	public int withdraw(int money) {
		if(money > this.balance) {
			System.out.println("출금액이 잔고보다 많습니다.");
			return -1;
		}
		this.balance -= money;
		return this.balance;
	}
	
	public Account(String accountNum, String name, int money) {
		this.accountNum = accountNum;
		this.name = name;
		this.setBalance(money);
	}
	
	void accountList() {
		for(int i=0; i<3;i++) {
			System.out.println(accounts[i].accountNum + "  " + accounts[i].name + "  " + accounts[i].money);
		}
	}


}
