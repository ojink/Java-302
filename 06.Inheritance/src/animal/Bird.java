package animal;

public class Bird extends Animal {
	Bird(String kind){
		super(kind);
	}
	
	void doWhat() {
		//하늘을 난다
		System.out.println(kind+ " 하늘을 난다" );
	}
}
