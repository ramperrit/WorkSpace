package Chapter15;

import java.util.Comparator;
import java.util.TreeSet;

public class FruitExam {

	public static void main(String[] args) {
		
//		TreeSet<Fruit> ts = new TreeSet<>(new FruitComparator()); //comparator
		TreeSet<Fruit> ts = new TreeSet<>(new Comparator<Fruit>() {         //익명 객체
			@Override
			public int compare(Fruit o1, Fruit o2) {
				return o1.price - o2.price;
			}
		});
		
		ts.add(new Fruit("포도", 3000));
		ts.add(new Fruit("수박", 10000));
		ts.add(new Fruit("딸기", 6000));
		
		for(Fruit f : ts) {
			System.out.println(f.name + ":" + f.price);
		}
		
	}

}
