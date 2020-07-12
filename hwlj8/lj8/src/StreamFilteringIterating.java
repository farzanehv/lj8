import java.util.ArrayList;
import java.util.List;

public class StreamFilteringIterating {
	
	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList();
		productList.add(new Product(1, "a", 10000));
		productList.add(new Product(2, "b", 20000));
		productList.add(new Product(3, "c", 30000));
		productList.add(new Product(4, "d", 40000));
		
		productList.stream()
			.filter(product -> product.price > 20000)
			.forEach(System.out::println);
	}
}
