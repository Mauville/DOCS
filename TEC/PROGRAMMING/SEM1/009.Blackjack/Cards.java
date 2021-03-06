import java.util.Random;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Cards {
	
        Random rand = new Random();
        int cardchoose = 0;

    public void  setCardnumber(){
        this.cardchoose = rand.nextInt(12);
    }

    public int getCardnumber(){
	    if(this.cardchoose > 10){
		    this.cardchoose = 10;
	    }
	    return 1 + this.cardchoose;
    }

    public String getCard() {

	this.cardchoose = rand.nextInt(12);
//yyp me 'h "1da" CTRL A ci) CTRL R 1 ESC 
	Map<Integer, String> spades = new HashMap<>();
	spades.put(0, new String("🂡 "));
	spades.put(1, new String("🂢 "));
	spades.put(2, new String("🂣 "));
	spades.put(3, new String("🂤 "));
	spades.put(4, new String("🂥 "));
	spades.put(5, new String("🂦 "));
	spades.put(6, new String("🂧 "));
	spades.put(7, new String("🂨 "));
	spades.put(8, new String("🂩 "));
	spades.put(9, new String("🂪 "));
	spades.put(10, new String("🂫 "));
	spades.put(11, new String("🂭 "));
	spades.put(12, new String("🂮 "));

	Map<Integer, String> hearts = new HashMap<>();
	hearts.put(0, new String("🂱 "));
	hearts.put(1, new String("🂲 "));
	hearts.put(2, new String("🂳 "));
	hearts.put(3, new String("🂴 "));
	hearts.put(4, new String("🂵 "));
	hearts.put(5, new String("🂶 "));
	hearts.put(6, new String("🂷 "));
	hearts.put(7, new String("🂸 "));
	hearts.put(8, new String("🂹 "));
	hearts.put(9, new String("🂺 "));
	hearts.put(10, new String("🂻 "));
	hearts.put(11, new String("🂽 "));
	hearts.put(12, new String("🂾 "));

	Map<Integer, String> diamonds = new HashMap<>();
	diamonds.put(0, new String("🃁 "));
	diamonds.put(1, new String("🃂 "));
	diamonds.put(2, new String("🃃 "));
	diamonds.put(3, new String("🃄 "));
	diamonds.put(4, new String("🃅 "));
	diamonds.put(5, new String("🃆 "));
	diamonds.put(6, new String("🃇 "));
	diamonds.put(7, new String("🃈 "));
	diamonds.put(8, new String("🃉 "));
	diamonds.put(9, new String("🃊 "));
	diamonds.put(10, new String("🃋 "));
	diamonds.put(11, new String("🃍 "));
	diamonds.put(12, new String("🃎 "));

	Map<Integer, String> clubs = new HashMap<>();
	clubs.put(0, new String("🃑 "));
	clubs.put(1, new String("🃒 "));
	clubs.put(2, new String("🃓 "));
	clubs.put(3, new String("🃔 "));
	clubs.put(4, new String("🃕 "));
	clubs.put(5, new String("🃖 "));
	clubs.put(6, new String("🃗 "));
	clubs.put(7, new String("🃘 "));
	clubs.put(8, new String("🃙 "));
	clubs.put(9, new String("🃚 "));
	clubs.put(10, new String("🃛 "));
	clubs.put(11, new String("🃝 "));
	clubs.put(13, new String("🃞 "));

	switch (rand.nextInt(4)) {
            case 0:
                return spades.get(cardchoose);
            case 1:
                return hearts.get(cardchoose);
            case 2:
                return diamonds.get(cardchoose);
            default:
                return clubs.get(cardchoose);
        }
    }
}
