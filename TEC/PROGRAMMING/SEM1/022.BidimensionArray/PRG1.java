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
        System.out.println("Input number of columns");
        int cols = sc.nextInt();
        int arr [][] = makeMatrix(rows, cols);
        System.out.println(Arrays.toString(arr));
        //printMenu();
        int option = sc.nextInt();

        if(option == 1){
            System.out.println("Input column 1");
            int col1 = sc.nextInt();
            System.out.println("Input column 2");
            int col2 = sc.nextInt();
         ///   changeCols(arr,col1, col2);

        }if(option == 2){
            System.out.println("Input row 1");
            int row1 = sc.nextInt();
            System.out.println("Input row 2");
            int row2 = sc.nextInt();
           // changeRows(arr, row1, row2);

        }if(option == 3 ){
            transpose(arr, rows, cols);
        }else{
            System.exit(0);
        }
    }

    public static int [][] makeMatrix(int rows,int cols){
        Random rd = new Random();
        int matrix [][] = new int[rows][cols];
        for(int eachrow = 0; eachrow<= rows; eachrow++){
            for(int eachind = 0; eachind <= cols; eachind++){
                matrix[eachrow][eachind] = rd.nextInt(cols);
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
        System.out.println(Arrays.toString(transposed));
    } 
}



