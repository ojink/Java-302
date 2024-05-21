
public class LoopEx02 {
	public static void main(String[] args) {
		//구구단 2단 ~ 19단 출력
		for(int dan=2; dan<=19; dan++) {
			System.out.printf("구구단 %d \n", dan);
//			System.out.println("2단 출력하기");
			//2단 출력하기
			for(int no=1; no<10; no++) {
				System.out.printf("%d X %d = %d \n", dan,  no, dan*no);
			}
		}
	}
}
