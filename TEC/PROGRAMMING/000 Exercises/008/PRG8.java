//A man has collected a whole lot of 5, 2 and 1 value coins.
//He has to pay for the rest of his life with these.
//Make a program. Input should be a price. Output should be how many coins of each value he shall use.
import java.util.Scanner;

class PRG8{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Price:");
		int price = scan.nextInt();
		int fivecoins = price/5;
		System.out.println(fivecoins + "x(5) Coins");
		int fiveremainder = price%5;
		if (fiveremainder>0){
			int twocoins = fiveremainder/2;
			System.out.println(twocoins + " x(2) Coins");
			int tworemainder = fiveremainder%2;
			if (tworemainder > 0 ){
				System.out.println(tworemainder + " x(1) Coins");
		
			}
		}
	}
}
