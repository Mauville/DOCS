class UI{

	int first = 0;
	int second = 0;
	int secret = 0;

	public void setFirst(int firstnumber){
		this.first = firstnumber;
		System.out.println(first);
	}
	
	public void setSecond(int secondnumber){
		this.second = secondnumber;
		System.out.println(second);
	}
	
	public void setSecret(int secretnumber){
		this.secret = secretnumber;
		System.out.println(secret);
	}

	String gamename = "### G A M E ###";
	String firstnumber = "Input first number:";
	String lastnumber = "Input last number:";
	String menu = 
	"1) Print odds between " + first + " and " + second  + System.getProperty("line.separator")+
	"2) Print pairs between " + this.first + " and " + this.second  + System.getProperty("line.separator") + 
	"3) Guess game" + System.getProperty("line.separator") +
	"4) Quit" ;
	String odds = "Odd numbers between" + this.first + " and " + this.second;
	String pairs = "Pair numbers between" + this.first + " and " + this.second;
	String gamemenu = "You'll have to guess my secret number. It's between the two you gave me.";
	String lower = "Incorrect. Too big";
	String higher = "Incorrect. Too small";
	String win = "Correct!";
	String fail = "Incorrect. The secret number was: " +  this.secret;
}
