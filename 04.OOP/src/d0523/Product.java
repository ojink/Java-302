package d0523;

public class Product {
//	1. 상품정보 클래스 Product 선언
//	1-1) 필드: 상품명, 상품코드, 상품가격
	String productName, productCode;
	int productPrice;
//	1-2) 생성자: 상품명, 상품코드를 초기화,
//	                 모든 필드를 초기화
	Product(String productName, String productCode){
		this.productName = productName;
		this.productCode = productCode;
	}
	Product(String productName, String productCode
			, int productPrice){
		this(productName, productCode);
		this.productPrice = productPrice;
		//.productCode..productCode.
	}
//	1-3) 메소드: 가격을 변경한다
	void changePrice(int productPrice) {
		this.productPrice = productPrice;
	}
}
