package Chapter15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("IBATIS");
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			System.out.println(s);
			if(s.equals("JDBC")) {
				iterator.remove();
			}
		}
		
		System.out.println(set.size());
		
		for(String s : set) {
			System.out.println(s);
		}
		
	}

}
