package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import model.Model;
import view.SettingsWindow;

public class SettingsController {
Model actions;
SettingsWindow view;
	public SettingsController(Model actions) {
	this.actions = actions;
	view = new SettingsWindow();
	view.setVisible(true);
	view.setBackButtonActions(new BackButtonListener());
}
	class SoundOnSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			view.dispose();
			new MainController();
		}
	}
}
