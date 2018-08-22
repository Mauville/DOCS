/* Java wont store number higher or lower than 127 or -127 on an byte type
/* Java wont store number higher or lower than 32767 or -32767 on an short type
/* Java wont store number higher or lower than 4 billion or -4billion on a long type
/* You can split a number using underscores 1000 == 1_000 
 * use float for decimal places.To avoid floats from being converted to doubles, append "F" to the end of the number
 *
 *
 *
 *
 * CAN UNICODE BE USED FOR VARIABLE NAMES? yes
 * Variables are inmmutable
 * Does it actually matter with current stats?
 *
 * Triple equal (===) compares meaning and data type
 
*/
class DataType{

	public static void main(String[] args){

		byte varbyte = 126;
		short varshort = 32767;
		float varfloat = 1.5F;
		double vardouble = 1.5;
		boolean booleant = TRUE;
		boolean booleanf = false;
/* AND -> &&
 * OR  -> ||
 * 
 *
 * To change a variable's value, dont redeclare the type.*/

		byte x = 1;
		x = 2;	
/* Operations between data types are not supported*/

		int ad = 1;
		long bad = 2;

