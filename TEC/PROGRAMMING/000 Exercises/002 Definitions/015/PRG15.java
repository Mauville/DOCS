//Realiza	 un	 programa	 que	 indique	 cuántos	 días	 tiene	 un	 mes	 dependiendo	 si	 el	 año	 es	siesto	o	no.	Un	año	es	bisiesto	si	es	divisible	por	4,	excepto	el	último	de	cada	siglo	(aquel	visible	por	100),	salvo	que	éste	último	sea	divisible	por	400.	


import java.util.Scanner;

class PRG15{

	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input year");
		int year = scan.nextInt();
		System.out.println("Please input month");
		int month = scan.nextInt();
		int days = 0;

		switch (month){
			case 1:
				days = 31;
				break;
			case 2: 
				//TODO	
				if ( year % 100 == 0 && year % 400 == 0){

					days == 28;
       			          }
                 		if (  year % 100 == 0 && year % 400 == 0){

					days == 28;
				}else{
					days == 29;
				}
			case 3:
				days = 31;
				break;
			case 4:
				days = 30;
				break;
			case 5:
				days = 31;
				break;
			case 6:
				days = 30;
				break;
			case 7:
				days = 31;
				break;
			case 8:
				days = 31;
				break;
			case 9:
				days = 30;
				break;
			case 10:
				days = 31;
				break;
			case 11:
				days = 30;
				break;
			case 12:
				days = 31;
				break;

		}


	}

}
