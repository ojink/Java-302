import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//자판기메뉴
		//각 메뉴의 금액을 담을 변수 선언
		int coke = 1250, letsbe = 800, coco=1000;
		System.out.println("--- 자판기메뉴 ---");
		System.out.printf("1.콜라: %d원 \n", coke);
		System.out.printf("2.레쓰비: %d원 \n", letsbe);
		System.out.printf("3.코코팜: %d원 \n", coco);
		System.out.println("---------------");
				
		//돈을 투입구에 넣기
		System.out.println("투입구에 돈을 넣으세요");
		//키보드로 입력해서 돈을 투입하기: 투입한 돈을 담을 변수 선언
		int money = scan.nextInt();
		System.out.println("투입금액: " + money);
		
		//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 하기
		boolean bCoke = false,  bLetsbe=false, bCoco=false;
		if( money >= letsbe )	bLetsbe = true;
		if( money >= coco ) 	bCoco = true;
		if( money >= coke ) 	bCoke = true;
		//선택가능 메뉴에 불켜짐 표현하기
		System.out.printf( "1.콜라 : %d원 [%s] \n"
								, coke, bCoke ? "ON" : "OFF" );
		System.out.printf( "2.레쓰비 : %d원 [%s] \n"
								, letsbe, bLetsbe ? "ON" : "OFF" );
		System.out.printf( "3.코코팜 : %d원 [%s] \n"
								, coco, bCoco ? "ON" : "OFF" );
		//메뉴선택
		System.out.println("음료를 선택하세요");
		//선택한 메뉴에 따른 거스름돈 계산하기
		int choice = scan.nextInt();
		int change = money; 
		if( bCoke && choice == 1 ) { //콜라
			System.out.println("콜라 나온다");
			change = money - coke;
		}else if( bLetsbe && choice==2 ) {
			System.out.println("레쓰비 나온다");
			change = money - letsbe;
		}else if( bCoco && choice==3 ) {
			System.out.println("코코팜 나온다");
			change = money - coco;
//		}else {
//			change = money;
		}
		System.out.printf("거스름돈: %d \n", change);
		
		//제품이 나오고, 거스름돈이 나온다
		//1000원짜리 몇개
		//500원짜리 몇개
		//100원짜리 몇개
		//50원짜리 몇개
		if( change > 0 ) { //거스름돈이 있는 경우만 처리
			int c1000=0, c500=0, c100=0, c50=0;
			//메소드 호출로 변경하기
			
			//메소드 호출1
			//메소드 호출2
			//메소드 호출3
			//메소드 호출4
			
			
//			c1000 = change / 1000; //3000 - 1250 -> 1750 1000 1개
//			change %= 1000; //change = change % 1000;  // 750
//			if( c1000 > 0 ) System.out.printf("1000원 %d장 \n", c1000);
//			
//			c500 = change / 500; 
//			change %= 500; // 250
//			if( c500 > 0 ) System.out.printf("500원 %d개 \n", c500);
//			
//			c100 = change / 100;
//			change %= 100; // 50
//			if( c100 > 0 ) System.out.printf("100원 %d개 \n", c100);
//			
//			c50 = change / 50;
//			change %= 50; // 
//			if( c50 > 0 ) System.out.printf("50원 %d개 \n", c50);
		}
	}
	
	//거스름돈 계산 메소드 선언
	
	
}
