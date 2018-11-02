//Check if a number is a palindrome
//use charat with a loop that checks the first element agains the first element counting from the back
//
//number = input(number)
//
//
//for i in range(number.length)
//	if charat(i) == charat(-i)
//		continue
//	else 
//		break	
//
//	return true 
//    
import java.util.Scanner;

public class Palindrome{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		String number = sc.nextLine();
		System.out.println(checkpal(number));
	}

	public static boolean checkpal(String strnumber){
		int len =  strnumber.length()-1;
		boolean palnd = true;
		for(int i=0; i <= len; i++){
			if (strnumber.charAt(i) == strnumber.charAt(len-i)){
				continue;
			}else{
				palnd = false;
				break;
			}
		}
		return palnd;
	}
}

	
