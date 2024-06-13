package account;


public class BalanceAccount extends Thread {
	ShareAccount share;
	
	public BalanceAccount(ShareAccount share) {
		this.share = share;
	}

	@Override
	public void run() {
		//두 통장의 잔고의 합계는 늘 같다 
		for(int no=1; no<=5; no++ ) {
			share.print();
			try {
				Thread.sleep(10); 
			} catch (InterruptedException e) {
			} 
		}
	}
	
}
