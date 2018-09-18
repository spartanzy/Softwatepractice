package SelfImprovement;

import java.util.*;
import java.util.Map.Entry;


public class nestedCollections {

	public static void main(String[] args) {


		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List<Integer> l2 = new ArrayList<>();
		
		l2.add(40);
		l2.add(50);
		l2.add(60);
		
		Map<Integer, List<Integer> > m1 = new LinkedHashMap<>();
		
		m1.put(1, l1);
		m1.put(2, l2);
		
//		for(Entry<Integer, List<Integer>> l : m1.entrySet()) {
//			
//			System.out.println("key of m1 is --"+l.getKey()+" and value is "+l.getValue());
//			
//		}
		
		Set<Entry<Integer, List<Integer>>> I1= m1.entrySet();
	}

}
