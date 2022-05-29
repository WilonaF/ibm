
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		//Calling another constructor on the same object
		this("Anonymous", -1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name: "+name+"\tAge: "+age);
	}
	
	@Override
	public String toString() {
		return "Name: "+name+"\tAge: "+age;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(p.name.equals(name) && p.age == age)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		//Person p = new Person("Wilona", 100);
		//p.print();
		
		//Person p1 = new Person();
		//p1.print();
		
		//System.out.println(p.hashCode());
		//System.out.println(p.toString());
		
		Person p2 = new Person("Polo", 21);
		
		System.out.println(p2.hashCode());
		System.out.println(p2); //implicitly calls the toString()
		
		Person p3 = new Person("Jack", 20);
		System.out.println(p3);
		
		System.out.println(p2.equals(p3));

	}
}


