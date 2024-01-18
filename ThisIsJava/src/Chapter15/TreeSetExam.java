package Chapter15;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(80);
		scores.add(98);
		scores.add(95);
		scores.add(75);
		scores.add(78);
		scores.add(32);
		
		for(Integer i : scores) {
			System.out.print(i + ", ");
		}
		
		System.out.println();
		
		System.out.println(scores.first());
		System.out.println(scores.last());
		System.out.println(scores.lower(95));   //95미만 첫 값
		System.out.println(scores.higher(95));   //95초과 첫 값
		System.out.println(scores.floor(94));   //94이하 첫 값	
		System.out.println(scores.ceiling(94));   //94이상 첫 값
		
//		System.out.println(scores.pollFirst()); //가장 작은 값 꺼내오며 삭제
		
		Iterator<Integer> iter = scores.descendingIterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		
		NavigableSet<Integer> navi = scores.descendingSet();
		for(Integer i : scores.descendingSet()) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(Integer i : scores.headSet(75, true)) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		for(Integer i : scores.subSet(78, false, 98, true)) {
			System.out.print(i + ", ");
		}
	}

}
