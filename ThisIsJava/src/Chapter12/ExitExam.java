package Chapter12;

public class ExitExam {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			System.out.println(i);
			if(i==5) {
				System.exit(0);            //여기서 프로그램 종료됨
			}
		}
		System.out.println("종료");          //출력 X
	}

}
