package sapient_scrn;

import java.util.HashMap;
import java.util.Map;

public class RemoveRepeatedChar {

	public static String revomeDup(String firstinput, String SecondInput) {
		char word1[] = SecondInput.toCharArray();
//char word2 []=  SecondInput.toCharArray();
		StringBuffer br = new StringBuffer();
		Map<Character, Integer> test = new HashMap<>();
		for (char d : word1) {
			test.put(d, 1);
		}
		for (int i = 0; i < firstinput.length(); i++) {
			if (test.containsKey(firstinput.charAt(i))) {
				continue;
			}
			br = br.append(firstinput.charAt(i));
		}
		//System.out.println(br.toString());
		return br.toString();
	}

	public static void main(String[] args) {

		System.out.println(revomeDup("geekforgeeks", "masktotak"));

	}

}
