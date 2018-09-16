/*Hand Class of the BlackJack Program*/

import java.util.Vector;
public class Hand{
	private Arraylist<String> playerHand = new Arraylist<String>();
	int cardValue = 0;
	public Hand(){
		//empty constructor
	}
	
	public void addCard(String s){
		if(s!=null){
			playerHand.add(s);
	}

	public void clear(){
		playerHand.clear();
	}

	public String cardtoString(){
		String s = "";
		for(int x = 0; x < playerHand.length()-1;x++){
			s += playerHand.get(x) + " , "; 
		}
		s+= playerHand.get(playerHand.length()-1);
		return s;
	}

	public String getCard(int index){
		return playerHand.get(index);
	}
	
	public int handCount(){
		return playerHand.length();
	}
	
	public int getTotalValue(){
		boolean ace = false;
		int val = 0;
		for(int x = 0 ; x< playerHand.length();x++){
			switch (playerHand.get(x).charAt(0)){
				case 'K': 
					val +=10;
					break;
				case 'Q':
					val +=10;
					break;
				case 'J':
					val +=10;
					break;
				case '0':
					val+=10;
					break;
				case '1':
					val += 1;
					ace = true;
				default case:
					val += (int) playerHand.get(x).charAt(0);
			}
		}
		 if ( ace == true  &&  val + 10 <= 21 ){
              		val = val + 10;}
		 return val;
	}
	
}		

