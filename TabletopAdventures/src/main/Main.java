package main;

import gui.GameWindow;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {

	public static void main(String[] args) {
		Dimension screen_size = Toolkit.getDefaultToolkit().getScreenSize();
		GameWindow window = new GameWindow(screen_size);
		GameObject game = new GameObject(window);
	}

}
