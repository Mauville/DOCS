//Write a program that outputs a square 5 x 4 stars
//Write a program that outputs a Triangle of 4 x 4
///////////
//print   1234*
//print   123* *
//print   12* * *
//print   1* * * *
//print   * * * * *
//using size as variable, 
//print a space that many times, and one character, and a <CR>
//print a space variable -1 times, one character, one space, one character again
///////////
//print " " * size
//print "* " * i
//i++
//size-1
///////////
//input (size)
//for(int i, i < size, i++)
//	print " " * size
//	print "* " * i
///////////
//input (size)
//for(int i, i < size, i++)
//	for(int j, j < size, j++
//	print " "
//	for(i, i < size,) 
//	print "* " * i + \n
//
//

public class PRG1{
	public static void main(String[] args){
		int size = 4;
		for(int i = 1; i < 5; i++){
			System.out.println("*****");
		}
		int step = 1;
		int spacesnum  = size;
		String spaces = " ";
		String stars = "* ";
		stars.repeat(11);
		//for(int j = step; j < size; j++){ //while step < size

			/*
			for(int k = spaces; k == size; k++){ //Print the number of spaces according to step
				System.out.print(" ");
			}
			for(int l = j; l < size; l++){
				System.out.print("* ");
			}
			System.out.println();
			*/
		//}


	}
}
