package xxx;

public class OddEvenSum {

	public static void oddSum() {

		int count = 0;
		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 0) {

				count = count + i;
			}
		}
		System.out.println("Odd Count " + count);

	}

	public static void evenSum() {

		int count = 0;
		for (int i = 0; i <= 10; i++) {

			if (i % 2 == 1) {

				count = count + i;
			}
		}
		System.out.println("Even Count " + count);
	}

	public static void main(String[] args) {

		oddSum();
		System.out.println("\n");
		evenSum();
		
	}
}
