package application;

import gui.GUIController;

public class Main {
	
	private Game game;
	private GUIController gui;
	

	public static void main(String[] args) {

		Game game = new GameX01(2,501);
		game.run();
	}

}
