package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class SettingsWindow extends JFrame {
JRadioButton soundOn;
JRadioButton soundOff;
JRadioButton musicOn;
JRadioButton musicOff;
JCheckBox shadowsCheck;
JCheckBox antialiasingCheck;
JButton backButton;
	private JPanel contentPane;
	public SettingsWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblSettings = new JLabel("Settings");
		lblSettings.setHorizontalAlignment(SwingConstants.CENTER);
		lblSettings.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblSound = new JLabel("Sound: ");
		
		JLabel lblMusic = new JLabel("Music: ");
		
		JLabel lblGraphics = new JLabel("Graphics: ");
		
		soundOn = new JRadioButton("on");
		
		soundOff = new JRadioButton("off");
		
		musicOn = new JRadioButton("on");
		
		musicOff = new JRadioButton("off");
		
		shadowsCheck = new JCheckBox("Shadows");
		
		antialiasingCheck = new JCheckBox("Anti-aliasing");
		
		backButton = new JButton("Back");
		ButtonGroup musicSettings = new ButtonGroup();
		musicSettings.add(musicOff);
		musicSettings.add(musicOn);
		ButtonGroup soundSettings = new ButtonGroup();
		soundSettings.add(soundOff);
		soundSettings.add(soundOn);
		musicOn.setSelected(true);
		soundOn.setSelected(true);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSettings, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSound)
							.addGap(18)
							.addComponent(soundOn)
							.addGap(2)
							.addComponent(soundOff))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMusic)
							.addGap(22)
							.addComponent(musicOn)
							.addGap(2)
							.addComponent(musicOff))
						.addComponent(lblGraphics)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(shadowsCheck)
							.addComponent(antialiasingCheck))
						.addComponent(backButton, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblSettings)
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblSound))
						.addComponent(soundOn)
						.addComponent(soundOff))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblMusic))
						.addComponent(musicOn)
						.addComponent(musicOff))
					.addGap(7)
					.addComponent(lblGraphics)
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(shadowsCheck)
						.addComponent(antialiasingCheck))
					.addGap(7)
					.addComponent(backButton))
		);
		contentPane.setLayout(gl_contentPane);
		pack();
	}
	public void setMusicOnRadioBtnActions(ActionListener musicOnAction) {
		musicOn.addActionListener(musicOnAction);
	}
	public void setMusicOffRadioBtnActions(ActionListener musicOffAction) {
		musicOff.addActionListener(musicOffAction);
	}
	public void setSoundOnRadioBtnActions(ActionListener soundOnAction) {
		soundOn.addActionListener(soundOnAction);
	}
	public void setSoundOffRadioBtnActions(ActionListener soundOffAction) {
		soundOff.addActionListener(soundOffAction);
	}
	public void setAntialiasingCheckActions(ActionListener antialiasingAction) {
		antialiasingCheck.addActionListener(antialiasingAction);
	}
	public void setShadowsCheckActions(ActionListener shadowsAction) {
		shadowsCheck.addActionListener(shadowsAction);
	}
	public void setBackButtonActions(ActionListener backButtonAction) {
		backButton.addActionListener(backButtonAction);
	}
}
