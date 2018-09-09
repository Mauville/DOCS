/*
 *
 OSCAR VARGAS PEREZ
 A01657110 *
 08/09/2018
 *
 *
 *
 build ladder for a factory
 two sizes
 big == 5
 small == 1
 find program that if given an amount of pieces and desired size outputs possibility

 input big
 input small
 input size

 bignumbered = big * 5
 smallnumbered = small

 if bignumbered + smallnumbered > size
 	print true
 else
	print false 
 */
import java.util.Scanner;

public class PRG10{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Input big ladder amount");
		int big = scan.nextInt();
		System.out.println("Input small ladder amount");
		int small = scan.nextInt();
		System.out.println("Input desired ladder size");
		int size = scan.nextInt();
		int bignumbered = big * 5;
		int smallnumbered = small;
		if (bignumbered + smallnumbered > size){
			System.out.println(true);
		}else{
			System.out.println(false);
		
		}

	}

}
