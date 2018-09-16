import java.util.*;

public class Deck {

	private ArrayList<Integer> currDeck;
	
	//creates a new deck of card stored in arrayList currDeck
	public Deck() {
		currDeck = new ArrayList<Integer>();
		for (int i = 1; i<=52; i++) {
			currDeck.add(i);
		}
	}
	//returns the Value + Suit of a card based on the input number
	public String cardToString(int card) {
		String cardVal = "";
		if((card%13 > 1) && (card%13 <=10)) {
			cardVal += card%13;
		}else if(card%13 ==1) {
			cardVal += "A";
		}else {
			if (card == 11) {
				cardVal += "J";
			}else if(card == 12) {
				cardVal += "Q";
			}
			else {
				cardVal += "K";
			}
		}
		if(card <= 13) {
			cardVal += "H";
		} else if (card <=26) {
			cardVal += "D";
		} else if (card <= 39) {
			cardVal += "S";
		} else {
			cardVal += "C";
		}
		return cardVal;
	}
	//returns a string value of a random card from our currDeck of cards
	public String getCard() {
		String val = "";
		int card = (int)(Math.random() * currDeck.size() +1);
		int cardnum = currDeck.get(card); //stores the random card
		currDeck.remove(card);//takes the card out of this deck
		val = cardToString(cardnum);
		return val;
	}
}
