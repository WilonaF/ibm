
public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		Person p = new Person("Polo", 21);
		System.out.println(p);
		
		String path = "src/pers.dat";
		ObjectOutputStream ostream = null;
		ObjectInputStream istream = null;

	}

}
