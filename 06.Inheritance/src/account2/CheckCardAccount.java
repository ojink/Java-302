package account2;

public class CheckCardAccount extends Account {
	String cardNo; //--
	
	CheckCardAccount(){
		System.out.println("CheckCardAccount생성자");
	}
	CheckCardAccount(String owner, String accountNo, String cardNo){
		super(owner, accountNo);
		this.cardNo = cardNo;
	}
	CheckCardAccount(String owner, String accountNo
					, String cardNo, int balance){
		this(owner, accountNo, cardNo);
		this.balance = balance;
	}
	CheckCardAccount(int balance, String owner, String accountNo
					, String cardNo ){
		super(owner, accountNo, balance);
		this.cardNo = cardNo;
	}
	
	//결제하기 --
	int pay(int money, String cardNo) throws Exception {
		if( ! cardNo.equals( this.cardNo ) )
			throw new Exception("결제불가 카드!");
		return withdraw(money);
	}
}
