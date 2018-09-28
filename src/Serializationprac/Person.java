package Serializationprac;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = -9119922176150626293L;

	int id;
	
	String name;
	
	String profession;

	public Person(int id, String name, String profession) {
		
		this.id = id;
		this.name = name;
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + ", profession=" + profession + "]";
	}
	
	
	
	
	
	

}
