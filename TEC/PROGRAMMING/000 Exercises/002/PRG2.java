/*#002 En MExico el IVA es del 16%. Programa que acepta precio, imprima impuesto y precio total de compra */
import java.util.Scanner;


public class PRG2 {
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		System.out.println(price * .16);
		System.out.println(price + price *.16);
	}	
}
