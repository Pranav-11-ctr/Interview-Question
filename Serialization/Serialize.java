package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



//serialization Example
public class Serialize {
	
	public static void main(String[] args)
	{
		//create a student object
		Student student=new Student("Pranav Kumar","pranav@gmail.com",22,"Madhubani");
		
		try {
			
			
			//write stream data into this file
			FileOutputStream fos=new FileOutputStream("file.txt");
			
			//first we use this object to change student object to stream object 
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			//use write object method to write in fos file
			oos.writeObject(student);
			
			oos.close();
			fos.close();
			
			System.out.println("Object State is transferred to File Object");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
