
@FunctionalInterface
interface Add<T>{
	T sum(T a, T b);
}

public class MathDemo {

	public static void main(String[] args) {
		
		Add<Integer> ai = (a,b) -> a + b;
		System.out.println(ai.sum(10, 20));
		
		Add<Double> di = (a,b) -> a + b;
		System.out.println(di.sum(10.23, 20.54));

	}

}
