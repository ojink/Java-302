//은행계좌 클래스
public class Account {
//	실습 
//	1. 은행계좌 클래스 선언하기
//	   필드: 계좌번호, 예금주, 잔액
	String accountNo, owner;
	int balance;
//	   메소드: 입금한다(입금한 금액만큼 잔액을 증가시키기)
	void deposit(int money) {
		balance += money;
	}
//	   출금한다(입금한 금액만큼 잔액을 감소시키기, 출금한 금액을 반환하기)
	int withdraw(int money) {
		//통잔 잔고보다 출금액이 많으면 출금은 안됨
		if( balance < money ) return 0;
		balance -= money;
		return money;
	}
	
}
