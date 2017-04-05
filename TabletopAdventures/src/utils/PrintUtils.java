package utils;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class PrintUtils {
	
//	public static void print (HashMap<String, String> hashmap){
//		BiConsumer<String, String> biConsumer = (x, y) -> {
//		      System.out.println(x + ": " + y + ",");
//		    };
//		hashmap.forEach(biConsumer);
//	}
	
	public static void print (HashMap<Object, Object> hashmap){
		BiConsumer<Object, Object> biConsumer = (x, y) -> {
		      System.out.println(x + ": " + y + ",");
		    };
		hashmap.forEach(biConsumer);
	}

}
