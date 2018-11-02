//Calculate BMI and print whether the user is under normal or overweight.

import java.util.Scanner;

class Conditionals{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input height in meters");

		double height = scan.nextDouble();

		System.out.println("Please input body weight in kg");

		double weight = scan.nextDouble();

		double BMI = Math.round(weight/Math.pow(height, 2));

		System.out.println(BMI);

		if (BMI<18.5){
			System.out.println("You are underweight. Seek professional help.");

		}else if (BMI>18.5 && BMI< 25){
			System.out.println("You are on the normal range. Eat healthy.");
			
			} else if (BMI>25 && BMI< 30){
			System.out.println("You are overweight. Seek professional help.");

				} else{
				System.out.println("You have obesity. Seek professional help.");
				}
	}
}

