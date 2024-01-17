package Chapter12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPhoneNumExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean em;
		boolean pn;
		String email;
		String phoneNum;
		
		do{
			System.out.println("이메일을 입력해주세요: ");
			email = scan.nextLine();
			em = Pattern.matches("\\w+@+\\w+\\.\\w+(\\.\\w+)?", email);
			if(em==false) {
				System.out.println("잘못입력하셨습니다.");
			}
			}while(em == false);
		
		do{
			System.out.println("전화번호를 입력해주세요: ");
			phoneNum = scan.nextLine();
			pn = Pattern.matches("\\d{2,3}-\\d{3,4}-\\d{4}", phoneNum); 
			if(pn==false) {
				System.out.println("잘못입력하셨습니다.");
			}
			}while(pn == false);
		
		System.out.println("email: " + email);
		System.out.println("전화번호: " + phoneNum);
		
		}
	}

