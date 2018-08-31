/*Author OSCAR VARGAS PEREZ
 * MATRICULA A01657110
 * DATE 28/8/18
 *
/* A roadrunner runs at 57 km7h  
 * Program that determines the distance the traveled by it on a given time in minutes by user.
 * */
/* 
 * converto to minutes
 * ask for time
 * obtain amount 
 * print
 *
 */
import java.util.Scanner;

class PRG2{

	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input time in minutes");
		float time = scan.nextFloat();
		float hourtime = time / 60; //456 min -> 7.6 hrs
	       	float distance = hourtime * 57;//7.6 hrs * 5¿
		System.out.print(distance + " km will be traveled");
		}
}


