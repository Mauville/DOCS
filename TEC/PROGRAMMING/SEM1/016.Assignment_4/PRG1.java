import java.util.Scanner;
import java.util.Random;


public class PRG1{

    public static void main(String[] args){

	    Scanner sc = new Scanner(System.in);
	    System.out.println("Tests: ");
	    int input = sc.nextInt();
	    checkProbability(input);
    }

    public static int rollDice(){

		Random rn = new Random();
		int number = rn.nextInt(6) + 1;
		return number;
		}

    public static void checkProbability(int tests){
	    int result = 0;
	    int tim1 = 0;
	    int tim2 = 0;
	    int tim3 = 0;
	    int tim4 = 0;
	    int tim5 = 0;
	    int tim6 = 0;

	    for(int i = tests; i > 0; i--){
		   result = rollDice();
		    switch(result){
			    case 1 :
				    tim1 += 1;
				    break;
			    case 2 :
				    tim2 += 1;
				    break;
			    case 3 :
				    tim3 += 1;
				    break;
			    case 4 :
				    tim4 += 1;
				    break;
			    case 5 :
				    tim5 += 1;
				    break;
			    case 6 :
				    tim6 += 1;
				    break;
		    }
	    }

		   System.out.println((tim1*100)/tests);
		   System.out.println((tim2*100)/tests);
		   System.out.println((tim3*100)/tests);
		   System.out.println((tim4*100)/tests);
		   System.out.println((tim5*100)/tests);
		   System.out.println((tim6*100)/tests);
    }
}

