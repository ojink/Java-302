package abstract1;

public class Student extends People{
	//이름, 나이, 학번
	String studentNo;
	
	//등교한다
	void go() {
		System.out.println( name + " 등교한다");
	}
}
