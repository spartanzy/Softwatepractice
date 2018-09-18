package sapient_scrn;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstUniqCharinString {
	
	
	 public static Character firstUniqChar(String s) {
		 if (s.length() == 0) {
		        System.out.println("Fail");
		       return 0;
		    } else {
		        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

		        for (int i = 0; i < s.length(); i++) {
		            if (m.containsKey(s.charAt(i))) {
		                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
		            } else {
		                m.put(s.charAt(i), 1);
		            }
		        }
		        for (Map.Entry<Character, Integer> hm : m.entrySet()) {
		            if (hm.getValue() == 1) {
		                return hm.getKey();
		            }
		        }
		    }
		    return 0;
	    }

	public static void main(String args[]) {
	       
	       String test = "blabllablasdad";
	      
	       System.out.println(firstUniqCharinString.firstUniqChar(test));
	       
	       
	    }

}
