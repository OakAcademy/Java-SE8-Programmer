package serializationexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Car> carList = new ArrayList<>();
		
		carList.add(new Car("Ferrari", "Red", 2020, false, 350));
		carList.add(new Car("Mercedes", "Black", 2021, false, 300));
		carList.add(new Car("BMW", "Blue", 2022, true, 250));
		
		FileOutputStream fos = new FileOutputStream("cars.txt");
		
		ObjectOutputStream objectStream = new ObjectOutputStream(fos);
		
		objectStream.writeObject(carList);
		
		System.out.println("The cars are written...");
		
		objectStream.close();

	}

}
