package Chapter11;

public class ExceptionExam2 {

	public static void main(String[] args) {
		int[][] array = new int [4][];
		array[0] = new int[] {1,2,3,4,5};
		array[1] = new int[] {1,2,3,4,5,6,7,8,9,10};
		array[2] = null;
		array[3] = new int[51];
		
		
		for(int[] arr : array) {
			try {
				printCheck(arr);
			}catch(ArrayLengthOver e) {
				System.out.println(e.getMessage());
			}catch(NullPointerException e) {
				System.out.println("배열이 비어있습니다.");
			}
			
		}
		
//		try {
//		printCheck(arr1);
//		printCheck(arr2);
////		printCheck(arr3);
//		printCheck(arr4);
//		throw new ArrayLengthOver("배열의 길이가 50을 넘었습니다.");
//		}
////		catch(NullPointerException e) {
////			System.out.println("배열의 길이가 50을 넘었습니다.");
////		}
//		catch(ArrayLengthOver e) {
//			System.out.println(e.getMessage());
//		}
		
		
		
	}
	
	private static boolean checkArr(int[] arr) throws ArrayLengthOver{ //throws = 예외는 호출된 부분에서 처리함 ----> printCheck로 던짐
		if(arr.length > 50) {
			throw new ArrayLengthOver("배열의 길이가 50을 넘었습니다.");
		}else {
			return false;
		}
	}
	
	private static void printCheck(int[] arr) throws ArrayLengthOver{ //----> throws 받은거 try로 던짐
		if(checkArr(arr)) {
			System.out.println("배열의 길이가 10보다 크거나 같다.");
		}else {
			System.out.println("배열의 길이가 10보다 작다.");
		}
	}
	
	

}
