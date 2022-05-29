import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = console.nextLine();
		
		System.out.println("Your name is "+name);
		
		System.out.print("Enter Age: ");
		int age =  console.nextInt();
		
		System.out.println("Age: "+age);
	}
}
