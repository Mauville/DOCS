//OSCAR VARGAS PEREZ
//A01657110

import java.util.Scanner;
import java.util.Objects;

class PRG11_1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input account type");
		String acctype = scan.nextLine();
		System.out.println("Input previous balance");
		double prevbal = scan.nextDouble();
		System.out.println("Input checks issued");
		int chkissued = scan.nextInt();
		System.out.println("Input income");
		double income = scan.nextDouble();
		System.out.println("Input expenses");
		double expenses = scan.nextDouble();
		int chkfee = 0;

		if (chkissued>5 && acctype != "B"){
			chkfee = (chkissued-5) * 13;
		}else if (acctype == "B"){
			chkfee = chkissued * 13;
		}

		double finalbal = (income + prevbal) + ((-1 * expenses) +(-1 * chkfee)); 

		if (Objects.equals(acctype.toLowerCase(), "b") && finalbal < 20000.0){
			finalbal -= finalbal*.075;

		}else if (Objects.equals(acctype.toLowerCase(), "r") && finalbal < 15000.0){
			finalbal -= finalbal*.075;

		}else if (Objects.equals(acctype.toLowerCase(), "s")&& finalbal < 10000.0){
			finalbal -= finalbal*.075;
		}
		System.out.println("Final balance: " + finalbal);
	}
}
