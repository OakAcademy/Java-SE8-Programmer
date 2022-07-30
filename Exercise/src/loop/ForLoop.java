package loop;

public class ForLoop {

	public static void main(String[] args) {
		
		//infinity loops
		for(;;) {
						
			try {
				System.out.println("java");
				Thread.sleep(500L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		/*
		int k = 0;
		
		for(int a = 1; a < 4; a++) {//3 times
			
			for(int b = 0; b <= 5; b++) {//6 times
				//18 times
				
				System.out.println("number of loops = " + ++k);
				
				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("--------------");
				
				
			}
			
		}
		
		
		
		
				
		
		for(int i=0; i<=10; i+=1) {
			
			System.out.println(i);
			
		}
		
		System.out.println("Last value of i = " + i);
		
		int sum = 0;
		for(int k = 0; k<6; k++) {
			
			sum += k;//sum = sum + k;
			System.out.println(k);
			
		}
		
		System.out.println("Sum of numbers = " + sum);
		
		
		int sum = 0;
		for(int k = 0; k <= 10; k +=2) {
			
			sum += k;//sum = sum + k;
			System.out.println(k);
			
		}
		
		System.out.println("Sum of even numbers = " + sum);
		
		
		for(int x=0, y=1; x<=5 && y<11; x++, y++) {
			
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			System.out.println("------------");
			
		}*/
		
		
	}

}
