package Chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExam {

	public static void main(String[] args) {
		List<String> li = List.of("A", "B", "C"); //불변
		li.add("D");
		
		Set<String> s = Set.of("A", "B", "C");
		s.add("E");
		
		Map<Integer, String> m1 = Map.of(
				1, "A",
				2, "B",
				3, "C",
				4, "D"
				);
		m1.put(5, "E");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> list2 = List.copyOf(list); //변경불가 그대롤 복사
		
		//변경가능 복사는 arr[]만들어서 for-each로 list에 넣어주기
				
	}

}
