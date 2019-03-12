package yyy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionMap {

	public static void main(String[] args) {

		// Map map=new Hashtable();
		// Map map=new ConcurrentHashMap();
		//
		// map.put(40, "aa");
		// map.put(30, "bb");
		// map.put(20, "cc");
		//
		// System.out.println(map);

		Map map = new HashMap();

		map.put(40, "aa");
		map.put(30, "bb");
		map.put(20, "cc");

//		 System.out.println(map.values());

		// Set key=map.keySet();
		// System.out.println(key);

//		Collection value = map.values();
//		System.out.println(value);
		
		Set<Entry> entryset=map.entrySet();
		
		for(Entry x:entryset) {
			
			System.out.println(x);
			
			
		}

	}
}
