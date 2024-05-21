
public class SwitchEx03 {
	public static void main(String[] args) {
		//3의 배수(3으로 나눈 나머지가 0)인지 아닌지 출력하기
		//0,1,2
		int no = 6;
//		if( no % 3 == 0 ) {
//		}else if( no % 3 == 1 || no % 3 == 2 ) {
//		}
		switch( no % 3 ) {
		case 0:
			System.out.println( no + "는 3의 배수");
			break;
		case 1:
		case 2:			
			System.out.println( no + "는 3의 배수 아님");
		}
		
//		if( no % 3 == 0 ) {
//		}else {
//		}
		switch( no % 3 ) {
		case 0:
			System.out.println( no + "는 3의 배수");
			break;
		default:			
			System.out.println( no + "는 3의 배수 아님");
		}
		
		
		switch( no % 3 ) {
		case 1:
		case 2:			
			System.out.println( no + "는 3의 배수 아님");
			break;
		case 0:
			System.out.println( no + "는 3의 배수");
		}
		
	}
}
