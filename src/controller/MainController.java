package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

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

class ExitListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent buttonPressed) {
		System.exit(0);
	}
}
class SettingsListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		SettingsController settings = new SettingsController(actions);
		display.dispose();
	}
	
}
class StartGameListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	
}
}
