package sapient_scrn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class longestUniqchars {

	
	public static void main(String[] args) {

		String s = "aaabdasddlkjhgtyyhhjjaa";

		// System.out.println(lengthOfLongestSubstring(s));

		int uni = 0;
		String largest = "";
		Map<Character, Integer> map = new LinkedHashMap<>();
		int len = s.length();
		for (int i = 0; i < len; i++) {

			char c = s.charAt(i);

			if (!(map.containsKey(c))) {

				map.put(c, i);

				if (map.size() > uni) {

					uni = map.size();
					largest = map.keySet().toString();
				}
			} else {

				i = map.get(c);
				map.clear();
			}

		}
		System.out.println("longest substring is "+ largest);
	}

}
