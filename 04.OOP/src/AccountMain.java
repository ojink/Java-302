
public class AccountMain {
	public static void main(String[] args) {
//		2. 은행계좌를 만들어낼 클래스 선언하기: main 메소드를 갖는 클래스
//	    홍길동의 은행계좌 객체 생성하기
//	    통장정보출력: 예금주, 계좌번호, 잔액을 출력
//	    5만원 입금한 후 출력 
//	    3만원 출금한 후 출력
		Account hong = new Account();
		hong.owner = "홍길동";
		hong.accountNo = "1111-222-3333";
		
		//받아든 통장의 정보확인
		System.out.printf("%s의 통장------\n", hong.owner );
		System.out.printf("계좌번호: %s \n", hong.accountNo );
		System.out.printf("잔액: %d \n", hong.balance);
		
		//며칠후: 5만원 입금한 후 출력
		hong.deposit(50000);
		accountInfo(hong);
		
	
		//며칠후: 3만원 출금한 후 출력
		hong.withdraw(30000);
		accountInfo(hong);
		
		
		Account park = new Account(); //박문수씨 통장개설
		park.owner = "박문수";
		park.accountNo = "22-333-4444";
		park.balance = 50000;
		//통장정보 확인
		accountInfo( park );
		
		//박씨가 3만원 입금
		park.deposit(30000);
		accountInfo( park );
		
		//박씨가 10만원 출금
		int request = 100000;
		int output = park.withdraw( request );
		accountInfo( park, request, output );
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
