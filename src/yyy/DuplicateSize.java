package yyy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateSize {

	public static void main(String[] args) {

		List li = new ArrayList();
		Set se = new HashSet();

		li.add(10);
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(40);

		se.add(10);
		se.add(20);
		se.add(30);
		se.add(40);

		int size = li.size() - se.size();
		System.out.println(size);

	}
}
