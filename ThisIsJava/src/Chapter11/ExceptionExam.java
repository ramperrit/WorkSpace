package Chapter11;

public class ExceptionExam {

	public static void main(String[] args) {
		
		//try catch 필수, finally 선택 // try{오류발생문}-catch(발생한 exception 담음){catch실행문}-finally{종료문} 
		try {
			int[] a = null;
		System.out.println(a.length);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());   //오류 메세지 문자열 반환
			e.printStackTrace();                  //오류 메세지 보여주기
			System.out.println("배열이 비어있습니다.");
		}finally {
			System.out.println("TryCatch문이 종료됩니다.");
		}
	}

}
