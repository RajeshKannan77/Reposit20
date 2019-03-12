package xxx;

public class MethodOverloading {

	public void empId(int a) {

		System.out.println(a);

	}

	public void empName(String b) {

		System.out.println(b);

	}

	public void empExamReport(int c, char d) {

		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {

		MethodOverloading method = new MethodOverloading();
		method.empId(2);
		System.out.println("\n");
		method.empName("Rajesh");
		System.out.println("\n");
		method.empExamReport(83, 'A');
	}
}
