import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
//		키보드로 나이를 입력하자.
//		Scanner scan;
//		scan = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
//		int no;
//		no = 10;
//		int no = 10;
		
//		제시문: 당신은 나이는?
		System.out.println("당신은 나이는?");
		int age = scan.nextInt();
		
//		입력한 나이에 따라 연령대(유아,소아,청소년,성인) 출력하기 - if문
//		유아: 6세 미만
//		소아: 12세 미만
//		청소년: 19세 미만
//		그외는 성인
/*		
		if( age < 6 ) {
			System.out.printf("%d세는 유아", age);
		}else if ( age < 12 ) {
			System.out.printf("%d세는 소아", age);
		}else if ( age < 19 ) {
			System.out.printf("%d세는 청소년", age);
		}else if ( age >= 19 ) {
			System.out.printf("%d세는 성인", age);
		}
*/		
		String range ;
		if( age < 6 ) {
			range = "유아";
		}else if ( age < 12 ) {
			range = "소아";
		}else if ( age < 19 ) {
			range = "청소년";
		//}else if ( age >= 19 ) {
		}else {
			range = "성인";
		}
		
		System.out.printf("%d세는 %s", age, range);
	}
}
