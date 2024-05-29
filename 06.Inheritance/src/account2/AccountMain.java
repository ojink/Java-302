package account2;

public class AccountMain {
	public static void main(String[] args) {
//		final  int  no = 10; //변수 -> 상수
//		no = 20;
		
		Account hong 
		= new Account("홍길동", "111-22-333");
		System.out.println("-------");
		
		
		CheckCardAccount park
			= new CheckCardAccount("박문수", "222-33-444"
							, "2222-3333-4444", 50000);
		
		MinusAccount sim = 
		new MinusAccount("심청", "333-22-4444", 1000000);
		sim.deposit(100000);
		System.out.println("잔고: " + sim.balance);
		try {
			int money = sim.withdraw(500000);
			System.out.println("출금된금액: " + money);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("잔고: " + sim.balance);
			
		}
		
		try {
			int money = sim.withdraw( 800000 );
			System.out.println("출금된금액: " + money);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("잔고: " + sim.balance);
		}
		
	}
}
