
public class LoopEx01 {
	public static void main(String[] args) {
		//구구단
		//2단
		//2 X 1 = 2
		// ....
		//2 X 9 = 18
		//3단
		//4단
		//....
		//9단
		//세로로 구구단 출력
		for(int dan=2; dan<=9; dan++ ) {
			System.out.printf("%d단 \n", dan);			
			for(int by = 1; by <= 9; by++ ) {
				System.out.printf( "%d X %d = %d \n", dan, by, dan*by );
			}
		}
		
//		System.out.println("2단");
//		for(int by = 1; by <= 9; by++ ) {
//			System.out.printf( "2 X %d = %d \n", by, 2*by );
//		}
		
		

	
	}
}
