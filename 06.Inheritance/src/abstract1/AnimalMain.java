package abstract1;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal a = new Animal("동물");
		
		Dog dog = new Dog("진돗개");
		dog.sound();
		
		Cat cat = new Cat("코숏");
		cat.sound();
		
		Chicken chicken = new Chicken("금계");
		chicken.sound();
	}
}