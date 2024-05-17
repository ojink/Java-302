import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		과제
//		1부터 키보드로 입력한 수까지의 합을 반환하는
//		메소드를 선언한 후
//
//		main 메소드에서 
//		1. 제시문: 몇까지의 합을 계산할 건가요?
		System.out.println("몇까지의 합을 계산할 건가요?");
		int end = scan.nextInt();
		
//		2. 선언한 메소드를 호출하고
		int result = sum( end );
		
//		3. 합의 결과를 출력하기
		System.out.printf("1~%d 까지의 합: %d \n", end, result);
		
		System.out.printf("1~%d 까지의 합: %d \n", end, sum( end ) );
	}
	
	//1부터 키보드로 입력한 수까지의 합을 반환하는 메소드
	static int sum(int no) {
		//1~5 : 1 + 2 + 3 + 4 + 5
		int sum = 0;
		for(int i=1; i<=no; i++) {
			sum += i;
		}
		return sum;
	}
}
