package Chapter15;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap<>();
		
		treemap.put("apple", 10);
		treemap.put("forever", 60);
		treemap.put("description", 40);
		treemap.put("ever", 50);
		treemap.put("zoo", 80);
		treemap.put("base", 20);
		treemap.put("guess", 70);
		treemap.put("cherry", 30);
		
		for(Entry<String, Integer> e : treemap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		System.out.println();
		
		Entry<String, Integer> e = treemap.firstEntry();
		System.out.println(e.getKey() + "-" + e.getValue());
		
		Entry<String, Integer> e2 = treemap.higherEntry("h");
		System.out.println(e2 .getKey() + "-" + e2.getValue());
	}

}
