package Chapter08_Example4;

public class Student {

	//이름, 퀴즈, 중간, 기말
	String name;
	private int quizScore;
	private int midScore;
	private int finalScore;
	
	//점수범위 0~100
	public boolean scoreValue(int Score) {
		if(Score < 0 || Score > 100) {
			System.out.println("잘못 입력했습니다.");
			return false;
		}
		return true;
	}
	
	//getset
	public int getQuizScore() {
		return quizScore;
	}

	public boolean setQuizScore(int quizScore) {
		if(!scoreValue(quizScore)) {
			return  false;
		}
		this.quizScore = quizScore;
		return true;
	}

	public int getMidScore() {
		return midScore;
	}

	public boolean setMidScore(int midScore) {
		if(!scoreValue(midScore)) {
			return  false;
		}
		this.midScore = midScore;
		return true;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public boolean setFinalScore(int finalScore) {
		if(!scoreValue(finalScore)) {
			return  false;
		}
		this.finalScore = finalScore;
		return true;
	}

	//평균
	public double avgScore(int quizScore, int midScore, int finalScore) {
		double avgScore = (quizScore + midScore + finalScore)/3.0;
		avgScore = Math.round(avgScore*10)/10.0;
		return avgScore;
	}
	
	//grade
//	public char getGrade() {
//		int level = (int)this.avgScore()/10;
//		switch(level) {
//			case 9 : return 'A';
//			case 8 : return 'B';
//			case 7 : return 'C';
//			case 6 : return 'D';
//			default : return 'F';
//		}
//	}

}
