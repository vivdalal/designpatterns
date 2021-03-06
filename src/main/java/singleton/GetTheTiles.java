package singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable{

	
	public void run() {
		Singleton newInstance = Singleton.getInstance();
		
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerTiles =  newInstance.getTiles(7);
		
		System.out.println("Player 1: " + playerTiles);
		
		System.out.println("Letter list: " + newInstance.getLetterList());
		
		System.out.println("Got Threads");
	}
}
