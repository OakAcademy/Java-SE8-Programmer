package method;

public class VarArgsExample {

	public static void main(String[] args) {
		
		//store();
		store(null);

	}
	
	//only 1 varargs and it should be last parameter
	public static String store(int...numbers) {
		
		/*
		for(int n = 0; n < numbers.length; n++) {
			
			System.out.println("numbers[" + n + "] = " + numbers[n]);
			
		}
		
		System.out.println("Length of numbers array = " + numbers.length);*/
		
		System.out.println("Hello Java");
		
		return "";
		
	}
	
	
	
}
