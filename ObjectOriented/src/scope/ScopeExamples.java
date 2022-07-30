package scope;

public class ScopeExamples {

	static String name = "David";

	public static void main(String[] args) {

		name = "Ronaldo";

		int age = 20;

		{

			// name --> can access
			// age --> can access

			int age2 = 30;

			{

				{

					int age3 = 40;
				}
			}
		}
		// we can access name, age, age2

		int age2 = 35;

	}

	// age --> can not access

	// method
	public static void myScope() {

		// name --> we can access
		// age --> can not access

	}

}
