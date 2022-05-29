
public class Car {

	private String model;
	private String[] features;
	
	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of "+model);
		for (String f : features) {
			System.out.println(" - "+f);
		}
	}
	
	public static void main(String[] args) {
		//String[] af = {"Power Window", "Remote Key", "Power Steering"};
		//Car alto = new Car("Suzuki Alto", af);
		
		Car alto = new Car("Suzuki Alto", "Power Window", "Remote Key", "Power Steering");
		
		Car punch = new Car("Tata Punch", "Power Window", "Remote Key", "Power Steering");
		
		alto.specs();
		punch.specs();
	}
	
}
