import java.util.Random;

public class RockScissorsPaperWhile {
	public static void main(String[] args) {
		//가위0바위1보2: 무승부 없음, 승자가 결정될때까지 가위바위보를 계속한다
		//가위0>보2     바위1>가위0      보2>바위1 
		Random r = 	new Random();
		int scissors = 0, rock = 1, paper = 2;
		int hong, park;
		
		do {
			System.out.println("가위바위보!!");
			hong = r.nextInt(3);
			park = r.nextInt(3);
			System.out.printf("홍길동: %s, 박문수: %s \n"
					, hong==0 ? "가위" : (hong==1? "바위" : "보")
					, park==0 ? "가위" : (park==1? "바위" : "보")
					);
			
		}while( hong == park );
		
		if( hong==0 && park==2 ||  hong==1 && park==0 
								||  hong==2 && park==1 ) {
			System.out.println("홍길동 승");
		}else {
			System.out.println("박문수 승");
			
		}
		
	}
}
