package Chapter15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list1.add(0,String.valueOf(i));  //제일 앞에 하나씩 추가
		}
		System.out.println("ArrayList의 걸린 시간: " + (System.nanoTime() - startTime));
		
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list2.add(0,String.valueOf(i));
		}
		System.out.println("LinkedList의 걸린 시간: " + (System.nanoTime() - startTime));
		
	}

}
