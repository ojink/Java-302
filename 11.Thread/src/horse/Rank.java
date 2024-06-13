package horse;

public class Rank extends Thread{
	ShareRank share;
	Rank(ShareRank share){
		this.share = share;
	}
	
	public void run() {
		if( share.rank == 5 ) {
			share.notifyAll();
		}
	}
	
}
