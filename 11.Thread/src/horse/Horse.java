package horse;

//Thread  클래스 상속받아  Horse 클래스 선언
public class Horse extends Thread{
	String name;
	int no;
	ShareRank share;
	
	
	public Horse(String name, ShareRank share, int no) {
		this.name = name;
		this.share = share;
		this.no = no;
	}


	@Override
	public void run() {
		//100미터 달리기
		//20미터 간격으로 현재 지나치는 지점과 경주마 이름 출력하기
		//20미터 통과시마다 1초정도 sleep(1000) 지정하기 
		for(int m=0; m<=100; m+=20 ) {
			++share.rank;
			
			if( m==0 ) {
				System.out.printf("%d번 경주마 [%s] 막 %d등으로 출발! \n"
									, no, name, share.rank);
			}else if( m==100 ) {
				
				//100미터 지점 을 통과하면 어떤 경주마가 몇 등으로
				synchronized(share) {
					++share.rank;
					System.out.printf("%d위 %d번 말 [%s] \n", share.rank, no, name);
				}
				
			}else {
				System.out.printf("현재 %dM 지점 통과 %d번 경주마 [%s] %d등 \n"
										, m, no, name, share.rank);
			}
			if( share.rank == 5 ) {
				synchronized(share){
					share.notifyAll();
					share.rank = 0;
				}
			}else {
				synchronized(share) {
					try {
						share.wait();
//						for(Horse horse : share.horse ) {
//							if( this.getName() == horse.getName()  ) {
//								horse.wait();
//							}
//						}
					} catch (InterruptedException e) {
					}
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
		}
		
	}

	
}
