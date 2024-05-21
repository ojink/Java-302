import java.util.Random;

public class RockScissorsPaperIf {
	public static void main(String[] args) {
		Random r = new Random();
		//가위바위보(RockScissorsPaper)
		//가위:0 바위:1 보:2
		int scissors = 0, rock = 1, paper = 2;
		System.out.println("가위바위보!!");
		//0~2 의 세 수 중 하나 랜덤 추출
		//두 사람(홍길동, 심청)이 가위바위보를 하여 누가 이겼는지 출력하기
		int hong = r.nextInt(3);
		int sim = r.nextInt(3);
		System.out.printf("홍길동: %s \n"
					, hong==0 ? "가위" : (hong==1 ? "바위" : "보")  );

		System.out.printf("심청: %s \n"
					, sim==0 ? "가위" : (sim==1 ? "바위" : "보")  );
		
		//홍
		//가위0>보2, 바위1>가위0, 보2>바위1
		if( hong == sim ) {
			System.out.println("무승부");
		}else if( (hong==0 && sim==2)	
					|| hong==1 && sim==0 
					|| hong==2 && sim==1 ) {
			System.out.println("홍길동 승!");
		}else {
			System.out.println("심청 승!");
		}
	}
}
