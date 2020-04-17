package week3.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Learnmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> mp = new HashMap<String, String>();
		 
		
		// add entry ( key and value)--put
		
		mp.put("AC001", "babu");
		mp.put("AC002", "gopi");
		mp.put("AC003", "sarath");
		mp.put("AC004", "balaji");
		
		
		for (Entry<String,String> eachItem : mp.entrySet()) {
			System.out.println(eachItem);
		}
		
		for (Entry<String,String> eachItem : mp.entrySet()) {
			System.out.println(eachItem.getKey());
		}
		for (Entry<String,String> eachItem : mp.entrySet()) {
			System.out.println(eachItem.getValue());
		}
		
	/*	// count size()
		System.out.println(mp.size());
		
		// pick value from map---> get(key)
		
		String value = mp.get("AC003");
		System.out.println(value);
		
		
		// remove the entry
		mp.remove("AC002");
		System.out.println(mp.size());
		
		//validation
		System.out.println(mp.containsKey("AC001"));
		System.out.println(mp.containsValue("balaji"));
		
		
		// remove all the entries
		mp.clear();
		
		//validating the entries available or not
		System.out.println(mp.isEmpty());
		
		//Map<String,Integer>*/
		
	}

}
