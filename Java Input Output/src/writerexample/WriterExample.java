package writerexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		
		Writer writer = new FileWriter("writer.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String data = scanner.nextLine();
		
		bufferedWriter.write(data,3,4);
		System.out.println("Data is written");
		
		scanner.close();
		bufferedWriter.close();
		writer.close();

	}

}
