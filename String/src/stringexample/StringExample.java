package stringexample;

public class StringExample {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Programming";
		System.out.println(s1);
		System.out.println(s2);
		
		String s3 = new String("Java");
		String s4 = new String("Programming");
		
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1 + " " + s2);
		System.out.println(s3 + " " + s4 );
		
		String s5 = s1 + s2;
		String s6 = s3 + s4;
		
		System.out.println(s5);
		System.out.println(s6);
		
		int num1 = 5;
		int num2 = 7;
		System.out.println(num1 + num2);
		
		String myNumString = "3";
		System.out.println(num1 + myNumString);
		
		System.out.println(2 + 5 + "7");//7(int) + 7(string) -> 77
		System.out.println(2 + "7" + 5);//27(string) + 5(int) -> 275
		System.out.println("7" + 2 + 5);//72(string) + 5(int) -> 725

	}

}
