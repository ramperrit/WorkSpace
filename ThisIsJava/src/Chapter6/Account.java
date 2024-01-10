package Chapter6;

//public 지움 => default : 패키지 내부에서만 사용 가능
class Account {
	// 클래스 내부에서만 사용 가능
	private int balance;
	
	//잔액 확인
	public int getBalance() {
		return this.balance;
	}
	
	//계좌 개설 초기값
	public void setBalance(int money) {
		if(money >= 1000) {
			this.balance = money;
		}else {
			System.out.println("1000원 미만의 금액으로 계좌 개설 불가.");
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
	
}
