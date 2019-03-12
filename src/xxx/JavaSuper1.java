package xxx;

public class JavaSuper1 extends JavaSuper {

	int a = 30;
	int b = 40;

	public void test3() {

		System.out.println(this.a);
		System.out.println(super.b);

	}

	public static void main(String[] args) {

		JavaSuper1 js1 = new JavaSuper1();

		js1.test3();
	}
}
