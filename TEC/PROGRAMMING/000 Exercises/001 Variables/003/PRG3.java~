/*Un cliente de un banco puede realizar un maximo de tres retiros y cinco depositos en un mes. Se pretende calcular, dado un balance inicial, el saldo que tiene el cliente al final del mes.*/

/*
definir variable
cuanto dinero hay al principio
desplegar menu
procesar respuesta
	retiro o deposito
disminuir el monto
preguntar si se desea continuar
si se acaban los intentos
print final balance y bill

####

retiros = 3
depositos = 5
saldo = 30000
if monthfinished == False && retiros != 0 && depositos == 0
	print menu
		if input == retiro
		assert retiro != 0	
			int retiro
			saldo - retiro
			retiro--
			print limite de retiros alcanzado

		if input == deposito assert retiro
		!= 0
			int deposito
			saldo + deposito
			deposito--
		catch AssertionError
			print limite de depositos alcanzado
	if retiros == 0 && depositos == 0:
		break
	print do you wanna continue?
	if continue = no:
	break
*/
import java.util.Scanner;

public class PRG3{

	public static void main(String[] args){
		
		int wthdrw = 3;
		int deposits = 5;
		double saldo = 30000;
		Scanner scan = new Scanner(System.in); 

		while(wthdrw != 0 || deposits != 0){

			menu(deposits, wthdrw, saldo);
			int operation = scan.nextInt();
			float amount = 0;

			//Withdrawal option

			if (operation == 1 && wthdrw != 0){
				System.out.flush();
				System.out.printf("Available funds:%s%s%n", saldo, "$");
				System.out.println("Please input withdrawal amount:");
				amount = scan.nextFloat();
				if (amount > saldo){
					System.out.println("Funds exceeded. Locking account...");
					System.exit(0);
				}
				saldo = saldo - amount;
				System.out.flush();
				System.out.printf("Funds withdrawn: %s %n" ,amount);
				System.out.printf("Funds remaining: %s%s %n",saldo, "$");
				wthdrw --;
			}if (operation == 1 && wthdrw == 0){
				System.out.println("Monthly withdrawal limit reached");
				continue;
			}
			
			//Deposit Option
				
			if (operation == 2 && deposits != 0){
				System.out.flush();
				System.out.printf("Available funds:%s%s%n", saldo, "$");
				System.out.println("Please input deposit amount:");
				amount = scan.nextFloat();
				saldo = saldo +  amount;
				System.out.flush();
				System.out.printf("Funds Deposited: %s %n" ,amount);
				System.out.printf("Total Funds: %s%s %n",saldo, "$");
				deposits --;
			}if (operation == 2 && deposits == 0){
				System.out.println("Monthly deposit limit reached");
				continue;
			}
			
			if (operation == 3){
				statement(saldo);
				break;
			}
		
	}
	}

	public static void menu(int deposit,int withdrawal,double saldo){

			System.out.printf(
				"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + System.getProperty("line.separator") +
				"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + System.getProperty("line.separator") +
				"■■■■■■■BANK OPERATIONS■■■■■■■" + System.getProperty("line.separator") +
				"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + System.getProperty("line.separator") +
				"■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + System.getProperty("line.separator") +
				"▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥" + System.getProperty("line.separator") +
				"Funds: %s %s",saldo,"$"	 + System.getProperty("line.separator"));

			System.out.printf(
				"▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥" + System.getProperty("line.separator") +
				"Remaining Deposits:%s%s ",deposit, "/5" + System.getProperty("line.separator") +
				"▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥" + System.getProperty("line.separator") +
				"▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥" + System.getProperty("line.separator"));

			System.out.printf(
				"Remaining Wthdrwls:%s%s",withdrawal,"/3" + System.getProperty("line.separator") +
				"▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥▥" + System.getProperty("line.separator") +
				"▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" + System.getProperty("line.separator") +
				"Please select operation:" + System.getProperty("line.separator") +
				"1) Withdrawal" + System.getProperty("line.separator") +
				"2) Deposit" + System.getProperty("line.separator") +
				"3) Quit for the rest of the month" + System.getProperty("line.separator") +
				"▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" + System.getProperty("line.separator") +
				"▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" + System.getProperty("line.separator") +
				"▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤▤" + System.getProperty("line.separator") +
				"▤▤▤▤▤▤World Banks Inc.▤▤▤▤▤▤▤" + System.getProperty("line.separator"));

	}
	
	public static void statement(double saldo){

		System.out.println("End of month/attempts reached.");
		System.out.println("Current Funds: " + saldo + " ");
		System.out.println("Thank you for your business.");
		System.exit(0);
	}	
}

