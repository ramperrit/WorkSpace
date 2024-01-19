package Chapter15_Exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrecNum {

	public static void main(String[] args) {

		int[] nums = {1,1,4,7,3,5,5,4,3,1,6};
		Map<Integer, Integer> map = new HashMap<>();
		
		//map에 nums[] 넣고 숫자 세기
		for(int i=0; i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		//출력1
		for(Entry e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		//가장많은 값 찾기
		int max = 0;
		int maxInt = 0;
		for(Entry e : map.entrySet()) {
			max = Math.max(max, (int) e.getValue());
			if(max == (int)e.getValue()) {
				maxInt = (int)e.getKey();
				System.out.println();
				System.out.println("가장 많이 등장한 수: "+maxInt);
			}
		}
		
		
		
	}

}
