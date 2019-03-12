package xxx;

public class SuperClass1 extends AbstractClass {

	@Override
	void saving() {

		System.out.println("SavingRegular");
	}

	@Override
	void current() {

		System.out.println("Current");
	}

	@Override
	void salary() {

		System.out.println("Salary");
	}

	@Override
	void joint() {

		System.out.println("joint");
	}
	
	public void branchDetails() {
		
		System.out.println("bangalore");
	}
	
	public static void main(String[] args) {
		
		SuperClass1 info=new SuperClass1();
		info.branchDetails();
		
		
	}
	

}
