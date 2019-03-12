package xxx;

public class ImmutableString {

	public static void main(String[] args) {

		/* Immutable String */

		String a = "Rajesh";
		String b = "Kumar";

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

		a.concat(b);

		System.out.println(a);
		System.out.println(System.identityHashCode(a));

		/* Mutable String */

		StringBuffer x1 = new StringBuffer("Rajesh");
		StringBuffer x2 = new StringBuffer("Rajesh");

		System.out.println(System.identityHashCode(x1));
		System.out.println(System.identityHashCode(x2));

		x2.append(x1);

		System.out.println(x2);

		System.out.println(System.identityHashCode(x2));

	}

}
