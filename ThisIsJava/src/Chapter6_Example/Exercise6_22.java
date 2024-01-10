package Chapter6_Example;

class Exercise6_22 {
	
	static boolean isNumber(String str) {
		int num;
		boolean result = false;
		for(int i=0;i<str.length();i++) {
			num = str.charAt(i);
			if(num >= 48 && num<=57 ) {
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      	String str = "123";
		System.out.println(str + "는 숫자입니까? "+ isNumber(str));
	
		str = "1234o";
		System.out.println(str + "는 숫자입니까? "+ isNumber(str));

	}

}
