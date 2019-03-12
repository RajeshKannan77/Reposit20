package xxx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class JavaMap {

	public static void main(String[] args) {

		Map<Integer, String> data = new HashMap<Integer, String>();
		// Map<Integer,String> data= new LinkedHashMap<Integer,String> ();
		// Map<Integer, String> data = new TreeMap<Integer, String>();
		// Map<Integer, String> data = new Hashtable<Integer, String>();
		// Map<Integer, String> data = new ConcurrentHashMap<Integer, String>();

		data.put(40, "Raj");
		data.put(40, "Sanjay");
		data.put(30, "Cyril");
		data.put(20, "Balu");
		data.put(10, "Anil");

		// System.out.println(data.get(40));
		// System.out.println(data.keySet());
		// System.out.println(data.values());
		
//		String s=data.get(40);
//		Collection<String> s=data.values();
		
		Set<Entry<Integer,String>> s=data.entrySet();
		
		for(Entry<Integer,String>k:s) {
			
			System.out.println(k.getKey());
			System.out.println(k.getValue());

		}
		
		

	}
}
