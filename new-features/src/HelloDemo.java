
public class HelloDemo {

	public static void main(String[] args) {
		
		Hello h = () -> "Hello World"; //Lambda Expression
		System.out.println(h.sayHello());
		
		Hello h2 = () ->{
			String msg = "Hola Monde";
			return msg;
		};
		System.out.println(h2.sayHello());
		
		h2.sayBye();
	}
}
