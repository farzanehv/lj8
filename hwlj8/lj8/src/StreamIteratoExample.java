import java.util.stream.Stream;

public class StreamIteratoExample {

	public static void main(String[] args) {
		Stream.iterate(1, el -> el + 1)
		.filter(el -> el % 5 == 0)
		.limit(5)
		.forEach(System.out::println);
	}
}
