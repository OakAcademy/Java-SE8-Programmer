package copyingfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the file name:");
		String fileName = scanner.nextLine();
		
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\mehme\\Documents\\Java IO\\original.txt");
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\mehme\\Documents\\Java IO\\" + fileName + ".txt");
		
		int dataRead;
		
		System.out.println("The copying process has started...");
		
		do {
			
			dataRead = fileInputStream.read();
			if(dataRead != -1) {
				
				fileOutputStream.write(dataRead);
				
			}
			
		} while (dataRead != -1);
		
		System.out.println("Copying is complete.");
		
		fileInputStream.close();
		fileOutputStream.close();
		scanner.close();

	}

}
