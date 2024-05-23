package d0523;

public class AccountMain {
	public static void main(String[] args) {
//		2. 은행계좌를 만들어낼 클래스 선언하기: main 메소드를 갖는 클래스
//	    홍길동의 은행계좌 객체 생성하기
//	    통장정보출력: 예금주, 계좌번호, 잔액을 출력
//	    5만원 입금한 후 출력 
//	    3만원 출금한 후 출력
		Account hong 
		= new Account("홍길동", "1111-222-3333");
		
		accountInfo(hong);
		
		
		//며칠후: 5만원 입금한 후 출력
		hong.deposit(50000);
		accountInfo(hong);
		
	
		//며칠후: 3만원 출금한 후 출력
		hong.withdraw(30000);
		accountInfo(hong);
		
		Account sim =
		new Account(
			"심청", "11-22-888", 50000);
		accountInfo(sim);
	}
	
	
	static void accountInfo( Account who, int request, int hand ) {
		System.out.printf("%s의 통장------\n", who.owner );
		System.out.printf("계좌번호: %s \n", who.accountNo );
		System.out.println("출금요청액: " + request 
						+ " 출금된금액: " + hand );
		System.out.printf("잔액: %d \n", who.balance);	
	}
	
	static void accountInfo( Account who ) {
		System.out.printf("%s의 통장------\n", who.owner );
		System.out.printf("계좌번호: %s \n", who.accountNo );
		System.out.printf("잔액: %d \n", who.balance);	
	}
}
