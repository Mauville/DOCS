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
import java.util.*;

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
		List<Integer> dealertotal = new ArrayList<Integer>();
		String playercards = "";
		List<Integer> playernum = new ArrayList<Integer>();
		int option = 0;

		System.out.print(ui.flush);
		System.out.println(ui.pad + ui.header);
		Thread.sleep(4/*000*/);
		System.out.print(ui.flush);
		//print ui
		while (true){
			funds -= fee;
			bet += fee;
			dealercards += cards.getCard();
			dealertotal.add(cards.getCardnumber());
			playercards += cards.getCard();
			//TODO optimize with for loop
			playernum.add(cards.getCardnumber());
			playercards += cards.getCard();
			playernum.add(cards.getCardnumber());
			while (true){
			int playersum = playernum.stream().mapToInt(Integer::intValue).sum();
			maingui(dealercards, playercards, funds, bet, true, playersum);
			option = scan.nextInt();
			// Use streams to sum elements inside of arrays
			// next step is detecting whether its a blackjack, implement winning message and bets
			if(playersum == 21){
				maingui(dealercards, playercards, funds, bet, true, 001010101);
				continue;
			}
			if(option == 1){
			        playercards += cards.getCard();
				playernum.add(cards.getCardnumber());
			       continue;
			}

			}
		}
	}
public static void maingui(String dealercards, String playercards, double funds, double bet, boolean firstround, int pt){
		UI ui = new UI();
		System.out.print(ui.flush);
		System.out.print(ui.topui);
		if (firstround = true){
			System.out.println(ui.rpad + dealercards +  /*"🂠 "*/ pt);
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

	


