package Lab2_1;

import ex9.Cat;
import ex9.Pet;

/**
 * @author User
 *
 */
public class Demo1 {

public static void main(String[] args) {
	int miles = 26,yards = 385;
	double kilometers;
	
	kilometers = 26 * 1.609;
	kilometers += (385 / 1760.0)* 1.609;
	System.out.println(kilometers);
	
}
}
