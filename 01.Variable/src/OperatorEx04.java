
public class OperatorEx04 {
	public static void main(String[] args) {
		//복합대입연산자: +=, -=, *=, /=, %=
		//대입연산자 : =
		int no;
		no = 10;
		
		no = no + 5; //기본산술연산 + 대입연산
		System.out.println( no );
		
		
		no += 5; // no = no + 5;
		System.out.println( no );
		
		no -= 20;
		System.out.println( no );
		
		
		no = 1;
		//누적데이터를 담을 변수 선언
		int sum = 0;
		//1+1+1+1+1
//		sum = sum + no; // 1
//		sum = sum + no; // 2
//		sum = sum + no; // 3
		sum += no;
		sum += no;
		sum += no;
		sum += no;
		sum += no;
		System.out.println( "합: " + sum );
		//프로그램 실행: ctrl+F11 또는 F11
		//라인복사붙여넣기: ctrl+alt+방향키(상하)
		
	}
}
