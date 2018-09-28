package SelfImprovement;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.*;
import java.io.*;
import java.util.*;

public class Readxmlcontentsascollections {

	public static void main(String[] args) {

		
	}
		static String path = "D:\\Tanzeel\\SeleniumPrac\\Input.xml";
		
		public static List<Map<String,String>> getXMLContents(String path){
		List<Map<String,String>> Classes = new ArrayList<>();
		
	try {
		 DocumentBuilderFactory DBF = DocumentBuilderFactory.newInstance();
		
		 DocumentBuilder DB=	DBF.newDocumentBuilder();
		 		Document Doc=	DB.parse(new File(path));
		 Doc.getDocumentElement().normalize();
		 
		 NodeList ls =Doc.getElementsByTagName("student");
		 
		 int rows = ls.getLength();
			 for(int i=0; i<rows; i++) {
				
				 Node col = ls.item(i);
				 if(col.getNodeType()==col.ELEMENT_NODE) {
					 Map<String,String> s1 = new LinkedHashMap<>();
					 Element element = (Element)col;
					 NodeList childs = element.getChildNodes();
					 	int	vals = childs.getLength();
					 //	System.out.println(vals);
					 if(vals>1) {
						 for(int j=0; j<vals; j++) {
							 
							 
							 String colname = childs.item(j).getNodeName();
							 String colvalue = childs.item(j).getTextContent();
							 s1.put(colname, colvalue);
							
						 }
					 }
					 Classes.add(s1);
					
				 }
				 
			 }
		 
		//	 System.out.println(Classes);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return Classes;
	}

}
