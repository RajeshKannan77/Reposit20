package xxx;

public class JavaConstructor {

	public JavaConstructor() {

		System.out.println("JavaConstructor1");

	}

	public JavaConstructor(int a) {

		System.out.println("JavaConstructor2");
	}

	public JavaConstructor(int a, String b) {

		System.out.println("JavaConstructor3");
	}
	// public void getId() {
	//
	// System.out.println("25");
	// }

	public static void main(String[] args) {

		JavaConstructor jc1 = new JavaConstructor();
		JavaConstructor jc2 = new JavaConstructor(10);
		JavaConstructor jc3 = new JavaConstructor(10,"raj");

	}
}
