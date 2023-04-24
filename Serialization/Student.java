package serialization;

import java.io.Serializable;

//if we don't use Serializable marker interface then this student class can't convert into Stream object and 
//it will give below exception
//java.io.NotSerializableException: serialization.Student
public class Student implements Serializable {
	
	private String name;
	
	//if we use transient then attribute will not save into file or db or etc
	transient private String email;
	private int age;
	private String address;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String email, int age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void displayName()
	{
		System.out.println("Hii my name is "+this.name);
	}
	
	

}
