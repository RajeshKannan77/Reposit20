package xxx;

public class JavaSuper {

	int a = 10;
	int b = 20;

	public void test1() {

		System.out.println(a);
	}

	public void test2() {

		System.out.println(a);
	}

	public static void main(String[] args) {

		JavaSuper js = new JavaSuper();

		js.test2();
	}
}
