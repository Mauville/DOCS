import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;

class Cards {
	
        Random rand = new Random();
        int cardchoose = 0;

    public void  setCardnumber(){
        this.cardchoose = rand.nextInt(12);
    }

    public int getCardnumber(){
	    return 1 + this.cardchoose;
    }

    public String getCard() {

	this.cardchoose = rand.nextInt(12);

	String [] spa = {"🂡 ", "🂢 ", "🂣 ", "🂤 ", "🂥 ", "🂦 ", "🂧 ", "🂨 ", "🂩 ", "🂪 ", "🂫 ","🂭 ","🂮 "}; 
	String [] hea = {"🂱 ", "🂲 ", "🂳 ", "🂴 ", "🂵 ", "🂶 ", "🂷 ", "🂸 ", "🂹 ", "🂺 ", "🂻 ","🂽 ","🂾 "}; 
	String [] dia = {"🃁 ", "🃂 ", "🃃 ", "🃄 ", "🃅 ", "🃆 ", "🃇 ", "🃈 ", "🃉 ", "🃊 ", "🃋 ","🃍 ","🃎 "}; 
	String [] clu = {"🃑 ", "🃒 ", "🃓 ", "🃔 ", "🃕 ", "🃖 ", "🃗 ", "🃘 ", "🃙 ", "🃚 ", "🃛 ","🃝 ","🃞 "}; 

	switch (rand.nextInt(4)) {
            case 0:
                return spa[cardchoose];
            case 1:
                return hea[cardchoose];
            case 2:
                return dia[cardchoose];
            default:
                return clu[cardchoose];
        }
    }
}
