
public class IfEx07 {
	public static void main(String[] args) {
		//성별 판단하기 - 1,2,3,4 에 따라 남성/여성인지 출력하기
		//주민번호 성별을 담을 변수 선언 : 데이터타입 + 변수명;
		int gender = 1;
		/*
		//1. 각각 조건을 판단하는 경우
		if( gender == 1 ) {
			System.out.printf("주민번호 %d은 남성 ", gender);
		}else if( gender == 2 ) {
			System.out.printf("주민번호 %d은 여성 ", gender);
		}else if( gender == 3 ) {
			System.out.printf("주민번호 %d은 남성 ", gender);
		}else if( gender == 4 ) {
			System.out.printf("주민번호 %d은 여성 ", gender);
		}
		
		//남성/여성
		if( gender == 1 || gender == 3 ) {
			System.out.printf("주민번호 %d은 남성 ", gender);
		}else if( gender == 2 || gender == 4 ) {
			System.out.printf("주민번호 %d은 여성 ", gender);
		}
		 */
		gender = 3;
//		if( gender == 1 || gender == 3 ) {
//			System.out.printf("주민번호 %d은 남성 ", gender);
//		}else {
//			System.out.printf("주민번호 %d은 여성 ", gender);
//		}
//		if( gender == 2 || gender == 4 ) {
//			System.out.printf("주민번호 %d은 여성 ", gender);
//		}else {
//			System.out.printf("주민번호 %d은 남성 ", gender);
//		}
//		if( gender == 1 || gender == 3 ) { 
//			System.out.printf("주민번호 %d은 남성 ", gender);
//		}else if( gender == 2 || gender == 4 ) {
//			System.out.printf("주민번호 %d은 여성 ", gender);
//		}else {
//			System.out.printf("주민번호 %d은 성별 판별 불가한 수", gender);
//		}
		//1, 3:남성  2, 4:여성 - 2로 나눈 나머지가 0 이면 여성, 아니면 남성
		gender = 5;
		if( gender % 2 == 0 ) {
			System.out.printf("주민번호 %d은 여성 ", gender);
		}else if( gender % 2 == 1 ) {
			System.out.printf("주민번호 %d은 남성 ", gender);			
		}else {
			System.out.printf("주민번호 %d은 성별 판별 불가한 수", gender);			
		}
	}
}
