package sapient_scrn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sortGroupofAnagrams {
	
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for(String str: strs){
		char[] arr = new char[26];
		for(int i=0; i<str.length(); i++){
		arr[str.charAt(i)-'a']++;
		
		}
		String ns = new String(arr);
		if(map.containsKey(ns)){
		map.get(ns).add(str);
		}else{
		ArrayList<String> al = new ArrayList<String>();
		al.add(str);
		map.put(ns, al);
		}
		}
		result.addAll(map.values());
		return result;
		}

	public static void main(String[] args) {
		
		String sen10s = "cat mat god act atm dog tac tam ogd";		//List<Set<Character>> matches = new ArrayList<>();
		
	
		
		String [] words = sen10s.split(" ");		
		System.out.println(sortGroupofAnagrams.groupAnagrams(words));
//		for(int i = 0; i<words.length;i++) {			
//			
//			char[] chars = words[i].toCharArray();		
//			
//			Set<Character> group = new HashSet<>();
//				for(char d: chars) {					
//					group.add(d);
//				}
//						
//		}
//		System.out.println(matches);
		
		
	}

}
