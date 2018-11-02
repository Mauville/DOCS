// From liters to cubic inches
//
// in³ = L * 61.024

import java.util.Scanner;

public class PRG6 {

	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Input amount in liters");
		double liters = scan.nextDouble();
		System.out.println("Converted to in³");
		System.out.println(liters * 61.024);

		
	}
}
