package serializationexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("cars.txt");
		
		ObjectInputStream objectStream = new ObjectInputStream(fis);
		
		Object carObject = objectStream.readObject();
		
		//System.out.println(carObject);
		
		for(Car car : (ArrayList<Car>)carObject) {
			
			System.out.println(car.toString());
			System.out.println("---------------------------");
			
		}
		
		objectStream.close();

	}

}
