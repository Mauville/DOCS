//OSCAR VARGAS PEREZ
//A01657110
//8/9/2018
//
//
//Given a non negative number "num", return true if num is within 2 of a multiple of 10
//or false otherwise
import java.util.Scanner;

class PRG11{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input first number");
		int num = scan.nextInt();
		if (num % 10 == 2 || num % 10 == 8){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}
			
