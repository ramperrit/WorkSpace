package Chapter15;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.price - o2.price;                //o1이 더 클때 즉, 양수면 오름차순  // 반대면 내림차순
	}

	
}
