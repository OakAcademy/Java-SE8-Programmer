package comment;

public class Comment {
	
	/*
	 * This is the main method
	 * 
	 * */
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		
		//this method prints the Welcome to Java on the console
		System.out.println("Welcome to Java");
		
		/*
		int a=5, b=2, sum = 0;
		
		sum = a + b;
		
		System.out.println("Sum = " + sum);*/
		
		mySumMethod(0, 0);
		
		
	}
	
	/**
	 * This method sums two integer values
	 * @param a is the first parameter
	 * @param b is the second parameter
	 * @return this method returns the sum of the a and b
	 */
	public static int mySumMethod(int a, int b) {
		
		return a+b;
		
	}

}
