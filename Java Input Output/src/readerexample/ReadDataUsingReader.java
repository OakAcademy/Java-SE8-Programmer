package readerexample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadDataUsingReader {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a message: ");
		String message = inputScanner.nextLine();
		
		try {
			FileOutputStream fos = new FileOutputStream("message.txt");
			byte[] messageArray = message.getBytes();
			fos.write(messageArray);
			
			System.out.println("Data is written the file");
			
			Thread.sleep(500L);
			
			System.out.println("Data will read soon, please wait...");
			
			Thread.sleep(2000L);
			
			System.out.print("Data is reading...  ");
			
			Thread.sleep(500L);
			
			Reader myReader = new FileReader("message.txt");
			
			if(myReader.ready()) {
				
				int dataRead;
				
				do {
					
					dataRead = myReader.read();
					
					if(dataRead != -1) {
						
						System.out.print((char)dataRead);
						Thread.sleep(200L);
						
						
						
					}
					
				}while(dataRead != -1);
				
				fos.close();
				myReader.close();
				inputScanner.close();
				
			}
			
			System.out.println();
			System.out.println("The reading process is complete.");
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
