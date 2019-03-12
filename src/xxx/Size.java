package xxx;

import java.util.ArrayList;
import java.util.List;

public class Size {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(40);

		// System.out.println(li.size());

		// for(int i=0;i<li.size();i++) {
		//
		// System.out.println(li.get(i));
		// }

		
		for(Integer k:li) {
			
			System.out.println(k);
			
		}
	}
}
