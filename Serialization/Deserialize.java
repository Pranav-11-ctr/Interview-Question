package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


//Deserialization Example
public class DeSerialize {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("file.txt");
			
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student student=(Student)ois.readObject();
			student.displayName();
			System.out.println(student.getName()+" "+student.getAddress());
			System.out.println(student.getEmail());//this will give null because of transient specifier
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
