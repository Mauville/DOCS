//first the rows, tjhen the columns
//the lenght of the multidimensional array will be the number of rows
//using length on an element will output the columns 
//
//
/*
 *create bidimensional array
 input columnsLIM
 input rows
 arr = makearray(columnsLIM, rows)
    def makearray()
        cols = make n arrays (cols) filled with randInt()
        make x arrays (rows) using cols
 print beautifyarray(arr)
    def beautifyarray()
        for i in range[rows[
        print [ + row[i] + ]
print menu()
if option = switchcols
    input(col1)
    input(col2)

else option = switch rows
    input(row1)
    input(row2)
    back = arr[row1]
    arr[row1]= arr[row2]
    arr[row2]= back
    print arr

    
else option = transpose
else end
 * */


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


class PRG1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows");
        int rows = sc.nextInt();
        rows--;
        System.out.println("Input number of columns");
        int cols = sc.nextInt();
        cols--;
        int arr [][] = makeMatrix(rows, cols);
        boolean looptrue = true;
        int option = 0;

        while(looptrue = true){
        printMatrix(arr);
        printMenu();
        option = sc.nextInt();

        if (option == 1){
            System.out.println("Input column 1");
            int col1 = sc.nextInt();
            col1--;
            System.out.println("Input column 2");
            int col2 = sc.nextInt();
            col2--;
            arr = changeCols(arr,col1, col2, rows);
            printMatrix(arr);


        }if(option == 2){
            System.out.println("Input row 1");
            int row1 = sc.nextInt();
            row1--;
            System.out.println("Input row 2");
            int row2 = sc.nextInt();
            row2--;
            arr = changeRows(arr, row1, row2);
            printMatrix(arr);

        }if(option == 3 ){
            arr = transpose(arr, rows, cols);
            printMatrix(arr);

        }else{
            looptrue = false;
        }
        }
    }
    public static int [][] makeMatrix(int rows,int cols){
        Random rd = new Random();
        rows++;
        cols++;
        int matrix [][] = new int[rows][cols];
        for(int eachrow = 0; eachrow< rows; eachrow++){
            for(int eachind = 0; eachind < cols; eachind++){
                matrix[eachrow][eachind] = rd.nextInt(cols)+1;
            }
        }
        return matrix;
    }
    public static void transpose(int arr[][], int rows, int cols){
        int[][] transposed = new int[cols][rows];
        for (int eachrow = 0; eachrow <= rows; eachrow++){
            for(int eachind = 0; eachind <= cols; eachind++){
                transposed[eachind][eachrow] = arr[eachrow][eachind];
            }
        }
    } 
    public static int[][] changeCols(int[][] arr, int col1, int col2, int rows){
        for(int eachrow = rows; eachrow <= rows; eachrow++){
            int bkp = arr[eachrow][col1];
            arr[eachrow][col1] = arr[eachrow][col2];
            arr[eachrow][col2] = bkp;
        }
        return arr;
    }
    public static int[][] changeRows(int [][] arr, int row1, int row2){
        int [] bkp = arr[row1];
        arr [row1] = arr[row2];
        arr [row2] = bkp;
        return arr;
    }
    public static void printMatrix(int[][]arr){
        System.out.println(Arrays.deepToString(arr).replace("], ", "]\n").replace("[[", "[").replace("]]","]"));
    }
    public static void printMenu(){
        System.out.println("**************");
        System.out.println("1) Switch cols");
        System.out.println("2) Switch rows");
        System.out.println("3) Transpose");
        System.out.println("4) Exit");
        System.out.println("**************");

    }


}



