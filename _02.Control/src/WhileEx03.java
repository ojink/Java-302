
public class WhileEx03 {
	public static void main(String[] args) {
		//1~100까지 출력
		//1~100의 합 출력: 1+2+3+4....+100
		//합의 결과가 2000 이하일 때까지만 반복처리
		int no = 1, sum = 0;
		while( no <= 100 ) {
			System.out.println( no );
			if( sum+no > 2000 ) break;
			sum += no;   //sum = sum + no;
			++no;
		}
		System.out.printf("1~%d의 합: "+sum, no  );
		//no : 1    2      3
		//sum: 0+1  0+1+2  0+1+2+3
		
	}
}
