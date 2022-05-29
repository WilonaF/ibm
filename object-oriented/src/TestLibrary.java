import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("JAVA for Beginners");
		Member m1 = new Member("Wilona");
		
		b1.status();
		m1.status();
		
		//Logic to issue and return book
		b1.issueBook(m1);
		b1.status();
		m1.status();
		
		b1.returnBook(m1);
		b1.status();
		m1.status();
	}

}
