package d0527;

public class Student {
	static int seqId = 24001;
	int id;
	String name, phone, gender;
	
	Student(String name, String gender){
		this.id = seqId++;
		this.name = name;
		this.gender = gender;
	}
	
	Student(String name, String gender, String phone){
		this(name, gender);
		this.phone = phone;
	}
}
