//Realiza	 un	 programa	 que	 decida	 si	 un	 año	 es	 bisiesto	 o	 no	 lo	 es.	 Un	 año	 es	 bisiesto	 si	 éste	 s	  múltiplo	  de	  cuatro.	  Sin	  embargo,	  los	  años	  múltiplos	  de	  100	  sólo	  son	  bisiestos	  si	  a	 ambién	 son	 múltiplos	 de 400	 (por	 ejemplo,	 1800	 no	 es	 bisiesto	 mientras	 2000	 sí	 lo	es)	 
//
//get year
//if year % 100 == 0 && year % 400 == 0
//	print bisiesto
//if year % 4 == 0 && year % 100 != 0
//	print bisiesto
//
import java.util.Scanner;

public class PRG50 {

	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a year");
		int year = scan.nextInt();
		String leap = "Not Leap";

		if ( year % 100 == 0 && year % 400 == 0){
			       leap = "Leap";
		}
		if (  year % 100 == 0 && year % 400 == 0){
			       leap = "Leap";
		}	
		System.out.println(leap);


	}
}

