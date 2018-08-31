//Records store
//has a promotion
//if buying 2 articles, only the most expensive is paid for
//if one, 35% discount
//if movie, only 10%

import java.util.Scanner;

class PRG8{

	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number of articles");
		int artnum = scan.nextInt();

		if (artnum==1){
			System.out.println("Please input article price");
			double artprice = scan.nextDouble();
			System.out.println("Is the article a movie? Y/N");
			String ans = scan.next();

			if (ans.equals("y")){
				System.out.println("Your total price is: " +( artprice - artprice*.10));

			}else{
			System.out.println("Your total price is: " + (artprice-artprice*.35));
			}
		}

		if (artnum>1){

				System.out.println("Please input article price");
				double price = scan.nextDouble();
				System.out.println("Please input article price");
				double price2 = scan.nextDouble();
				if (price > price2){
					System.out.println("You should pay:" + price );
				}else{
					System.out.println("You should pay:" + price2 );
				}


			/*while(True){

				System.out.println("Another item? Y/N");
				answer = scan.nextString();
				if (answer == "Y"){
					
					continue

				}else {
					totalprice += price;
					break
				}*/

			}
			

	}
}
