package Chapter15;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		
		for(int i=0; i<list.size();i++) {
			System.out.println("요소" + i + "번: " + list.get(i));
		}
		for(Board b : list) {
			System.out.println(b);
		}
	}

}
