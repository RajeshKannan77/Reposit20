package xxx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaList {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList();
//		List<Integer> li=new LinkedList();
//		List<Integer> li=new Vector();

		// li.add(10);
		// li.add(10);
		// li.add('a');
		// li.add("add");
		// li.add(10.10f);

		li.add(50);
		li.add(20);
		li.add(10);
		li.add(40);
		li.add(40);

		System.out.println(li);
	}

}
