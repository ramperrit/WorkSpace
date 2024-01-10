package Chapter6_Example;

class Student {
	String name;
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	int sum = 0;
	float avg = 0.0f;
	
	int getTotal() {
		sum = kor + eng + math;
		return sum;
	}
	
	float getAverage() {
		avg = (float)Math.round((sum/3f)*10f)/10f;
		return avg;
	}
	
	Student(){
		
	}
	
	Student (String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String info() {
		sum = kor + eng + math;
		avg = (float)Math.round((sum/3f)*10f)/10f;
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + sum + "," + avg;
		
	}
}
