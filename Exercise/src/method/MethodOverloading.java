package method;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Sum of two int numbers: " + add(10, 20));
		
		System.out.println("Sum of two long numbers: " + add(30L, 40L));
		
		System.out.println("Sum of two double numbers: " + add(50.5, 60.6));

	}
	
	public static int add(int x, int y) {
		
		return x+y;
		
	}
	
	static long add(long x, long y) {
		
		return x+y;
		
	}
	
	protected static double add(double x, double y) {
		
		return x+y;
		
	}

}
