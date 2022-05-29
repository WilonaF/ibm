
public class TestAlfaBeta {

	public static void main(String[] args) {
		
		Alfa a = new Alfa();
		a.demo();
		System.out.println();
		//Beta bt = (Beta) a;

		Beta b = new Beta();
		b.test();
		b.demo();
		System.out.println();
		
		Alfa ab = b;
		ab.demo();
		//ab.test();
		System.out.println();
		
		Beta ba = (Beta) ab;
		ba.demo();
		ba.test();
	}

}
