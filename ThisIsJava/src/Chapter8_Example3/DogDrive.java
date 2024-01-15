package Chapter8_Example3;

import java.util.Scanner;

public class DogDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("개의 이름을 입력하세요");
		String name = scan.nextLine();
		System.out.println("개의 나이를 입력하세요: ");
		int age = Integer.parseInt(scan.nextLine());
		System.out.println("개의 품종을 입력하세요: ");
		String speices = scan.nextLine();
		System.out.println("예방주사를 맞았나요(예 혹은 아니오): ");
		String answer = scan.nextLine();
		
		Pet pet = new Dog(name, age, speices, answer);
		System.out.println(pet.Info());
	}
	

}
