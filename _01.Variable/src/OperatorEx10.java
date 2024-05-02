import java.util.Scanner;

public class OperatorEx10 {
	public static void main(String[] args) {
//		나이를 입력받아 유아, 소아, 청소년, 성인 으로 구분해 출력하기
//		유아: 6세 미만
//		소아: 12세 미만
//		청소년: 19세 미만
//		그외는 성인
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이는?");
		int age = scan.nextInt();
		
		String range
		= age < 6 ? "유아" : ( age < 12 ? "소아" : ( age < 19 ? "청소년" : "성인" ) );
		System.out.printf("%d세인 당신은 %s입니다", age, range);
		
	}
}
