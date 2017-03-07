package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import model.Model;
import view.SettingsWindow;

public class SettingsController {
Model actions;
SettingsWindow view;
	/**
	 * Controller class for the settings window
	 * @param actions
	 * a Model instance, passed along in order to have persistence in settings choices
	 */
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
	
	/**
	 * Listener class for sound toggles
	 *
	 */
	class SoundToggleSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
		actions.toggleSound();
		}
	}
	/**
	 * Listener class for music toggles
	 *
	 */
	class MusicToggleSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			actions.toggleMusic();
		}
	}
	/**
	 * Listener class for shadows toggle
	 *
	 */
	class ShadowsSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			actions.toggleShadows();
		}
	}
	/**
	 * Listener class for anti-aliasing toggle
	 *
	 */
	class AntialiasingSettingListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			actions.toggleAntialiasing();
		}
	}
	/**
	 * Listener class for back button
	 */
	class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			view.dispose();
			new MainController(actions);
		}
	}
}
