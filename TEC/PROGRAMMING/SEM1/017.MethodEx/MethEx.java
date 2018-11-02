// Sum of all digits of an int
import java.util.Scanner;


public class MethEx{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Number: ");
		String strint = sc.nextLine();
		System.out.println("Addition: ");
		System.out.println(charadd(strint));
		
	}

	public static int charadd(String number){
		int length = number.length()-1;
		int sum = 0;
		for(int i = length; i >= 0; i--){
			char charresult = number.charAt(i);
			int intresult = charresult - '0';
		        sum += intresult;	
		}
		return sum;
	}

		

}


