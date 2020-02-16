package ex5;

public class Student extends Person {
   private	int id;
   private String name;
   private 	String address;

   public Student() {}
   
	public Student(int id,String name,String address) {
	this.id = id;
	this.name =name;
	this.address =address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDetails() {
		return "I am a Student.\r\n" + 
				"My name is Udaya.\r\n" + 
				"I am from Malabe.\r\n" + 
				"My dit no is DIT/11/C1/0010";
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
