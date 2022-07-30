package datatype;

public class TypeCasting {

	public static void main(String[] args) {
		
		int a = 124;
		long b = a;//long > int
		
		double d = b;//double > long
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("d: " + d);
		
		double s = 132.32;
		long m = (long) s;
		byte c = (byte) m;
		
		System.out.println("s: " + s);
		System.out.println("m: " + m);
		System.out.println("c: " + c);

	}

}
