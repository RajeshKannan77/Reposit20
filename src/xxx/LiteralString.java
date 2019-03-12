package xxx;

public class LiteralString {

	public static void main(String[] args) {

		/* Literal String */

		String a = "Rajesh";
		String b = "Rajesh";

		// String a = "Rajesh";
		// String b = "Ramesh";
		//
		 System.out.println(System.identityHashCode(a));
		 System.out.println(System.identityHashCode(b));

		
		/* Non-Literal String */

		String x1 = new String("Rajesh");
		String x2 = new String("Rajesh");

		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));

	}

}
