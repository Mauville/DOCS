import java.util.Scanner;

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

		if (chkissued>6 && acctype != "B"){
			chkfee = (chkissued-6) * 13;
		}else if (acctype == "B"){
			chkfee = chkissued * 13;
		}

		double finalbal = (income + prevbal) + ((-1 * expenses) +(-1 * chkfee));
		//Unreachable
		if (acctype == "B" && finalbal < 20000){
			finalbal += finalbal*.075;

		}else if (acctype == "R" && finalbal < 15000){
			finalbal += finalbal*.075;

		}else if (acctype == "S" && finalbal < 10000.0){
			finalbal += finalbal*.075;
		}
		//Unreachable
		System.out.println("Final balance: " + finalbal);
	}
}
