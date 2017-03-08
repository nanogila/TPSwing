package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * View class for the settings window
 */
public class SettingsWindow extends JFrame {

	private JRadioButton soundOn;
	private JRadioButton soundOff;
	private JRadioButton musicOn;
	private JRadioButton musicOff;
	private JCheckBox shadowsCheck;
	private JCheckBox antialiasingCheck;
	private JButton backButton;
	private JPanel contentPane;
	public SettingsWindow() {
		setResizable(false);
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 297);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		
		ButtonGroup musicSettings = new ButtonGroup();
		ButtonGroup soundSettings = new ButtonGroup();
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{69, 0, 37, 0};
		gbl_contentPane.rowHeights = new int[]{24, 23, 23, 14, 23, 23, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblSettings = new JLabel("Settings", SwingConstants.CENTER);
		lblSettings.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_lblSettings = new GridBagConstraints();
		gbc_lblSettings.anchor = GridBagConstraints.NORTH;
		gbc_lblSettings.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSettings.insets = new Insets(0, 0, 5, 0);
		gbc_lblSettings.gridwidth = 3;
		gbc_lblSettings.gridx = 0;
		gbc_lblSettings.gridy = 0;
		contentPane.add(lblSettings, gbc_lblSettings);
		
		JLabel lblSound = new JLabel("Sound: ");
		GridBagConstraints gbc_lblSound = new GridBagConstraints();
		gbc_lblSound.anchor = GridBagConstraints.WEST;
		gbc_lblSound.insets = new Insets(0, 0, 5, 5);
		gbc_lblSound.gridx = 0;
		gbc_lblSound.gridy = 1;
		contentPane.add(lblSound, gbc_lblSound);
		
		soundOn = new JRadioButton("on");
		soundSettings.add(soundOn);
		GridBagConstraints gbc_soundOn = new GridBagConstraints();
		gbc_soundOn.anchor = GridBagConstraints.NORTHEAST;
		gbc_soundOn.insets = new Insets(0, 0, 5, 5);
		gbc_soundOn.gridx = 1;
		gbc_soundOn.gridy = 1;
		contentPane.add(soundOn, gbc_soundOn);
		
		soundOff = new JRadioButton("off");
		soundSettings.add(soundOff);
		GridBagConstraints gbc_soundOff = new GridBagConstraints();
		gbc_soundOff.anchor = GridBagConstraints.NORTHWEST;
		gbc_soundOff.insets = new Insets(0, 0, 5, 0);
		gbc_soundOff.gridx = 2;
		gbc_soundOff.gridy = 1;
		contentPane.add(soundOff, gbc_soundOff);
		
		JLabel lblMusic = new JLabel("Music: ");
		GridBagConstraints gbc_lblMusic = new GridBagConstraints();
		gbc_lblMusic.anchor = GridBagConstraints.WEST;
		gbc_lblMusic.insets = new Insets(0, 0, 5, 5);
		gbc_lblMusic.gridx = 0;
		gbc_lblMusic.gridy = 2;
		contentPane.add(lblMusic, gbc_lblMusic);
		
		musicOn = new JRadioButton("on");
		musicSettings.add(musicOn);
		GridBagConstraints gbc_musicOn = new GridBagConstraints();
		gbc_musicOn.anchor = GridBagConstraints.NORTHEAST;
		gbc_musicOn.insets = new Insets(0, 0, 5, 5);
		gbc_musicOn.gridx = 1;
		gbc_musicOn.gridy = 2;
		contentPane.add(musicOn, gbc_musicOn);
		
		musicOff = new JRadioButton("off");
		musicSettings.add(musicOff);
		GridBagConstraints gbc_musicOff = new GridBagConstraints();
		gbc_musicOff.anchor = GridBagConstraints.NORTHWEST;
		gbc_musicOff.insets = new Insets(0, 0, 5, 0);
		gbc_musicOff.gridx = 2;
		gbc_musicOff.gridy = 2;
		contentPane.add(musicOff, gbc_musicOff);
		
		JLabel lblGraphics = new JLabel("Graphics: ");
		GridBagConstraints gbc_lblGraphics = new GridBagConstraints();
		gbc_lblGraphics.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblGraphics.insets = new Insets(0, 0, 5, 5);
		gbc_lblGraphics.gridx = 0;
		gbc_lblGraphics.gridy = 3;
		contentPane.add(lblGraphics, gbc_lblGraphics);
		
		shadowsCheck = new JCheckBox("Shadows");
		GridBagConstraints gbc_shadowsCheck = new GridBagConstraints();
		gbc_shadowsCheck.anchor = GridBagConstraints.NORTHWEST;
		gbc_shadowsCheck.insets = new Insets(0, 0, 5, 5);
		gbc_shadowsCheck.gridx = 0;
		gbc_shadowsCheck.gridy = 4;
		contentPane.add(shadowsCheck, gbc_shadowsCheck);
		
		antialiasingCheck = new JCheckBox("Anti-aliasing");
		GridBagConstraints gbc_antialiasingCheck = new GridBagConstraints();
		gbc_antialiasingCheck.gridwidth = 2;
		gbc_antialiasingCheck.anchor = GridBagConstraints.NORTHWEST;
		gbc_antialiasingCheck.insets = new Insets(0, 0, 5, 0);
		gbc_antialiasingCheck.gridx = 1;
		gbc_antialiasingCheck.gridy = 4;
		contentPane.add(antialiasingCheck, gbc_antialiasingCheck);
		
		backButton = new JButton("Back");
		GridBagConstraints gbc_backButton = new GridBagConstraints();
		gbc_backButton.anchor = GridBagConstraints.NORTH;
		gbc_backButton.insets = new Insets(0,10,0,10);
		gbc_backButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_backButton.gridwidth = 3;
		gbc_backButton.gridx = 0;
		gbc_backButton.gridy = 5;
		contentPane.add(backButton, gbc_backButton);
		pack();
	}
	/**
	 * method for setting the initial state of the controls in the window, in order to mantain previous setting choices
	 * @param musicState
	 * Boolean indicating if music setting is enabled or not
	 * @param soundState
	 * Boolean indicating if sound is enabled or not
	 * @param shadowState
	 * Boolean indicating if shadows are enabled or not
	 * @param antialiasingState
	 * Boolean indicating if anti-aliasing is enabled or not
	 */
	public void setSettingsInitialState(Boolean musicState, Boolean soundState, Boolean shadowState, Boolean antialiasingState) {
		musicOn.setSelected(musicState);
		soundOn.setSelected(soundState);
		musicOff.setSelected(!musicState);
		soundOff.setSelected(!soundState);
		shadowsCheck.setSelected(shadowState);
		antialiasingCheck.setSelected(antialiasingState);
	}
	/**
	 * Method to add a listener to musicOn toggle
	 * @param musicOnAction
	 * an ActionListener to link to this toggle
	 */
	public void setMusicOnRadioBtnActions(ActionListener musicOnAction) {
		musicOn.addActionListener(musicOnAction);
	}
	/**
	 * Method to add a listener to musicOff toggle
	 * @param musicOffAction
	 * an ActionListener to link to this toggle
	 */
	public void setMusicOffRadioBtnActions(ActionListener musicOffAction) {
		musicOff.addActionListener(musicOffAction);
	}
	/**
	 * Method to add a listener to soundOn toggle
	 * @param soundOnAction
	 * an ActionListener to link to this toggle
	 */
	public void setSoundOnRadioBtnActions(ActionListener soundOnAction) {
		soundOn.addActionListener(soundOnAction);
	}
	/**
	 * Method to add a listener to soundOff toggle
	 * @param soundOffAction
	 * an ActionListener to link to this toggle
	 */
	public void setSoundOffRadioBtnActions(ActionListener soundOffAction) {
		soundOff.addActionListener(soundOffAction);
	}
	/**
	 *  Method to add a listener to antialiasingCheck toggle
	 * @param antialiasingAction
	 * an ActionListener to link to this toggle
	 */
	public void setAntialiasingCheckActions(ActionListener antialiasingAction) {
		antialiasingCheck.addActionListener(antialiasingAction);
	}
	/**
	 *  Method to add a listener to shadowsCheck toggle
	 * @param shadowsAction
	 * an ActionListener to link to this toggle
	 */
	public void setShadowsCheckActions(ActionListener shadowsAction) {
		shadowsCheck.addActionListener(shadowsAction);
	}
	/**
	 *  Method to add a listener to back button
	 * @param backButtonAction
	 * an ActionListener to link to this toggle
	 */
	public void setBackButtonActions(ActionListener backButtonAction) {
		backButton.addActionListener(backButtonAction);
	}
}
