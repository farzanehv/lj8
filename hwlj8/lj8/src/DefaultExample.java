interface Sayable {

	// default method, non abstract method
	default void say() {
		System.out.println("This is default method");
	}

	// abstract method
	void sayMore();

	// statuc method
	static void sayLouder() {
		System.out.println("This is static method");
	}
}

public class DefaultExample implements Sayable{

	public void sayMore() {
		System.out.println("Overriden");
	}
	
	public static void main(String []args) {
		DefaultExample de = new DefaultExample();
		de.say();
		de.sayMore();
		Sayable.sayLouder();
	}
	
}
