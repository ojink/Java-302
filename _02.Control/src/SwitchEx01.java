
public class SwitchEx01 {
	public static void main(String[] args) {
		// 홀수/짝수인지 판단하기
		int no = 9;
		
//		if ( no % 2 == 0 ) {
//		} else if ( no % 2 == 0 ) { 
//		}
		
		switch( no % 2 ) {
		case 0: 
			System.out.println( no +": 짝수" );
			break;
		case 1: 
			System.out.println( no +": 홀수" );
			break;
		}
		
		
//		if ( no % 2 == 0 ) {
//		}else { 
//		}
		switch( no % 2 ){
		case 1:
			System.out.println( no + ": 홀수 ");
			break;
		default:
			System.out.println( no + ": 짝수 ");
//			break;
		}
		
	}
}
