package Chapter12;

import java.io.UnsupportedEncodingException;

public class BytesToString {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		
		byte[] bytes = data.getBytes("EUC-KR");
		for(byte b : bytes) {
			System.out.println(b);
		}
		
		String receive = new String(new byte[] {-19, -98, -112, -20, -80, -108});
		System.out.println(receive);
	}

}
