package readerexample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("message.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String data;
		
		do {
			
			data = bufferedReader.readLine();
			if(data != null) {
				
				System.out.println(data);
				
			}
			
		} while (data != null);
		
		fileReader.close();
		bufferedReader.close();

	}

}
