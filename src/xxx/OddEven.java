package xxx;

public class OddEven {

	public static void evenNum() {

		for (int i = 0; i <= 8; i++) {

			if (i % 2 == 0) {

				System.out.println("EVEN NUM " + i);
			}
		}
	}

	public static void oddNum() {

		for (int i = 0; i <= 8; i++) {

			if (i % 2 == 1) {

				System.out.println("ODD NUM " + i);
			}
		}
	}

	public static void main(String[] args) {

		oddNum();
		System.out.println("\n");
		evenNum();

	}
}
