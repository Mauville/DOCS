import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Android pie = new Android(100, 100, 0, 10, 100, 40, 18, 18, 10);
        Scanner sc = new Scanner(System.in);
        // This is cleary not a good practice. What is the alternative?
        boolean keep = true;
        System.out.println("#################################");
        System.out.println("Android 9.0.1. \"Pie\"");
        System.out.println("#################################");
        System.out.println("Vargas Perez Oscar");
        System.out.println("A01657110");
        while (keep) {
            System.out.println("#################################");
            System.out.println("ActionList: (M)ove (R)otate Re(C)harge Coo(L) (E)xit");
            System.out.println("#################################");
            String action = sc.nextLine();
            switch (action.toLowerCase()) {
                case "m":
                case "move":
                    System.out.println("Units?");
                    int steps = sc.nextInt();
                    pie.move(steps);
                    break;
                case "r":
                case "rotate":
                    System.out.println("(R)ight (L)eft?");
                    String direction = sc.nextLine();
                    int numdir = 0;
                    if (direction.toLowerCase().equals("r") || direction.toLowerCase().equals("right"))
                        numdir = 1;
                    else
                        numdir = -1;
                    pie.rotate(numdir);
                    break;

                case "c":
                case "recharge":
                    pie.battSense.recharge();
                    break;
                case "l":
                case "cool":
                    pie.tempSense.coolDown();
                    break;
                case "":
                case "e":
                    System.exit(0);

            }


        }
    }
}
