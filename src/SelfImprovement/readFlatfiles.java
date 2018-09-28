package SelfImprovement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class readFlatfiles {

	
	 static String path = "C:\\Users\\khatanze\\eclipse-workspace\\SapientPrac\\inputRead.txt";
	
		public static List<Map<String,String>> getFileContents(String path){
		
			List<Map<String,String>> list = null;
		try {
			FileReader fis = new FileReader(new File(path));
			
			BufferedReader Br = new BufferedReader(fis);
			 list = new ArrayList<>();
			
			int line=0;int k=0, m=0;
			String[] colnames = null; String[] values = null;
			String rline = Br.readLine();
			while(rline!=null) {
				
				Map<String, String> filecontent = new LinkedHashMap<>();
			//	System.out.println(rline);
			if(line==0) {
				colnames = rline.trim().split("\\|");
			}else if(line>=1){
				
				values = rline.trim().split("\\|");
				k=0;
				m=0;
				while(k<colnames.length && m<values.length) {
					
					filecontent.put(colnames[k], values[m]);
					
					k++;
					m++;
				}
				list.add(filecontent);
			}
			 rline = Br.readLine();
			line++;
			
			}
			
			//System.out.println(list);			
			
			
		} catch ( FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch ( IOException I) {
			// TODO Auto-generated catch block
			I.printStackTrace();

			}
		return list;
		}
		
		public static void main(String[] args) throws IOException {
			
			
			
		}
		
	}
