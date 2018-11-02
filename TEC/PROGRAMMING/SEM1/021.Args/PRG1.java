import java.util.Scanner;

public class PRG1{
    public static void main(String [] args){
        for(int i=0; i< args.length; i++){
            double aux = Double.parseDouble(args[i]);
            if(aux>=0){
                System.out.println("POS");
            }else{
                System.out.println("NEG");
            }
        }
    }
}
