package xxx;

import java.util.ArrayList;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		
		List li = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(40);
		
		System.out.println(li.contains(100));

	}
}
