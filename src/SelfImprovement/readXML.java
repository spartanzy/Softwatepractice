package SelfImprovement;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;
public class readXML {
	
	static String path = "D:\\Tanzeel\\SeleniumPrac\\Input.xml";

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
				DocumentBuilderFactory DB = DocumentBuilderFactory.newInstance();
				
				DocumentBuilder DocBuild = DB.newDocumentBuilder();
				
				Document doc =DocBuild.parse(new File(path));
				doc.normalize();
				 System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				 
				 	NodeList ls = doc.getElementsByTagName("student");
				 	System.out.println(ls.getLength());
				 	
				 	for(int i=0; i<ls.getLength();i++) {
				 			
				 		Node nNode = ls.item(i);
				 		
				 		if(nNode.getNodeType()==nNode.ELEMENT_NODE) {
				 			
				 			Element element = (Element)nNode;
				 			System.out.println("roll num is " + element.getAttribute("rollno"));
				 			System.out.println("Subject is " + element.getAttribute("subject"));
				 			System.out.println("first name is --"+element.getElementsByTagName("firstname")
				 															.item(0).getTextContent());
				 			System.out.println("last name is --"+element.getElementsByTagName("lastname")
								.item(0).getTextContent());
				 			
				 		}
				 			
				 	}
				 
				Node s = doc.getElementsByTagName("marks").item(1);
				System.out.println(s.ELEMENT_NODE);
		System.out.println(s.getNodeName()+" value is "+ s.getTextContent());
	
				
		
		
	}

}
	