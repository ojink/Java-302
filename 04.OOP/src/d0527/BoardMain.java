package d0527;

public class BoardMain {
	public static void main(String[] args) {
//		2. 방명록 생성할 main 있는 클래스
//		   방명록 객체 생성해서 등록한 글목록 출력
		//홍길동이 첫번째 글 씀
		Board hong =
		new Board("안녕", "반가워", "홍길동", "24-05-26");
		
		//심청이 두번째 글 씀
		Board sim =
			new Board("hi", "날씨가 덥다", "심청", "24-05-27");
		
		//박문수가 세번째 글 씀
		Board park =
				new Board("hello", "여름이네", "박문수", "24-05-27");
		
		info(hong);
		info(sim);
		info(park);
		
		//목록으로 출력
		Board[] list = new Board[10];
		list[0] = hong;
		list[1] = sim;
		list[2] = park;
		list(list);
	}
	
	static void list(Board[] list) {
		System.out.println("번호 \t제목 \t내용 \t작성자 \t작성일자" );
		for( Board board : list) {
			if( board == null ) continue;
			System.out.print( board.no + "\t");
			System.out.print( board.title + "\t");
			System.out.print( board.content + "\t");
			System.out.print( board.writer + "\t");
			System.out.print( board.writedate + "\t");
			System.out.println();
		}
	}
	
	static void info(Board board) {
		System.out.println("번호: " + board.no);
		System.out.println("제목: " + board.title);
		System.out.println("내용: " + board.content);
		System.out.println("작성자: " + board.writer);
		System.out.println("작성일자: " + board.writedate);
	}
}
