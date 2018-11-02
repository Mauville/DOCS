import UI;
import java.util.Scanner;
import java.util.Random;

public class Engine{
	public static boolean LessOrMore(int secret, int userinput){
		if(userinput > secret){
		       System.out.println(ui.lower);
		       return false;
		}

		if(userinput < secret){
			System.out.println(ui.higher);
			return false;
		}

		if(userinput == secret){
		       System.out.println(ui.win);	
		       return true;
		}
	
	}
	public static void game(){
		Scanner sc = new Scanner(System.in);
		UI ui = new UI();
		Random rd = new Random();

		System.out.println(ui.gamename);
		System.out.println(ui.firstnumber);
		int first = sc.nextInt();
		System.out.println(ui.lastnumber);
		int second = sc.nextInt();
		System.out.println(ui.menu);
		int option = sc.nextInt();
		int secret = rd.nextInt(second-first) + first;
		int attempts = 3;
		ui.setFirst(first);
		ui.setSecond(second);
		ui.setSecret(secret);
		ui.setAttempts(attempts);

		if(option == 1){
			System.out.println(ui.odds);
			for(int i = option; i <= second && i % 2 == 0 ; i++){
					System.out.println(i);
					System.exit(0);
			}
		}
		if(option == 2){
			System.out.println(ui.pairs);
			for(int i = option; i <= second && i % 2 != 0 ; i++){
					System.out.println(i);
					System.exit(0);
			}
		}
		
		if(option == 3){
			System.out.println(ui.gamemenu);
			int input = 0;
			boolean win = false;
			while (attempts > 0 && win == false){
				input = sc.nextInt();
				win = LessOrMore(secret, input);
				attempts--;
			}

		}

		if(option == 4){
			System.exit(0);
		}
	}
}
