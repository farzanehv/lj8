import java.util.ArrayList;
import java.util.List;

public class ReduceExample {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList();
		productList.add(new Product(1, "a", 10000));
		productList.add(new Product(2, "b", 20000));
		productList.add(new Product(3, "c", 30000));
		productList.add(new Product(4, "d", 40000));
		
		float totalPrice = productList.stream()
				.map(product -> product.price)
				.reduce(0.0f, (sum, price) -> sum + price);
		
		System.out.println(totalPrice);
		
		float totalPrice2 = productList.stream()
				.map(product -> product.price)
				.reduce(0.0f,  Float::sum);
		
		System.out.println(totalPrice2);
	}
}
