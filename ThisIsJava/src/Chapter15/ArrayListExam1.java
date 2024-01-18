package Chapter15;

import java.util.ArrayList;

public class ArrayListExam1 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(3,35);    //3번 index에 35추가 
		arr.set(3, 36);   // 35 -> 36
		
		
//		System.out.println(arr.remove(3));
		System.out.println(arr.remove(new Integer(36)));
		
		
		for(Integer i : arr) {
			System.out.println(i);
		}
//		
//		System.out.println(arr.get(2));
//		
//		System.out.println(arr.contains(36));    //36있는지
//		
//		System.out.println(arr.isEmpty());		//배열이 비어있는지
//		
//		System.out.println(arr.size());         // 몇개가 들어있는지
		
//		arr.clear();   //배열 비움
//		System.out.println(arr.isEmpty());
		
		
	}

}
