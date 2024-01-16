package Chapter12;

public class MasureTimeExam {

	public static void main(String[] args) {
		long sum = 0;
		
		long nt1 = System.nanoTime();
		for(int i=0; i<1000000; i++) {
			sum += i;
		}
		long nt2 = System.nanoTime();
		System.out.println(nt2 - nt1);
	}

}
