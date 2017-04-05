package utils;

import java.util.HashMap;

public class StringUtils {
	
	public static String clean(String s) {
		String new_s = s.trim();
		new_s = new_s.replaceAll(" +", " ");
		new_s = new_s.replace("\n", " ").replace("\r", "");
		return new_s;
	}
	
	public static String deepClean(String s) {
		String new_s = clean(s);
		new_s = new_s.replaceAll("[^a-zA-Z ]", "");
		
		return new_s;
	}
	
	public static String toString (HashMap<Object, Object> hashmap){
		String s  = "";
		Object[] keys = hashmap.keySet().toArray();
		for (int i = 0; i < keys.length; i++) {
			Object key = keys[i];
			Object val = hashmap.get(key);
			s = s + (key + ": " + val + ", ");
		}
		return s;
	}

}
