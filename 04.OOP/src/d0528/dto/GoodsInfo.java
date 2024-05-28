package d0528.dto;

public class GoodsInfo {
//	1. 상품정보 클래스 선언
//	필드: 상품코드, 상품명, 제조사, 표준가격, 할인율(%)
//	메소드: 할인율을 변경한다. 판매가를 계산한다.
//	생성자: 상품코드, 상품명, 제조사, 표준가격
	public String code, name, maker;
	public int cost, discount;

	public GoodsInfo(String code, String name, String maker, int cost){
		this.code = code;
		this.name = name;
		this.maker = maker;
		this.cost = cost;
	}
	
	public void changeDiscount(int discount) {
		this.discount = discount;
	}
	
	public int saleCost() {
		// 70000  0% : 70000,  70000  30% : 49000
		return cost * (100-discount) / 100 ;
	}
}
