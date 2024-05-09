
public class WhileEx02 {
	public static void main(String[] args) {
		// 3 X 1 = 3
		// 3 X 2 = 6
		// 3 X 3 = 9
		// ....
		// 3 X 9 = 27
		int by = 1;
		while( by < 10 ) { // by <= 9
			System.out.printf("3 X %d = %d \n", by, 3*by);
			++by; //by = by + 1;
		}
		//by : 1            2             3   .....  10
		//판단 : 1 < 10:T   2< 10:T       3 < 10:T    10 <10:F
		//출력               출력 
		//by: +1:2          +1:3         +1:4            
	}
}
