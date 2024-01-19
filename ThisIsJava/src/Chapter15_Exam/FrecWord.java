package Chapter15_Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FrecWord {

	public static void main(String[] args) {
		String str = "hi, my name is donghee. nice to meet you";
		Map<Character, Integer> map = new HashMap<>();

		int max = 0;
		char maxStr = ' ';
		//str을 map에 넣고 문자 갯수 세기 
		for(int i=0; i<str.length();i++) {
//			if(map 안에 key 값이 있는지 확인하는 메소드)
//				map.put(문자, 디폴트)
//				else
//					map.put(문자, 값+1)
			 map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		map.remove(' ');
		
		for(Entry entry : map.entrySet()) {
			max = Math.max((int)entry.getValue(), max);
			if(max == (int)entry.getValue()) {
				maxStr = (char)entry.getKey();
			}
		}
		
		System.out.println();
		System.out.println("가장 많이 등장한 문자: " + maxStr);
	}
}
