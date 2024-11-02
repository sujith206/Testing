package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicatewords {
public static void main(String[] args) {
	
	 String s = "Today is holiday and tommorrow is holiday";
	 s = s.toLowerCase();
	 String[] words = s.split("\\s+");
	 HashMap<String, Integer> words_map = new HashMap<String, Integer>();
	 
	 for (String key: words) {
		 
		 if(words_map.get(key)!=null) {
			 words_map.put(key, words_map.get(key)+1);
		 }else {
			 words_map.put(key, 1);
		 }
		 
	 }
	 
	 Set<String> keys = words_map.keySet();
	 for(String key:keys) {
		 if(words_map.get(key)>1) {
			 System.out.println(key);
		 }
	 }
}
}
