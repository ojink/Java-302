package view;

public class ListView {
//	배열에 있는 글목록을 출력
	ListView(){
		System.out.println("번호 \t제목 \t내용 \t작성자 \t작성일자" );
		 for(Board board : BoardMain.list) {
			if( board == null ) continue;
			System.out.print( board.no + "\t");
			System.out.print( board.title + "\t");
			System.out.print( board.content + "\t");
			System.out.print( board.writer + "\t");
			System.out.print( board.writedate + "\t");
			System.out.println();
		}
	}
}
