package d0523;

public class CarMain {
	public static void main(String[] args) {
		
//		Car park = new Car();		
//		park.owner = "박문수";
//		park.model = "K5";
		
		Car park 
			= new Car("박문수", "K3");
		
		System.out.printf("차주: %s  차종: %s \n"
							, park.owner, park.model );
		park.start();
		park.stepAccel();
		System.out.println("현재 속도: " + park.speed);
		
		park.stepAccel();
		System.out.println("현재 속도: " + park.speed);
		
		park.stepAccel();
		System.out.println("현재 속도: " + park.speed);
		
		park.stepAccel();		
		System.out.println("현재 속도: " + park.speed);
		
		
		park.stepBreak();
		System.out.println("현재 속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재 속도: " + park.speed);

		park.stepBreak();
		System.out.println("현재 속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재 속도: " + park.speed);
		
		park.stepBreak();
		System.out.println("현재 속도: " + park.speed);
		
		park.stop();
		
		
		Car hong = new Car("K5");
		hong.owner = "홍길동";
		
		
		//심청의 자동차 만들기
		Car sim = new Car();
		sim.owner = "심청";
		sim.model = "K3";
		
		sim.start();
		//가속하기
		speed(sim);
		speed(sim);
		speed(true, sim);
		
		//감속하기
		//speedMinus(sim);
		speed(false, sim);
		speed(false, sim);
		sim.stop();
	}
	
	static void speed(boolean plus, Car car) {
		if( plus ) {
			car.stepAccel();
		}else {
			car.stepBreak();
		}
		System.out.println("현재 속도: " + car.speed);
	}
	
	
	static void speedMinus(Car car) {
		car.stepBreak();
		System.out.println("현재 속도: " + car.speed);
	}
	static void speed(Car car) {
		car.stepAccel();
		System.out.println("현재 속도: " + car.speed);
	}
	
	
	
}
