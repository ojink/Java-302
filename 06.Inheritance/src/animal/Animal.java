package animal;

abstract public class Animal {
//	품종
	protected String kind;
	
	public Animal(String kind){
		this.kind = kind;
	}
	
//	먹는다
	void eat() {
		System.out.println( kind+ " 먹는다");
	}
//	잠을잔다
	void sleep() {
		System.out.println( kind+ " 잠을잔다");
	}
	
	abstract void doWhat();
		//달린다, 하늘난다, 물속헤엄친다
}
