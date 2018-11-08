package singleton;

import java.util.LinkedList;

public class ScrabbleTest {

	public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerOneTiles);
		
		System.out.println("Letter list: " + newInstance.getLetterList());
		
		Singleton newInstanceTwo = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstanceTwo));
		
		LinkedList<String> playerTwoTiles = newInstanceTwo.getTiles(7);
		
		System.out.println("Player 2: " + playerTwoTiles);
		
		System.out.println("Letter list: " + newInstanceTwo.getLetterList());
		
		
	}
	
}
