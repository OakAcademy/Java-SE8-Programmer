package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int[] numbers = {6, 4, 3, 5};
		int sum = 0;
		
		for(int num : numbers) {
			
			sum +=num;//sum = sum + num
			System.out.println(num);
			
		}
		
		System.out.println("sum of numbers = " + sum);
		
		
		
		
		
		/*
		char[] letters = {'h','e','l','l','o'};
		
		for(int i = 0; i < letters.length; i++) {
			
			System.out.println(letters[i]);
			
		}*/
		
		/*
		char[] letters = {'h','e','l','l','o'};
		
		for(char item : letters) {
			
			System.out.println(item);
			
		}*/
		
		/*
		String language = "java";
		for(char letter : language.toCharArray()) {
			
			System.out.print(letter);
			
		}*/

	}

}
