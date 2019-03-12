package xxx;

import java.util.ArrayList;
import java.util.List;

public class AddAll {

	public static void main(String[] args) {

		List li = new ArrayList();
		List li1 = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		li1.addAll(li);
		li1.add(40);
		li1.add(50);
		li1.add(60);
		li1.retainAll(li);
		
		System.out.println(li1);
	
		
	}
}
