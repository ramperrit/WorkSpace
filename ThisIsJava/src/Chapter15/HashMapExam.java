package Chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry의 수: "+map.size());
		
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(value);
		
		String key2 = "김김김";
		int value2 = map.getOrDefault(key2, 0);
		System.out.println(value2);
		
		Set<String> set = map.keySet();
		for(String s : set) {
			System.out.println(s);
		}
		
//		Set<Entry<String, Integer>> entry = map.entrySet();
		for(Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		
		for(Integer i : map.values()) {
			System.out.println(i);
		}
		
	}

}
