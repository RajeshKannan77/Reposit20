package xxx;

public class ConstructorThis {

	public ConstructorThis() {

		this(10);
		System.out.println("First Constructor");
	}

	public ConstructorThis(int a) {

		this(20, "Raj");
		System.out.println("Second Constructor");
		System.out.println(a);
	}

	public ConstructorThis(int a, String b) {

		System.out.println("Final Constructor");
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {

		ConstructorThis ct = new ConstructorThis();
	}
}
