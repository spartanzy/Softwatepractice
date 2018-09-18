package sapient_scrn;

import java.util.ArrayList;

public class Pangram {
	
	
	
	public static ArrayList<String> missingchar(String s) {
		
		s= s.toLowerCase();
		ArrayList<String> Al = new ArrayList<>();
		 for(int i=97; i<=122; i++){
	            
	           if(!s.contains(Character.toString((char)i))) {
	        	
	        	   System.out.print(Character.toString((char)i));
	        	  
	        	   Al.add(Character.toString((char)i));
	           }
	            
	        }
		 return Al;
	}

	public static void main(String[] args) {
		
		
		 String s = "welcome to geeksforgeeks";
		 
		 System.out.println(Pangram.missingchar(s));
	        
	        s= s.toLowerCase();
	        
	        
	        
	        for(int i=97; i<=122; i++){
	            
	           if(!s.contains(Character.toString((char)i))) {
	        	
	        	   System.out.print(Character.toString((char)i));
	           }
	            
	        }
		
	}

}
