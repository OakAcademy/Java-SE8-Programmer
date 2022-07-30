package readerexample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderExample {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("message.txt");
		LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
		
		String data;
		int lineNumber;
		
		do {
			
			data = lineNumberReader.readLine();
			if(data != null) {
				
				lineNumber = lineNumberReader.getLineNumber();
				System.out.println("Line " + lineNumber + ": " + data);
				
			}
			
		} while (data != null);
		
		fileReader.close();
		lineNumberReader.close();

	}

}
