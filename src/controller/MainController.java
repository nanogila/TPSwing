package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

/**
 * Controller class for the main menu window
 *
 */
public class MainController {
	private Model actions;
	private MainWindow display;
public MainController(Model aModel) {
	actions =aModel;
	display = new MainWindow();
	display.addExitListener(new ExitListener());
	display.addSettingsListener(new SettingsListener());
	display.addStartGameListener(new StartGameListener());
	display.setVisible(true);
}

/**
 * Listener class for exit button
 *
 */
class ExitListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent buttonPressed) {
		System.exit(0);
	}
}
/**
 * listener class for settings button
 *
 */
class SettingsListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		new SettingsController(actions);
		display.dispose();
	}
	
}

/**
 * Listener class for start game buttton 
 *
 */
class StartGameListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		new GameController(actions);
		display.dispose();
	}
	
}
}
