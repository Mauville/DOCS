//Antesdelaño2000,undía,unprofesormedijo:“Hoycumplolaedaddelañoenquenací”.Realiza un programa que resuelva este acertijo según un año ingresado por elusuario.	
//
import java.util.Scanner;

public class PRG5{

	public static void main(String [] args){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input year");
		String year = scan.nextLine();
		System.out.println("Your age is: " + year.charAt(2) + year.charAt(3) );

	}

}
 
