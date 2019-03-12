package yyy;

import java.util.ArrayList;
import java.util.List;

public class JavaRemoveAll {

	public static void main(String[] args) {

		List li = new ArrayList();
		List li1 = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		System.out.println(li);

		li1.add(10);
		li1.add(20);
		li1.add(30);
		li1.add(40);
		li1.add(40);
		li1.add(100);
		li1.add(200);
		System.out.println(li1);

		li.removeAll(li1);
//		li.retainAll(li1);
		System.out.println(li);

	}
}
