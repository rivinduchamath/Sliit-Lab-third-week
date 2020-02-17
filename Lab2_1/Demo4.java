package Lab2_1;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length ");	;
        double length = scan.nextDouble();
        System.out.print("Enter width ");
        double width = scan.nextDouble();
        System.out.print("Enter height ");
        double height = scan.nextDouble();
        double volume = length * width * height;

        System.out.format("\n The Volume of a Cuboid = %.2f", volume);
	}
}
