
/*public class EventDemo implements Event{
	
	public static void main(String[] args) {
		
		EventDemo e = new EventDemo();
		
		Event ev = e;
		ev.perform();	
	}

	@Override
	public void perform() {
		System.out.println("Event");
		
	}
}*/

class EventImpl implements Event{
	@Override
	public void perform() {
		System.out.println("First Performance");
	}
}

public class EventDemo{
	
	class InnerEventImpl implements Event{
		@Override
		public void perform() {
			System.out.println("Second Performance");
		}
	}	
	
	public void nestedEvent() {
		class NestedEventImpl implements Event{
			@Override
			public void perform() {
				System.out.println("Third Performance");	
			}
		}
		new NestedEventImpl().perform();
		//NestedEventImpl ne = new NestedEventImpl();
		//ne.perform();
	}
	
	public void anonymousEvent() {
		Event e = new Event() {
			@Override
			public void perform() {
				System.out.println("Fourth Performance");	
			}
		};
		e.perform();
	}
	
	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();
		
		EventDemo demo = new EventDemo();
		InnerEventImpl inner = demo.new InnerEventImpl();
		inner.perform();
		
		demo.nestedEvent();
		
		demo.anonymousEvent();
	}
}

