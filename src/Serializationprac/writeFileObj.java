package Serializationprac;

import java.io.*;
public class writeFileObj {

	public static void main(String[] args) {


		Person Tanz = new Person(14, "Tanz", "SDET");
		Person Chris = new Person(14, "Chris", "BA");
		
		
		try(FileOutputStream FOS = new FileOutputStream("obj.bin")){
			
			ObjectOutputStream OOS = new ObjectOutputStream(FOS); 
			
			OOS.writeObject(Tanz);
			OOS.writeObject(Chris);
			
			OOS.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
