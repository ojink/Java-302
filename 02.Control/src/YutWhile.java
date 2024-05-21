import java.util.Random;

public class YutWhile {
	public static void main(String[] args) {
		Random r = new Random();
		//윷을 던져 그 결과를 출력하기
		//앞:1, 뒤:0
		//도:앞뒤뒤뒤-1  개:앞앞뒤뒤-2  걸:앞앞앞뒤-3  윷:앞앞앞앞-4  모:뒤뒤뒤뒤-0
		int yut;
		boolean oneMore = false;
		do {
			oneMore = false;
			System.out.println("윷 나와라~");
			int bar1 = r.nextInt(2);
			int bar2 = r.nextInt(2);
			int bar3 = r.nextInt(2);
			int bar4 = r.nextInt(2);
			System.out.print(  bar1 == 1 ? "앞" : "뒤");
			System.out.print(  bar2 == 1 ? "앞" : "뒤");
			System.out.print(  bar3 == 1 ? "앞" : "뒤");
			System.out.print(  bar4 == 1 ? "앞" : "뒤");
			System.out.print( "---> " );
			yut = bar1 + bar2 + bar3 + bar4;
			
			switch( yut ) {
			case 1: 	System.out.println("도");   break;
			case 2: 	System.out.println("개");   break;
			case 3: 	System.out.println("걸");   break;
			case 4: 	System.out.println("윷");   oneMore = true; break;
			case 0: 	System.out.println("모");   oneMore = true; break;
			}
	
//			if( yut==4 || yut == 0 ) {
//			oneMore = true;
			if( oneMore ) {
				System.out.println("한번 더~~");
			}
		
		}while( oneMore );
//		}while( yut==4 || yut == 0 );
		
//		if( yut==4 ) {
//			System.out.println("한번 더~~");
//		}else if( yut==0 ) {
//			System.out.println("한번 더~~");
//		}
		
		
	}
}
