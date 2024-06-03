package animal;

public class Dog extends Animal{

	public Dog(String kind){
		super(kind);
	}
	
	void doWhat() {
//	땅위를 달린다
		System.out.println(kind +" 달린다");
	}
}
