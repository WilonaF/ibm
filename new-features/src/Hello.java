@FunctionalInterface
public interface Hello {
	String sayHello();
	
	default void sayBye() {
		System.out.println("Goodbye!");
	}
}
