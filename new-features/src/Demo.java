
public class Demo<W> {

	private W data;

	public Demo(W data) {
		this.data = data;
	}

	public W getData() {
		return data;
	}

	public void setData(W data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hello");
		System.out.println(d1.getData());
		
		Demo<Integer> d2 = new Demo<Integer>(400);
		System.out.println(d2.getData());
	}
}
