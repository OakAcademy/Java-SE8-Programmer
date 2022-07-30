package loop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		//number guessing game
		Random random = new Random();
		int randomNumber = random.nextInt(100);//min. number 0 - max. number 99
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		while(2 > 1) {
			
			int userGuess = input.nextInt();
			if(userGuess == randomNumber) {
				
				System.out.println("Congrats... You know the number in mind");
				//loop must terminate
				break;
				
			}else if(userGuess < randomNumber) {
				
				System.out.println("Increase your guess...");
				
			}else {
				System.out.println("Decrease your guess...");
			}
			
		}
		
		
		
		
		
		
		
		
		
		/*int i = 5;
		while(i > 1) {
			
			System.out.println(i);
			i--;
			
		}*/
		
		//Factorial --> 3! -> 3 * 2 * 1 = 6 5! -> 5*4*3*2*1 = 120
		
		/*int k = 1, fact = 1;
		while(k <= 5) {
			
			fact *= k; //fact = fact * k
			System.out.println(k + "! = " + fact);
			k++;
			
		}*/
		
		/*
		
		int a = 5;
		int b = 10;
		
		while(a < 4) {//condition is false
			
			//never evaluate
			a++;
			b--;
			
		}
		
		int c = a > b ? a-- : b++;
		
		System.out.println("a = " + a);//a=5
		System.out.println("b = " + b);//11
		System.out.println("c = " + c);//10*/
		
		/*
		while(false) {
			
			//unreachable code
			
		}*/
		
		//infinite loop, endless loop
		/*while(true) {
			//infinite loop
			
			
		}*/
		
		/*int d = 100;
		while(d == 100) {
			//infinite loop
			
			
		}*/
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
