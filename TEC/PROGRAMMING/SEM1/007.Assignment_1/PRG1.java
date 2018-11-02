/* Author: OSCAR VARGAS PEREZ
 * MATRICULA: A01657110
 * DATE 28/8/18
 */

import java.util.Scanner;

class PRG1{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in¿;
		System.out.println("Please input passed semesters");
		int passedSem = scan.nextInt();
		System.out.println("Please input failed subjects");
		int failedSub = scan.nextInt();
		int unitspassed = passedSem * 6 * 8;
		int unitsfailed = failedSub * 8;
		int totalunits = 228 - unitspassed + unitsfailed;
		double percent = (unitspassed * 100) / 288;
		/*float percent = ((((228 - unitspassed + unitsFailed) * 100)) / 2.8);*/
		System.out.println( percent + " % of units completed");
	}
}	
	
/* A student mis take 6 subjects of 8 units each semester.
 * His career lasts 9 semesters.
 * Program that indicates the percentage of units the sudent has to take.
 * ASk how many semesters he has completed and how many subjects he has failed.
 *
 * 9 semesters
 * 6 subjects
 * 8 units
 *
 * 9 semesters
 * 36 subjects in total
 * 288 units in total
 *
 * Convert everything to units and then have that be the percentage of 288
 *
 * completes = input()
 * failedS = input()
 * 
 * unitspassed = completes*6*8
 * unitsFailed = failedS*
 *
 * percentage =  ((288 - unitspassed + unitsFailed)*100)/2.8
 *
 *
 */

