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
	view.setBackButtonActions(new BackButtonListener());
	view.setMusicOnRadioBtnActions(new MusicToggleSettingListener());
	view.setMusicOffRadioBtnActions(new MusicToggleSettingListener());
	view.setSoundOffRadioBtnActions(new SoundToggleSettingListener());
	view.setSoundOnRadioBtnActions(new SoundToggleSettingListener());
	view.setShadowsCheckActions(new ShadowsSettingListener());
	view.setAntialiasingCheckActions(new AntialiasingSettingListener());
	view.setSettingsInitialState(actions.getMusicState(), actions.getSoundState(), actions.getShadowsState(), actions.getAntialiasingState());
	view.setVisible(true);
}
	class SoundToggleSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		actions.toggleSound();
		}
	}
	class MusicToggleSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			actions.toggleMusic();
		}
	}
	class ShadowsSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			actions.toggleShadows();
		}
	}
	class AntialiasingSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			actions.toggleAntialiasing();
		}
	}
	class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			view.dispose();
			new MainController(actions);
		}
	}
}
