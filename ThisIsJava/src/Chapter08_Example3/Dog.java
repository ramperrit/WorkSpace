package Chapter08_Example3;

public class Dog extends Pet{
	private String speices;
	private boolean shot;
	private String answer;
	
	
	public Dog(String name, int age, String speices, String answer) {
		setName(name);
		setAge(age);
		setSpeices(speices);
		setAnswer(answer);
	}
	
	public String getAnswer() {
		return answer;
	}
	public String setAnswer(String answer) {
		return this.answer = answer;
	}
	
	public String getSpeices() {
		return speices;
	}
	public String setSpeices(String speices) {
		return this.speices = speices;
	}
	
	
	public boolean shot() {
		if(getAnswer().equals("예")) {
			shot = true;
		}else if (getAnswer().equals("아니오")){
			shot = false;
		}
		return shot;
	}
	
	
	@Override
	public String name() {
		return "개의 이름을 입력하세요: ";
	}

	@Override
	public int age() {
		return age();
	}

	@Override
	public String Info() {
		return ("이름: " + getName() + "\n나이: " + getAge()+ "\n품종: " + getSpeices()+ "\n" + shot());		
	}
	
	

}
