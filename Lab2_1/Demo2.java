package Lab2_1;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name ");	;
        String name = scan.nextLine();
        System.out.print("Enter Id ");
	    String id = scan.nextLine();
        System.out.print("Enter District ");
        String district = scan.nextLine();

	System.out.println("DitNo :"+id +"\r\n" + 
			"Name : "+name+"\r\n" + 
			"District : "+district);
	}
}
