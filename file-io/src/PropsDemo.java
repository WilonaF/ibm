import java.util.Properties;
import java.io.FileReader;

public class PropsDemo {

	public static void main(String[] args) throws Exception{
		FileReader reader = new FileReader("src/person.txt");
		
		Properties p = new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("age"));
		System.out.println(p.getProperty("city"));

	}

}
