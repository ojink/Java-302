package horse;

public class HorseMain {
	public static void main(String[] args) {
		ShareRank share = new ShareRank();
		
		Rank rank = new Rank(share);
		
		Horse h1 = new Horse("강철여걸", share, 1);
		Horse h2 = new Horse("마하비상", share, 2);
		Horse h3 = new Horse("당대초월", share, 3);
		Horse h4 = new Horse("빛의순간", share, 4);
		Horse h5 = new Horse("청산질주", share, 5);
		
		rank.start();
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
		
	}
}
