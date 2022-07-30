package inputstreamexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadData {

	public static void main(String[] args) {
		
		int dataRead;
		
		try {
			InputStream myInputStream = new FileInputStream("test.txt");
			int length = myInputStream.available();
			System.out.println("Estimated bytes in the file: " + length);
			
			byte[] dataList = new byte[length];
			
			System.out.print("The data is reading...  ");
			
			myInputStream.read(dataList);
			
			for(int offset = 0; offset < length; offset++) {
				
				String dataString = new String(dataList,offset,1);
				
				System.out.print(dataString);
				
				Thread.sleep(300);
				
			}
			
			
			
			
			/*
			System.out.print("The data is reading...  ");
			
			do {
				
				dataRead = myInputStream.read();
				
				if(dataRead != -1) {
					
					char letterRead = (char) dataRead;
					String data = String.valueOf(letterRead);
					System.out.print(data);
					
					Thread.sleep(300);
					
				}
				
			}while(dataRead != -1);*/
			
			System.out.println();
			System.out.println("The reading process is complete.");
			
			myInputStream.close();
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
