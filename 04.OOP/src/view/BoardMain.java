package view;

import java.util.Scanner;

public class BoardMain {
	
	//DB라고 생각하자
	static Board[] list = new Board[10];
	static int seq; 
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while( true ) {
			System.out.println("1. 글쓰기화면");
			System.out.println("2. 글목록화면");
			System.out.println("3. 닫기");
			
			int menu = scan.nextInt();
			if( menu == 1 ) {
				new RegisterView(scan);
				
			}else if( menu==2 ) {
				new ListView();
				
			}else if( menu == 3 ) {
				break;
			}
		}
	
		scan.close();
	}
}
