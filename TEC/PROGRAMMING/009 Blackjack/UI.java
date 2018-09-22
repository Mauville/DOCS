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
	 "                                          1) Hit" + System.getProperty("line.separator") +
	 "                                          2) Stay" + System.getProperty("line.separator") +
	 "                                          3) Double Bet" + System.getProperty("line.separator") +
	 "                                          4) Surrender" + System.getProperty("line.separator") +
	 "                                          5) Quit" + System.getProperty("line.separator") +
	 "                                   ╔═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╦═╗" + System.getProperty("line.separator") +
	 "                                   ╚═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╩═╝" + System.getProperty("line.separator");

	String rpad = "                                           ";
	String betpad = "                                      ";

	//For small screens(i.e. mine) Fancy way of writing blackjack
	String header = 
		"         /$$$$$$$  /$$        /$$$$$$   /$$$$$$  /$$   /$$    /$$$$$  /$$$$$$   /$$$$$$  /$$   /$$" + System.getProperty("line.separator") + 
 		"        | $$__  $$| $$       /$$__  $$ /$$__  $$| $$  /$$/   |__  $$ /$$__  $$ /$$__  $$| $$  /$$/ " + System.getProperty("line.separator") + 
 		"        | $$  \\ $$| $$      | $$  \\ $$| $$  \\__/| $$ /$$/       | $$| $$  \\ $$| $$  \\__/| $$ /$$/  " + System.getProperty("line.separator") + 
 		"        | $$$$$$$ | $$      | $$$$$$$$| $$      | $$$$$/        | $$| $$$$$$$$| $$      | $$$$$/   " + System.getProperty("line.separator") + 
 		"        | $$__  $$| $$      | $$__  $$| $$      | $$  $$   /$$  | $$| $$__  $$| $$      | $$  $$   " + System.getProperty("line.separator") + 
 		"        | $$  \\ $$| $$      | $$  | $$| $$    $$| $$\\  $$ | $$  | $$| $$  | $$| $$    $$| $$\\  $$  " + System.getProperty("line.separator") + 
 		"        | $$$$$$$/| $$$$$$$$| $$  | $$|  $$$$$$/| $$ \\  $$|  $$$$$$/| $$  | $$|  $$$$$$/| $$ \\  $$ " + System.getProperty("line.separator") + 
 		"        |_______/ |________/|__/  |__/ \\______/ |__/  \\__/ \\______/ |__/  |__/ \\______/ |__/  \\__/ " + System.getProperty("line.separator");


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
