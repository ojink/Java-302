package view;

public class Board {
//	1. 글번호가 자동으로 부여되는 방명록 클래스 선언
//	   필드선언:  공유글번호, 객체글번호, 제목, 작성자, 작성일자, 내용
//	   생성자선언: 파라미터 4개짜리 선언
	static int seqNo; 
	int no;
	String title, writer, writedate, content;
	Board(String title, String content, String writer, String writedate){
		this.no = ++seqNo;
		this.title = title;
		this.writer = writer;
		this.writedate = writedate;
		this.content = content;
	}
}
