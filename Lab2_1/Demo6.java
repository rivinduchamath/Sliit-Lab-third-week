package Lab2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo6 {

	public static void main(String[] args) throws IOException {
	
		Demo d =	new Demo(); 
		boolean b= d.findEvenOrOdd(32);
	 
	      System.out.println(b ? "This is Even Number" : "This is Odd Number");
	}
}
 class Demo{

	public boolean findEvenOrOdd(int i) {
		if(i % 2 == 0) 
			return true;
		return false;
	}
 }
