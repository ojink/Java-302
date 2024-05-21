
public class IfEx06 {
	public static void main(String[] args) {
		//정수: 양의정수, 음의정수, 0
		//어떤수가 양의정수/음의정수/0 인지 출력하기
		int no = -5;
		if( no > 0 ) {
			System.out.println( no + "는 양의 정수");
		}else if( no == 0 ) {
			System.out.println( no + "는 0");
		}else {//if( no < 0 ) {
			System.out.println( no + "는 음의 정수");
		}
		
	
	}
}
