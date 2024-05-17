
public class MethodEx00 {
	public static void main(String[] args) {
		// 1과 3을 더하여 결과를 출력하기
		add(1, 3);
		
		// 5과 8을 더하여 결과를 출력하기
		add(5, 8);
		
		// 15과 9을 더하여 결과를 출력하기
		add(15, 9);
		System.out.println("---------");
		
		int no = plus(1,5);
		System.out.println( no );
		// 15과 9을 더하여 결과를 출력하기
		System.out.println(  plus(10,5) );
		no = plus(1,9);
		System.out.println( no );
		
	}
	
	static int plus(int no1, int no2) {
		int no = no1 + no2;
		return no;
	}
	
	static void add(int no1, int no2) {
		int no = no1 + no2;
		System.out.printf("%d + %d = %d" ,no1, no2, no  );
		System.out.println();
	}
	
}
