/*Hand Class of the BlackJack Program*/

import java.util.*;
public class Hand{
	private ArrayList<String> playerHand;
	int cardValue = 0;
	public Hand(){
		this.playerHand = new ArrayList<String>();
	}
	
	public void addCard(String s){
		if(s!=null){
			this.playerHand.add(s);
		}
	}

	public void clear(){
		this.playerHand.clear();
	}

	public String cardtoString(){
		String s = "";
		for(int x = 0; x < playerHand.size();x++){
			if(this.playerHand.get(x).charAt(0) != '0') {
				s += this.playerHand.get(x) + " , "; 
			}else{
				s += "10" + this.playerHand.get(x).charAt(this.playerHand.size() -1);
			}
		}
		return s;
	}

	public String getCard(int index){
		return this.playerHand.get(index);
	}
	
	public int handCount(){
		return this.playerHand.size();
	}
	
	public int getTotalValue(){
		boolean ace = false;
		int val = 0;
		for(int x = 0 ; x< this.playerHand.size();x++){
			switch (this.playerHand.get(x).charAt(0)){
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
				default:
					val += (int) this.playerHand.get(x).charAt(0);
			}
		}
		if ( ace == true  &&  val + 10 <= 21 ){
			val = val + 10;
		}
		return val;
	}
	
}		

