package Chapter15;

public class Person implements Comparable<Person> {
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Person p) {
		if(this.age<p.age) return -1;
		else if(this.age == p.age) return 0;
		else return 1;
	}
	
	
}
