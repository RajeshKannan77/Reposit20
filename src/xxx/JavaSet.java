package xxx;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class JavaSet {

	public static void main(String[] args) {

		List li = new ArrayList();
//		Set<Integer> se = new HashSet();
		 LinkedHashSet se = new LinkedHashSet();
		// TreeSet se = new TreeSet();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(20);
		li.add(10);
		se.addAll(li);
		li.add(10);
		System.out.println(li);
		System.out.println(se);

		int i=li.size()-se.size();
		System.out.println(i);
		// se.remove(30);

//		System.out.println(se);

		// for(int k:se) {
		//
		// System.out.println(k);
		// }

	}
}
