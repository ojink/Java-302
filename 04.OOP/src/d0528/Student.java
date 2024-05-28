package d0528;

public class Student {
	static int seqId;
	int id;
	String name, phone, gender;
	//static 필드 초기화블럭
	static {
		seqId = 24001;
		System.out.println("클래스로딩때 static block 실행됨");
	}
	
	Student(String name, String gender){
		this.id = seqId++;
		this.name = name;
		this.gender = gender;
		System.out.println(name +" 객체 생성");
	}
	
	Student(String name, String gender, String phone){
		this(name, gender);
		this.phone = phone;
	}
}
