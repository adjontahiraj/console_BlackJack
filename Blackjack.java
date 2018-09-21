import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		int currMoney;
		int nextBet;
		boolean winOrLose;

		//User starts with 100 in money currency
		currMoney = 100;

		System.out.println("Starting Blackjack Game... \nYou start with 100 coins\n\n");

		//this is where the game starts
		
		while(true) {
			System.out.println("\nYou currently have: " + currMoney + " dollars\n\nIf you would like to exit input 0 as your bet");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your bet:  (Between 0 and " + currMoney + ")");
			//checking to make sure the ammount is a valid input
			if((!scan.hasNextInt()) || (scan.nextInt() <0) || (scan.nextInt() > currMoney)){
				System.out.println("Invalid Input!\n\nPlease enter a bet between 0 and " +currMoney+":");
			}
			nextBet = scan.nextInt();

			//after we take the bet we will play out the hand
			if(nextBet == 0){
				System.out.println("You are leaving with " + currMoney + "dollars. See you next time!");
				break;
			}
			winOrLose = playHand();

			//checking if we won or lost the hand
			if(winOrLose) {
				currMoney += nextBet;
			}else{
				currMoney -= nextBet;
			}
			
			//checking if player is our of money
			if(currMoney == 0) {
				Scanner playAgain = new Scanner(System.in);
				System.out.println("\n\nYou've run out of money!\n\nWould you like to start over? (Y or N)");
				while(playAgain.nextLine().substring(0,1).toUpperCase() != "Y" || (playAgain.nextLine().substring(0,1).toUpperCase() != "N")){
					playAgain.next();
					System.out.println("Invalid Input!\n\nPlease enter Y or N: ");
				}
				char checkIn = playAgain.next(".").charAt(0);
				checkIn = Character.toUpperCase(checkIn);
				if(checkIn == 'Y') {
					currMoney = 100;
				}else{
					System.out.println("See you next time");
					break;
				}
			}
		}
	}
	
	//this is the method where we will play the game
	static boolean playHand() {
		return true;
	}
}
