package ex1;

public class Test {

	public static void main(String ...args) {
		Student st1 = new Student();
		Student st2 = new Student();
	 
		st1.id =1;
		st1.address = "galle";
	    st1.name = "Kamal";


		st2.id =2;
		st2.address = "galle";
	    st2.name = "Namal";
	
	    System.out.println(st1.id +" " + st1.name +" " +st1.address);
	    System.out.println(st2.id +" " + st2.name +" " +st2.address);
	}
}
