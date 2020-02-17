package Lab2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter length "); 
        String length = scan.readLine();
        System.out.print("Enter width ");
        String width = scan.readLine();
        System.out.print("Enter height ");
        String height = scan.readLine();
        double l = Double.parseDouble(length);
        double w = Double.parseDouble(height);
        double h = Double.parseDouble(width);
        double volume = l * w * h;

        System.out.format("\n The Volume of a Cuboid = %.2f", volume);
	}
}
