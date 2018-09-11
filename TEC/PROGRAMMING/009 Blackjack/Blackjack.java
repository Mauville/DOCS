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
		System.out.print(ui.flush);
		System.out.println(ui.pad + ui.header);
		Thread.sleep(4000);
		System.out.print(ui.flush);
		//print ui
		System.out.print(ui.topui);
		cards.setCardnumber();
		System.out.println(ui.rpad + cards.getCard() +  "🂠 ");
		System.out.println(ui.medpad);
		System.out.println(ui.rpad + cards.getCard() +  cards.getCard());
		System.out.println(ui.medui);
		System.out.println(ui.betpad + "Funds: " + funds + "$"  + "   " + "Bet: " + "TODO");
		System.out.println(ui.lowui);



		}
}

	
class Money {
    public static double payout(double bet, double funds, double multiplier) {
        double newfunds = bet * multiplier;
        return newfunds;
    }
    public static double bet(double bet, double funds) {
        double newfunds = funds - bet;
        return newfunds;
    }
}	

class Cards {
        Random rand = new Random();
        int cardchoose = 0;

    public void  setCardnumber(){
        this.cardchoose = rand.nextInt(12);
    }

    public int getCardnumber(){
	    return 1 + this.cardchoose;
    }

    public String getCard() {
	String [] spa = {"🂡 ", "🂢 ", "🂣 ", "🂤 ", "🂥 ", "🂦 ", "🂧 ", "🂨 ", "🂩 ", "🂪 ", "🂫 ","🂭 ","🂮 "}; 
	String [] hea = {"🂱 ", "🂲 ", "🂳 ", "🂴 ", "🂵 ", "🂶 ", "🂷 ", "🂸 ", "🂹 ", "🂺 ", "🂻 ","🂽 ","🂾 "}; 
	String [] dia = {"🃁 ", "🃂 ", "🃃 ", "🃄 ", "🃅 ", "🃆 ", "🃇 ", "🃈 ", "🃉 ", "🃊 ", "🃋 ","🃍 ","🃎 "}; 
	String [] clu = {"🃑 ", "🃒 ", "🃓 ", "🃔 ", "🃕 ", "🃖 ", "🃗 ", "🃘 ", "🃙 ", "🃚 ", "🃛 ","🃝 ","🃞 "}; 

	switch (rand.nextInt(4)) {
            case 0:
                return spa[cardchoose];
            case 1:
                return hea[cardchoose];
            case 2:
                return dia[cardchoose];
            default:
                return clu[cardchoose];
        }
    }
}
class UI{

	String blackjack = "Blackjack! Your bet was doubled!";
	String betprompt = "Place your bet:";
	String over21 = "You went over 21.";
	String victory = "You win!";
	String defeat = "You lose";
	String flush = "\033[H\033[2J";
	String topui  =  
	 "                                    ╔╦═══════════════════════════╦╦╗" + System.getProperty("line.separator") +
	 "                                    ╠╣ ♠ ♣ B L A C K J A C K ♥ ♦ ╠╬╣" + System.getProperty("line.separator") +
	 "                                    ╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╬╣" + System.getProperty("line.separator") +
	 "                                    ╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝" + System.getProperty("line.separator") +
	 "                                                DEALER                   " + System.getProperty("line.separator");
	String medpad = 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") ;

	String medui = 
	 "                                                 YOU            " + System.getProperty("line.separator") +
	 "                                    ╔╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╗" + System.getProperty("line.separator") +
	 "                                    ╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝" ;

	String lowui = 
	 "                                        Options: " + System.getProperty("line.separator") +
	 "                                          1) Stay" + System.getProperty("line.separator") +
	 "                                          2) Hit Again" + System.getProperty("line.separator") +
	 "                                          3) Double Bet" + System.getProperty("line.separator") +
	 "                                          4) Surrender" + System.getProperty("line.separator") +
	 "                                          5) Quit" + System.getProperty("line.separator") +
	 "                                   ╔═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╗" + System.getProperty("line.separator") +
	 "                                   ╚═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╝" + System.getProperty("line.separator");

	String rpad = "                                           ";
	String betpad = "                                      ";

	//For small screens(i.e. mine) Fancy way of writing blackjack
	String header = 
		"     /$$$$$$$  /$$        /$$$$$$   /$$$$$$  /$$   /$$    /$$$$$  /$$$$$$   /$$$$$$  /$$   /$$" + System.getProperty("line.separator") + 
 		"    | $$__  $$| $$       /$$__  $$ /$$__  $$| $$  /$$/   |__  $$ /$$__  $$ /$$__  $$| $$  /$$/ " + System.getProperty("line.separator") + 
 		"    | $$  \\ $$| $$      | $$  \\ $$| $$  \\__/| $$ /$$/       | $$| $$  \\ $$| $$  \\__/| $$ /$$/  " + System.getProperty("line.separator") + 
 		"    | $$$$$$$ | $$      | $$$$$$$$| $$      | $$$$$/        | $$| $$$$$$$$| $$      | $$$$$/   " + System.getProperty("line.separator") + 
 		"    | $$__  $$| $$      | $$__  $$| $$      | $$  $$   /$$  | $$| $$__  $$| $$      | $$  $$   " + System.getProperty("line.separator") + 
 		"    | $$  \\ $$| $$      | $$  | $$| $$    $$| $$\\  $$ | $$  | $$| $$  | $$| $$    $$| $$\\  $$  " + System.getProperty("line.separator") + 
 		"    | $$$$$$$/| $$$$$$$$| $$  | $$|  $$$$$$/| $$ \\  $$|  $$$$$$/| $$  | $$|  $$$$$$/| $$ \\  $$ " + System.getProperty("line.separator") + 
 		"    |_______/ |________/|__/  |__/ \\______/ |__/  \\__/ \\______/ |__/  |__/ \\______/ |__/  \\__/ " + System.getProperty("line.separator");


	String pad = 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator") + 
		System.getProperty("line.separator");
}
