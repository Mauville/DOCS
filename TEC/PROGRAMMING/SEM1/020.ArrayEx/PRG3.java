
import java.util.stream.*;
import java.util.Scanner;
import java.util.Arrays;

public class PRG3{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size: ");
		int size = sc.nextInt();
		int counter = 0;

		String [] arraynum = new String[size];

		for(int i = 0; i < size; i++){
			System.out.println("Input element: ");
			arraynum [i] = sc.nextInt();
		}
		for(int j = 0; j < size; j++){
			String arr = Arrays.toString(arraynum);
			for(int k = 0; k < arr.length(); k++){
				if (arr.charAt(k) == 'a'){
					counter++;
				}
			}
		}
					

		System.out.println(counter);
		Arrays.sort(arraynum);
		System.out.println(arraynum[0]);


		//int sum = IntStream.of(arraynum).sum();
		//System.out.println(sum);

	}
}
