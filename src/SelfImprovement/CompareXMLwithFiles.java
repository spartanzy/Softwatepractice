package SelfImprovement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompareXMLwithFiles {

	public static void main(String[] args) {


		
		String path1= "C:\\Users\\khatanze\\eclipse-workspace\\SapientPrac\\inputRead.txt";
		String  path2 = "D:\\Tanzeel\\SeleniumPrac\\Input.xml";
		
		List<Map<String,String>> l1 = readFlatfiles.getFileContents(path1);
		List<Map<String,String>> l2 = Readxmlcontentsascollections.getXMLContents(path2);
		
		
		System.out.println(l1+"\n");
		System.out.println("and the contents in  xmls");
		System.out.println(l2);
		
		int i=0,j=0;
		
		while(i<l1.size() && j< l2.size()) {
			
			
		}
		
	}
	
}
