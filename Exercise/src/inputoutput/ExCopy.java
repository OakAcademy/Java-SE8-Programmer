package inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExCopy {

	public static void main(String[] args) throws IOException {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter the file name:");
		String fileName = inputScanner.nextLine();
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\mehme\\Documents\\Java IO\\original.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\mehme\\Documents\\Java IO\\" + fileName + ".txt");
		
		int data;
		
		System.out.println("The copying process has started...");
		
		do {
			
			data = fileInputStream.read();
			if(data != -1) {
				
				fileOutputStream.write(data);
				
			}
			
		} while (data != -1);
		
		System.out.println("Copying is complete.");
		
		fileInputStream.close();
		fileOutputStream.close();
		inputScanner.close();

	}

}
