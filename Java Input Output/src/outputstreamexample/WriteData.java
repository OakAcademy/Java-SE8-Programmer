package outputstreamexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteData {
	
	public static final String FILE_NAME = "test.txt";

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a text: ");
		String data = inputScanner.nextLine();
		
		try {
			OutputStream myOutputStream = new FileOutputStream(FILE_NAME);
			byte[] dataByte = data.getBytes();
			//myOutputStream.write(dataByte,3,4);
			
			myOutputStream.write(dataByte);
			
			System.out.println("Data is written into the file");
			
			//flush()
			myOutputStream.close();
			inputScanner.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
