package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Model;
import view.GameWindow;

/**
 * Controller class for the game window
 * @param menu
 * a Model instance, passed along in order to have persistence in settings choices
 */
public class GameController{
	private GameWindow view;
	private Model mainMenu;
	public GameController(Model menu) {
	mainMenu =menu;
	view = new GameWindow();
	view.addBackButtonListener(new BackButtonListener());
	view.setVisible(true);
}
	/**
	 * Listener class for back button
	 */
	class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			view.dispose();
			new MainController(mainMenu);
		}
}
	}

