import java.util.Scanner;
import java.util.Arrays;

public class PRG1{
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       String rawdata = sc.nextLine();

       String [] arrdata = rawdata.split(" ");
       double newarray [] = new double[3];

       for(int j = 0; j<3; j++){
           newarray [j] = Integer.parseInt(arrdata[j]);
       }
        double res = newarray[0]/newarray[1];
        String stringedres = res + "";
        stringedres = stringedres.replaceAll("0","1");
        double finalres = Double.parseDouble(stringedres);
        double total = 1;

        for(int i=0; i< (newarray[2])-1; i++){
            total *= newarray[i];
        }
        System.out.println(total);
    }
}

