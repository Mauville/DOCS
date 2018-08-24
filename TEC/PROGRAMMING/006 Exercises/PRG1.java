import java.util.Scanner;
/* whats a primitive
 * */
public class PRG1{
	public static void main(String[] args){
		
		System.out.println("##################################");
		System.out.println("#001 Realiza un programa que reciba un numero entero de 4 digitos y que imprima cuantos digitos son pares");
		System.out.println("##################################");

		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a 4 wide INT");
		String digit = scan.nextLine();


		int ispair = 0;
		int x = 0;
		for (x = 0; x < 4; x++){
		      ispair += string2int(digit, x);
		}
		
		System.out.println("Hay "+ ispair + " numeros pares en la cifra " + digit);

	}
	public static int string2int(String SLICED, int INDEX){
	
		String NUMBER = SLICED.substring(INDEX,INDEX+1);
		int RESULT = Integer.parseInt(NUMBER);
		int pair = 0;
		if (RESULT%2 == 0){
			++pair;
		}
		return pair;
	}

}	
