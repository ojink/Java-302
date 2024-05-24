package d0524;
//상품 재고 관리
public class GoodsStock {
	//필드: 상품명, 상품코드, 재고수량
	private String goodsName, goodsCode;
	private int stockAmount;
	
	GoodsStock(String name, String code){
		goodsName = name;
		goodsCode = code;
	}
	
	GoodsStock(String name, String code
					, int amount){
		this(name, code);
		stockAmount = amount;
	}
	
	//필드에의 접근을 private 으로 제한하면
	//필드를 알려주는 getter메소드를 선언
	String getGoodsName() {
		return goodsName;
	}
	String getGoodsCode() {
		return goodsCode;
	}
	int getStockAmount() {
		return stockAmount;
	}
	
	
	//메소드: 입고한다. 출고한다
	//입고한다: 입고된 수량만큼 재고수량이 증가
	void plusStock(int amt) {
		stockAmount += amt; 
	}
	//출고한다: 출고된 수량만큼 재고수량이 감소, 출고된 수량 반환하기
	int minusStock(int amt) {
		//남은 재고수량보다 더 많은 수량을 출고요청 한다면 출고안되게
		if( stockAmount < amt ) return 0;
		stockAmount -= amt;
		return amt;
	}
}
