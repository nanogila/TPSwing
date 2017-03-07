package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.MainController;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * View class for the main menu window
 *
 */
public class MainWindow extends JFrame{
	private JPanel contentPane;
	JButton startGameButton;
	JButton settingsButton;
	JButton exitButton;
	public MainWindow() {
		setResizable(false);
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 229, 172);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{24, 14, 23, 23, 23, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel titleLabel = new JLabel("Trabajo Practico Swing");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GridBagConstraints gbc_titleLabel = new GridBagConstraints();
		gbc_titleLabel.insets = new Insets(0, 0, 5, 0);
		gbc_titleLabel.gridx = 0;
		gbc_titleLabel.gridy = 0;
		contentPane.add(titleLabel, gbc_titleLabel);
		
		JLabel creatorsLabel = new JLabel("Tomas Varela - Ignacio Gilardoni");
		creatorsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_creatorsLabel = new GridBagConstraints();
		gbc_creatorsLabel.anchor = GridBagConstraints.NORTH;
		gbc_creatorsLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_creatorsLabel.insets = new Insets(0, 0, 5, 0);
		gbc_creatorsLabel.gridx = 0;
		gbc_creatorsLabel.gridy = 1;
		contentPane.add(creatorsLabel, gbc_creatorsLabel);
		
		startGameButton = new JButton("Start game");
		GridBagConstraints gbc_startGameButton = new GridBagConstraints();
		gbc_startGameButton.fill = MAXIMIZED_HORIZ;
		gbc_startGameButton.anchor = GridBagConstraints.NORTH;
		gbc_startGameButton.insets = new Insets(0, 40, 5, 40);
		gbc_startGameButton.gridx = 0;
		gbc_startGameButton.gridy = 2;
		contentPane.add(startGameButton, gbc_startGameButton);
		
		settingsButton = new JButton("Settings");
		GridBagConstraints gbc_settingsButton = new GridBagConstraints();
		gbc_settingsButton.anchor = GridBagConstraints.NORTH;
		gbc_settingsButton.fill = MAXIMIZED_HORIZ;
		gbc_settingsButton.insets = new Insets(0, 40, 5, 40);
		gbc_settingsButton.gridx = 0;
		gbc_settingsButton.gridy = 3;
		contentPane.add(settingsButton, gbc_settingsButton);
		
		exitButton = new JButton("Exit");
		GridBagConstraints gbc_exitButton = new GridBagConstraints();
		gbc_exitButton.anchor = GridBagConstraints.NORTH;
		gbc_exitButton.fill = MAXIMIZED_HORIZ;
		gbc_exitButton.insets = new Insets(0,40,0,40);
		gbc_exitButton.gridx = 0;
		gbc_exitButton.gridy = 4;
		contentPane.add(exitButton, gbc_exitButton);
		pack();
	}
	/**Method to add a listener to the exit button
	 * @param exitButtonAction
	 * an ActionListener to link to this button
	 */
	public void addExitListener(ActionListener exitButtonAction) {
		exitButton.addActionListener(exitButtonAction);
	}
	
	/** Method to add a listener to the start game button
	 * @param startGameButtonAction
	 * an ActionListener to link to this button
	 */
	public void addStartGameListener(ActionListener startGameButtonAction) {
		startGameButton.addActionListener(startGameButtonAction);
	}
	/** Method to add a listener to the settings button
	 * @param setingsButtonAction
	 * an ActionListener to link to this button
	 */
	public void addSettingsListener(ActionListener settingsButtonAction) {
		settingsButton.addActionListener(settingsButtonAction);
	}
}
