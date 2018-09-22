// https://en.wikipedia.org/wiki/Box-drawing_character
// https://en.wikipedia.org/wiki/Playing_cards_in_Unicode
// 🂡
//Game starts when you sit down
//
//Bets are placed
//
//Dealer deals two card to everyone face up.
//He gets one up one down
//
//decision
//
//stay/stand
//
//hit again
//
//surrender
//
//double down
//
//split
//
//Dealer must draw till 16 and stand on all 17s
//
//The player that surpasses the dealer wins.
//
//
/*


 funds = 500

 sit down = input Please sit down

 while True 
	 	funds - fee
	 	player.getcard (2,1)
		dealer.getcard (2,0)
	 	if playertotal == 21
	 		print Blackjack! Bet is doubled
			 money.payout(bet,funds)
	 		continue
		bet = input Please input bet
		money.bet(bet, funds)

		while True && endgame = False
	
	 	print options
			Stay
			Hit
			Double bet
			Surrender
			Stop playing

	 	if option == hit
	 		player.getcard(1,1)
			if playertotal < 21
				continue
			else
				print You went over 21.
				endgame == True

		if option == doublebet
			money.bet(bet, funds)
			continue
		if option == Stay
			dealer.getcard.replacefacedown(1,1,1)
			while dealertotal < 17
				dealer.getcard(1,1)
			if dealertotal > 21
				print You win!
				money.payout(bet)
				endgame=True
			else 
				if playertotal < dealertotal
					print You lose.
					endgame==True
				else 
					print You Win!
					money.payout(bet)
					endgame == true

		if option == surrender

			endgame = True
		if option == quit || end

			system.quit

class money

	def payout(bet, funds, multiplier)
		newfunds = bet*multiplier
		return newfunds
	def bet (bet, funds)
		newfunds = funds - bet
		return newfunds
*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Blackjack{
	
	public static void main(String[] args)
	throws InterruptedException{	

		Scanner scan = new Scanner(System.in);
		UI ui = new UI();
		Money money = new Money();
		Cards cards = new Cards();
		double funds = 500;
		double fee = 25;
		double bet = 0;
		String dealercards = "";
		int dealertotal = 0;
		String playercards = "";
		int playertotal = 0;
		int option = 0;

		System.out.print(ui.flush);
		System.out.println(ui.pad + ui.header);
		Thread.sleep(4000);
		System.out.print(ui.flush);
		//print ui
		while (true){
			funds -= fee;
			bet += fee;
			dealercards += cards.getCard();
			dealertotal += cards.getCardnumber();
			playercards += cards.getCard();
			playertotal += cards.getCardnumber();
			playercards += cards.getCard();
			playertotal += cards.getCardnumber();
			while (true){
			maingui(dealercards, playercards, funds, bet, true);
			option = scan.nextInt();
			if(option == 1){
			       playercards += cards.getCard();
			       playertotal += cards.getCardnumber();	       
			       continue;
			}

			}
		}
	}
public static void maingui(String dealercards, String playercards, double funds, double bet, boolean firstround){
		UI ui = new UI();
		System.out.print(ui.flush);
		System.out.print(ui.topui);
		if (firstround = true){
			System.out.println(ui.rpad + dealercards +  "🂠 ");
		}else{
			System.out.println(ui.rpad + dealercards);
		}
		System.out.println(ui.medpad);
		System.out.println(ui.rpad + playercards);
		System.out.println(ui.medui);
		System.out.println(ui.betpad + "Funds: " + funds + "$"  + "   " + "Bet: " + bet + "$");
		System.out.println(ui.lowui);
	}
}

	


