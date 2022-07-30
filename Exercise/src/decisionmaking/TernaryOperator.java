package decisionmaking;

public class TernaryOperator {

	public static void main(String[] args) {

		int a = 20;
		int result;
		
//		if(a > 10) {
//			result = a/5;//4
//		}else {
//			result = a/4;
//		}
		
		result = a<10 ? a/5 : a/4;
		
		System.out.println("Result = " + result);
		
		int x = 6;
		int y = 5;
		
		int z = x == y ? x-- : y--;
		
		System.out.println("x = " + x);//x = 6
		System.out.println("y = " + y);//y = 4
		System.out.println("z = " + z);//z = 5
		
	}

}
