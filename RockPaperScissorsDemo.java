import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

enum Choice{
	ROCK(1),
	PAPER(2),
	SCISSORS(3);
	
	int n;
	Choice(int i) {
		n = i;
	}
	
	public int getValue() {
		return n;
	}
	
	public static String getStringValueFromInt(int i) {
	     for (Choice c : Choice.values()) {
	         if (c.getValue() == i) {
	             return c.toString();
	         }
	     }
		return null;
	}
}


public class RockPaperScissorsDemo {

	public static void run() {
		int npc = 0;
		int player = 0;
		int tie = 0;
		boolean flag = true;
		Scanner userIn = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number of rounds between 1 - 10");
			int rounds = userIn.nextInt();
			
			if(rounds < 1 || rounds > 10){
				System.out.println("Error! Rounds ended not in bounds of 1 - 10");
			} else {
				
				for(int i = 1; i <= rounds; i++) {
					System.out.println("\nRound " + i + ": Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
					int choice = userIn.nextInt();
					Random rng = new Random();
					int rand = rng.nextInt(3 - 1 + 1) + 1;
					
					if(choice == 1 && rand == 3) {
						player+= 1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nPlayer wins! Rock beats Scissors.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if(choice == 1 && rand == 2) {
						npc+=1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nComputer wins! Paper beats Rock.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if (choice == 1 && rand == 1) {
						tie += 1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nNobody wins! Thats a tie.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if(choice == 2 && rand == 1) {
						player+=1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nPlayer wins! Paper beats Rock.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if (choice == 2 && rand == 3) {
						npc+=1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nComputer wins! Scissors beats Paper.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if (choice == 2 && rand == 2) {
						tie += 1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nNobody wins! Thats a tie.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if(choice == 3 && rand == 1) {
						npc+= 1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nComputer wins! Rock beats Scissors.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if (choice == 3 && rand == 2) {
						player+=1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nPlayer wins! Scissors beats Paper.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else if (choice == 3 && rand == 3){
						tie += 1;
						System.out.println("You chose " + Choice.getStringValueFromInt(choice) + " and computer chose " + Choice.getStringValueFromInt(rand));
						System.out.println("\nNobody wins! Thats a tie.\nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					} else {
						npc+=1;
						System.out.println("Invalid Choice! Computer wins by default. \nScore: \nPlayer: " + player + "\nComputer: " + npc + "\nTies: " + tie);
					}
				}
				
				if(player > npc) {
					System.out.println("\nYou win! \nScore: Player: " + player + ", Computer: " + npc + ", Ties: " + tie);
				} else if(npc > player) {
					System.out.println("Computer wins! \nScore: Player: " + player + ", Computer: " + npc + ", Ties: " + tie);
				} else {
					System.out.println("A tie, nobody wins! \nScore: Player: " + player + ", Computer: " + npc + ", Ties: " + tie);
				}
				
				System.out.println("Would you like to play again? Yes/No: ");
				String yn = userIn.next();
				
				if(yn.equalsIgnoreCase("yes")) {
					flag = true;
				} else {
					flag = false;
				}
				
			}
		} while (flag);
		
	}
	
	public static void main(String[] args) {
		
		run();

	}

}
