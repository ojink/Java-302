
public class IfEx05 {
	public static void main(String[] args) {
		//성적에 따른 학점 출력하기
		//성적을 담을 변수
		int score = 75;
		if( score >= 90 ) { // 75 >= 90 : F
			System.out.println( "A학점");
		}else if( score >= 80) { // 75 >= 80 :F
			System.out.println( "B학점");
		}else if( score >= 70) { // 75 >= 70 :T
			System.out.println( "C학점");
		}else if( score >= 60) { // 55 >= 60 :F
			System.out.println( "D학점");
		//}else if( score < 60) { // 55 < 60 :T
		}else {   // 위 4가지 경우에 해당하지 않는다면                
 			System.out.println( "F학점");
		}
		
		
	}
}
