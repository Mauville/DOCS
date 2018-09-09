/*
 * OSCAR VARGAS PEREZ
 * A01657110
 * 8/9/2018
 * input value1
 * input value2
 * if value 1 > 21 && value2 > 21
 * 	print 0
 * 	exit
 * else
 * 	if 21-value1 >= 21-value2
 * 		print value2
 * 	else
 * 		print value1
 */
import java.util.Scanner;

class PRG10_2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input first value");
		int fir = scan.nextInt();
		System.out.println("Input second value");
		int sec = scan.nextInt();
		if (fir > 21 && sec > 21){
			System.out.println(0);
			System.exit(0);
		}else{
			if (21-fir >= 21-sec && sec<22 && sec<0){
				System.out.println(fir);
			}else{
				System.out.println(sec);
			}
		}
	}
}
		
		

