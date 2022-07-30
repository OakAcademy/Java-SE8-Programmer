package stringexample;

public class StringMethodExample {

	public static void main(String[] args) {
		
		String myString1 = "Java Programmming";
		String myString2 = "Language";
		String myString3 = "language";
		
		// J a v a   P r o g r a  m  m  i  n  g
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -> index numbers
		//indexOf()
		System.out.println(myString1.indexOf("v"));
		System.out.println(myString1.indexOf("a",6));
		System.out.println(myString1.indexOf("gram"));
		System.out.println(myString1.indexOf("gram",20));
		
		//charAt()
		System.out.println(myString1.charAt(0));
		System.out.println(myString1.charAt(4));
		//System.out.println(myString1.charAt(20));
		
		//substring
		System.out.println(myString1.substring(5));
		System.out.println(myString1.substring(5,12));
		
		//equalsIgnoreCase()
		System.out.println(myString2.equalsIgnoreCase(myString3));
		
		//endsWith()
		System.out.println(myString1.endsWith("ing"));
		
		//startsWith()
		System.out.println(myString2.startsWith("l".toUpperCase()));
		
		//contains()
		System.out.println(myString1.contains("gr"));
		System.out.println(myString1.contains("J".toLowerCase()));
		
		//replace() aaa --> replace aa with b --> ba
		
		System.out.println(myString1.replace(" ", "_"));
		System.out.println(myString1.replace("mm", "_"));
		
		//trim()
		System.out.println(" java programming language  ");
		System.out.println(" java programming language  ".trim());
		
		System.out.println(myString1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
