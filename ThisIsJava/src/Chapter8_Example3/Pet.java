package Chapter8_Example3;

public abstract class Pet {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public int setAge(int age) {
		return this.age = age;
	}
	
	public abstract String name();
	public abstract int age();
	public abstract void Info();
	
	
	

}
