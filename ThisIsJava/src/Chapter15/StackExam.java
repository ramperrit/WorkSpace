package Chapter15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {
		Stack<Coin> st = new Stack<>();
		
		st.push(new Coin(100));
		st.push(new Coin(50));
		st.push(new Coin(500));
		st.push(new Coin(10));
		st.peek(); //삭제x
		
		while(!st.isEmpty()) {
			Coin coin = st.pop();
			System.out.println(coin.getValue());
		}
		
		System.out.println();
		Queue<Coin> q = new LinkedList<Coin>();
		
		q.offer(new Coin(100));
		q.offer(new Coin(50));
		q.offer(new Coin(500));
		q.offer(new Coin(10));
		
		while(!st.isEmpty()) {
			Coin coin = q.poll();
			System.out.println(coin.getValue());
		}
		
	}

}
