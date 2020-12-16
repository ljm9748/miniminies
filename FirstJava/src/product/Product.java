package product;

public class Product { // Product "extends Object" 가 생략되어 있다.
	
	int price;
	int bonusPoint;
	
//	생성자 생성
	public Product(int price) {
		// super(); 
		this.price = price;
		this.bonusPoint = (int)(price*0.1f);
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

	
	
	
	
	
	

}
