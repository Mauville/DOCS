/*
 create program that receives two ints. Print whichever is nearest to 21 and if busting, print 0

 input first
 input second

 if first + second >21
 	print o
if first > second ? print first : print second
   */
import java.util.Scanner;

public class PRG10_1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first int");
		int first = scan.nextInt();
		System.out.println("Input second int");
		int second = scan.nextInt();
		if (first + second > 21){
			System.out.println(0);
			System.exit(0);
		}
		if (first > second) {
			System.out.println(first);
		}else{
			System.out.println(first);
		}


	}
}
