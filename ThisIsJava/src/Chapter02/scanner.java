package Chapter02;
import java.util.Scanner;

public class scanner {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 :%d원\n",value);
		System.out.printf("상품의 가격 :%6d원\n",value);
		System.out.printf("상품의 가격 :%-6d원\n",value);
		System.out.printf("상품의 가격 :%06d원\n",value);
		
		Scanner scan = new Scanner(System.in);

		System.out.printf("원의 반지름을 입력하세요 -> ");
		int rad = Integer.parseInt(scan.nextLine());
		
		double area = Math.PI * rad * rad;
		System.out.printf("반지름이 %d인 원의 넓이 : %.2f", rad, area);
		
		scan.close();
	}
}
