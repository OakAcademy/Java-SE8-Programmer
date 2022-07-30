package packagetest;

//built-in package
import java.util.Scanner;

//user-defined package
import packageoperation.*;

import otherpackageoperation.Add;

public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		Multiply multi = new Multiply();
		System.out.println("Result = " + multi.multiply(number1, number2));
		
		packageoperation.Add myAdd = new packageoperation.Add();
		System.out.println("Result = " + myAdd.add(number1, number2));
		
		//otherpackageoperation.Add

	}

}
