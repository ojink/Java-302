package animal;

public class Animal {
//	품종
	protected String kind;
	
	public Animal(){
		
	}
	
//	먹는다
	void eat() {
		System.out.println( kind+ " 먹는다");
	}
//	잠을잔다
	void sleep() {
		System.out.println( kind+ " 잠을잔다");
	}
}
