package Chapter15;

public class BoardDao {
	private String title;
	private String content;
	
	public void getBoardList(String title, String content) {
		for(int i=0;i<3;i++) {
			title = "제목"+(i+1);
			content = "내용"+(i+1);
		}
	}
	
}
