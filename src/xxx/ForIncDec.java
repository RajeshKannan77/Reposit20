package xxx;

public class ForIncDec {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {

			for (int j = ++i; j <= 3; j++) {

				System.out.println("Value of I=" +i);
				System.out.println("Value of J=" +j);

			}
			
			System.out.println("Java");
		}
		
//		int i=2;
//		int j=i++;
//		System.out.println(j);
//		System.out.println(i);
//		int k=i++;
//		System.out.println(k);
//		System.out.println(i);
	}
}
