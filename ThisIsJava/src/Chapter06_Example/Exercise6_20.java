package Chapter06_Example;

class Exercise6_20 {
	
	static int[] shuffle(int[] arr) {
		int randomNum1, randomNum2, temp1, temp2;
		for(int i=0;i<arr.length;i++) {
			randomNum1 = (int)(Math.random()*arr.length);
			temp1 = arr[randomNum1];
			randomNum2 = (int)(Math.random()*arr.length);
			temp2 = arr[randomNum2];
			arr[randomNum1] = temp2;
			arr[randomNum2] = temp1;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
