package sapient_scrn;

public class countOfChars {
	
	
	//imperative approach 
	
	public static int count(String s, char c) {
		int count =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

	//////
	public static void main(String[] args) {
		
		String s = "SSSSSTTPPQ";
		
		
		//imperative method call
		
		String newWord = "";
		for(int i=0; i<s.length(); i++) {
			
			if(newWord.indexOf(s.charAt(i))<0) {
				newWord=newWord+s.charAt(i)+countOfChars.count(s, s.charAt(i));
			}			
		}		
		System.out.println(newWord);
		
////////////////---- 2 nd approach 		
		//using Java 8 approach
		StringBuilder sb= new StringBuilder();
		
		for (char c: s.toCharArray()) {
			
			if(sb.toString().indexOf(c)<0) {
			long count = s.chars().filter(ch -> ch == c).count();
			
			sb=sb.append(c).append(count);
			}
		}
		System.out.println(sb);
		
		
		
		
		

	}

}
