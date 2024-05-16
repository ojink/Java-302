
public class MethodEx04 {
	
	static String isTriple(int no) {
		//3으로 나눈 나머지가 0 : 배수      1, 2  
		//8으로 나눈 나머지가 0 : 배수      1, 2, 3, 4, 5, 6, 7  
		String result ;
		if( no %3 == 0) {
			result = "3의 배수";
		}else {
			result = "3의 배수가 아니다";
		}
		return result;
	}
	
	static boolean isTriple3(int no) {
		boolean is;
		if( no%3 == 0 ) 	is = true;
		else 				is = false;			
		return  is;
	}
	
	static int isTriple2(int no) {
		//3으로 나눈 나머지가 0 : 배수      1, 2  
		//8으로 나눈 나머지가 0 : 배수      1, 2, 3, 4, 5, 6, 7  
//		String result ;
		int mod = no %3;
		return mod;
	}
	
	public static void main(String[] args) {
//		어떤 수가 3의 배수인지 아닌지 판단하여 출력할 
//		메소드 선언하고 호출하기
//		출력문은 main 메소드에서
		int su = 9;
		
		boolean is = isTriple3(su);
		System.out.println( is ? "3의 배수" : "3의 배수 아님" );
		
		int no = isTriple2(su);
		System.out.println(su+ ": " 
							+ (no==0 ? "3의 배수" : "3의 배수 아님") );
		
		String s = isTriple( su );
		System.out.println( su + " : " + s );
//		System.out.println( isTriple( su ) );

	}
}
