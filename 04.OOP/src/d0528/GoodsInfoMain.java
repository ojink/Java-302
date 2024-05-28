package d0528;

import java.util.Scanner;

import d0528.dto.GoodsInfo;
import d0528.view.*;
//import d0528.view.GoodsList;
//import d0528.view.GoodsRegister;

public class GoodsInfoMain {
	static  public GoodsInfo goods[] = new GoodsInfo[5];
	static public int seq;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		
		
		while( true ) {
			System.out.println("--------------------------------");
			System.out.println("1.상품등록  2.상품목록  3.할인율   0.종료");
			System.out.println("--------------------------------");
			int menu = scan.nextInt();
			scan.nextLine();
			if( menu==1 ) {
				new GoodsRegister(scan);
			}else if( menu==2 ) {
				new GoodsList();
			}else if( menu==3 ) {
				new GoodsModify(scan);
			}else if( menu==0 ) {
				break;
			}
		}
//		2. 객체생성할 main 있는 클래스 선언
//		상품등록하기
//		상품목록출력하기
//		출력:
//		제조사     상품코드  상품명   표준가격  할인율  판매가격
//		아디다스  AD01       운동화  70000         0      70000         
//		나이키    NK01        모자     30000         0      30000         
//
//		모자 상품을 할인율 적용하기 - 30%할인
//		상품목록출력하기
//		제조사     상품코드  상품명   표준가격  할인율  판매가격
//		아디다스  AD01       운동화  70000         0      70000         
//		나이키    NK01        모자     30000         30     21000         

		
		scan.close();
	}//end of main

}//end of class
