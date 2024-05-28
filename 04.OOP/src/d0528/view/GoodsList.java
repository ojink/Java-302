package d0528.view;

import d0528.GoodsInfoMain;
import d0528.dto.GoodsInfo;

public class GoodsList {
//	출력:
//		제조사     상품코드  상품명   표준가격  할인율  판매가격
//		아디다스  AD01       운동화  70000         0      70000         
//		나이키    NK01        모자     30000         0      30000
	public GoodsList(){
		System.out.println("제조사     상품코드  상품명   표준가격  할인율  판매가격");
		System.out.println("--------------------------------------------");
		for( GoodsInfo goods: GoodsInfoMain.goods ) {
			if( goods == null ) continue;
			System.out.println( goods.maker+ "\t"
						+ goods.code + "\t"
						+ goods.name + "\t"
						+ goods.cost + "\t"
						+ goods.discount + "\t"
						+ goods.saleCost() 
						);
		}
	}
}
