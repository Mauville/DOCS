import java.util.Scanner;

class NameScanner{
	
	public static void main(String[] args){
		System.out.println("Hello. Please input your name");
		Scanner scan = new Scanner(System.in);
		String name = System.out.println(scan.nname());
		System.out.println("Your name is:"+ name);
	}
}
