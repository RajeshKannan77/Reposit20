package xxx;

public class JavaStatic {

	 protected static void test1() {
	
	 System.out.println("test1");
	 }
	
//	 public static void main(String[] args) {
//	
//	 test1();
//	 }

	// static int a = 10;
	// static int b = 20;

	// public static void test1() {
	//
	// // System.out.println(a);
	// System.out.println(b);
	// }
	//
	// public void test2() {
	//
	// System.out.println(a);
	// System.out.println(b);
	// }
	//
	// public static void main(String[] args) {
	//
	// JavaStatic js = new JavaStatic();
	//
	// js.test1();
	// js.test2();
	// }

	static protected int id = 10;

	public static void main(String[] args) {

		System.out.println(id);
	}

}
