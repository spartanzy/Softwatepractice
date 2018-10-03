package sapient_scrn;

public class distancebetweentwostrings {

	public static void main(String[] args) {
		
		
		String s ="bac, cad, mad, dag, bad, lam, abcc";
		
		String s1 = "cad";
		
		String s2 = "abcc";
	
		
		String r = "the, ABC, the, DEF, ABCD";
		
		String r2="ABC" ,  r1 = "ABCD";
		
		distanceOfTwoWords(r , r1, r2);
		distanceOfTwoWords(s , s1, s2);
		
		String p = "abhhhyjnnbcyuioll";
		String p1 ="h";
		String p2 = "y";
		distanceOfTwoWords(p , p1, p2);
	}
	
	public static int distanceOfTwoWords(String s, String s1, String s2) {
		int d1 = s.indexOf(s1);
		int d2 =s.indexOf(s2);
		int midofd1 = s1.length()/2;
		int midofd2 = s2.length()/2;
		System.out.println(d1 +" and "+d2 );
		System.out.println(midofd1 +" and "+midofd2 );
		int dist = Math.abs((d2+midofd2)-(d1+midofd1));
		System.out.println("the distance b/w these two words is = " + dist);
		
		return dist;
		}

}
