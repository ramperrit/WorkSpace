package Chapter06;
import java.util.*;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account account = new Account();
		
		int select =0;
		Account[] accounts = new Account[100];
		String accountNum; 
		String name; 
		int money = 0;
		int i = 0;
				
		while(select<5) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.println("선택>");
			select = Integer.parseInt(scan.nextLine());
		switch(select) {
		case 1:
			System.out.println("-------");
			System.out.println(" 계좌생성 ");
			System.out.println("-------");
			System.out.println("계좌번호:");
			accountNum = scan.nextLine();
			System.out.println("계좌주:");
			name = scan.nextLine();
			System.out.println("초기입금액:");
			money = Integer.parseInt(scan.nextLine());
			account.setBalance(money);
		
			accounts[++i] = new Account(accountNum, name, money);

			System.out.println("결과: 계좌가 생성되었습니다.");
			break;
			
		case 2:
			System.out.println("-------");
			System.out.println(" 계좌목록 ");
			System.out.println("-------");	
			account.accountList();
			
		}
		}
	}
		
	}

