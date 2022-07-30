package myaccesspackage;

public class Car {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.myPublicMethod();
		myCar.myProtectedMethod();
		myCar.myDefaultMethod();
		myCar.myPrivateMethod();

	}
	
	public void myPublicMethod() {
		System.out.println("This is the public modifier");
	}
	
	protected void myProtectedMethod() {
		System.out.println("This is the protected modifier");
	}
	
	void myDefaultMethod() {
		System.out.println("This is the default modifier");
	}
	
	private void myPrivateMethod() {
		System.out.println("This is the private modifier");
	}

}
