// Converet to from C° to F°
// F=9/5 C+ 32
//
import java.util.Scanner;

class PRG6{

	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input temp in Celsius");
		double temp = scan.nextDouble();
		double converted = ((9*temp)/(5));
		converted += 36;
		System.out.println(converted + "F°");
	}

}
