package Chapter07;

public class AnimalExam {

	public static void main(String[] args) {
//		Animal animal = new Animal(); // 구현 불가능 : 추상클래스
		
		Cat cat = new Cat();
		animalSound(cat);
		
		Dog dog = new Dog();
		animalSound(dog);
	}
	
	//추상 메소드 불러오기
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
