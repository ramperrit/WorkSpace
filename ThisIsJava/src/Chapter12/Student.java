package Chapter12;

public class Student {
	//object class를 상속
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s) {
			if(this.id == s.id) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id + name.hashCode();
	}

	@Override
	public String toString() {
		return "학번은 " + this.id + "이고 이름은 " + this.name + "인 학생입니다.";
	}
	
	
	
}
