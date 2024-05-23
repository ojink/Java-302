package d0523;

public class Car {
	//필드: 소유주, 차종, 속도
	String owner, model;
	int speed;
	
	
	//생성자
	Car(){
	}
	Car(String name, String carModel){
		owner = name;
		model = carModel;
	}
	Car(String carModel){
		model = carModel;
	}
	//생성자 오버로딩
	
	//메소드: 출발한다. 멈춘다. 가속한다. 감속한다
	//출발한다
	void start() {
		System.out.println("시동걸기");
	}
	//멈춘다
	void stop() {
		System.out.println("정지상태");
	}
	//가속한다: 가속이 40 증가
	void stepAccel() {
		speed += 40;
		if( speed > 120 ) {
			speed = 120;
			System.out.println("일정 속도 유지 120");
		}
	}
	//감속한다: 감속이 30씩 
	void stepBreak() {
		speed -= 30;
		if( speed < 0 ) speed = 0 ;
	}
	
}
