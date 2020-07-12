import java.util.*;
import java.util.stream.Collectors;

class Product{
	
	int id;
	String name;
	float price;

	public Product(int inputId, String inputName, float inputPrice){
		
		this.id = inputId;
		this.name = inputName;
		this.price = inputPrice;
	}
}


public class StreamExample{

	public static void main(String []args){
		List<Product> productList = new ArrayList();

		productList.add(new Product(1, "a", 10000));
		productList.add(new Product(2, "b", 20000));
		productList.add(new Product(3, "c", 30000));
		productList.add(new Product(4, "d", 40000));

		List<Float> productPriceList = productList.stream()
			.filter(p -> p.price > 20000)
			.map(p -> p.price)
			.collect(Collectors.toList());

		System.out.println(productPriceList);
	}
}
