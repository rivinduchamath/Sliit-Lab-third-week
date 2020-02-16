package ex3;

public class Test {

	public static void main(String ...args) {
		Student st1 = new Student(1,"Namal","galla");
		Student st2 = new Student(2,"Amal","Mathara");
	 
		st1.setAddress("Galle");
		st2.setAddress("Mathara");
		st1.setName("Amal");
		st2.setName("Kamal");
		st1.setId(1);
		st2.setId(2);
        
	
	    System.out.println(st1.getId() +" " + st1.getName() +" " +st1.getAddress());
	    System.out.println(st2.getId() +" " + st2.getName() +" " +st2.getAddress());
	}
}
