package view;

import java.util.Scanner;

public class RegisterView {
	//키보드로 입력하기
	//방명록 글 객체를 생성해서 배열변수에 주소 담기
	private Board[] list;
	RegisterView(Board[] list, Scanner scan){
		this.list = list;
		System.out.println("글쓰기화면 --------------");
		System.out.print("제목: ");
		System.out.print("내용: ");
		System.out.print("작성자: ");
		System.out.println("----------------------");
		
	}
}
