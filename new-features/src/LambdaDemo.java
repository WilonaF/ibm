import java.util.function.Supplier;

public class LambdaDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Consumer<String> c1 = System.out::println;
		c1.accept("Hello");
		c1.accept("Hola");
		c1.accept("Bonjour");
		
		Consumer<String> c2 = LambdaDemo::print;
		c2.accept("Aloha");
		
		Supplier<String> s1 = () -> "Adios";
		System.out.println(s1.get());
		print(s1.get());
	}
}
