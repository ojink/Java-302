
public class LoopEx07 {
	public static void main(String[] args) {
		//구구단 2단 ~ 9단까지 중 짝수단만 출력하기
		for(int dan=2; dan<=9; dan++) {
			//홀수이면 출력하지 말자
			if( dan % 2 == 1 ) continue;
			//2단 형태
			for(int by=1; by<=9; by++) {
				System.out.printf("%d X %d = %d \n", dan, by, dan*by);
			}
			System.out.println("----------");
		}
		
//		for(int dan=2; dan<=9; dan++) {
//			//짝수이면 출력하자
//			if( dan % 2 == 0 ) {
//				//2단 형태
//				for(int by=1; by<=9; by++) {
//					System.out.printf("%d X %d = %d \n", dan, by, dan*by);
//				}
//				System.out.println("----------");
//			}
//		}
		
		
//		//2단 형태
//		for(int by=1; by<=9; by++) {
//			System.out.printf("2 X %d = %d \n", by, 2*by);
//		}
//		
//		//3단 형태
//		for(int by=1; by<=9; by++) {
//			System.out.printf("3 X %d = %d \n", by, 3*by);
//		}
//		// .....
//		
//		//9단 형태
//		for(int by=1; by<=9; by++) {
//			System.out.printf("9 X %d = %d \n", by, 8*by);
//		}
		
	}
}
