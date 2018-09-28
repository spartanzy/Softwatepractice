package Serializationprac;
import java.io.*;
public class readFileObj {

	public static void main(String[] args) {
		
		
		try(FileInputStream FIS = new FileInputStream("obj.bin")){
			
			ObjectInputStream OI = new ObjectInputStream(FIS);
			
			Person p1 = (Person)OI.readObject();
			Person p2 = (Person)OI.readObject();
			
			System.out.println(p1+"\n"+p2);
			
			OI.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
