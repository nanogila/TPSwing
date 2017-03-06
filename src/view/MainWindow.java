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

public class MainWindow extends JFrame{
	private JPanel contentPane;
	JButton startGameButton;
	JButton settingsButton;
	JButton exitButton;
	public MainWindow() {
		setTitle("Main Menu");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 239);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel titleLabel = new JLabel("Trabajo Practico Swing");
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel creatorsLabel = new JLabel("Tomas Varela - Ignacio Gilardoni");
		creatorsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		startGameButton = new JButton("Start game");
		
		settingsButton = new JButton("Settings");
		
		exitButton = new JButton("Exit");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.CENTER)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(titleLabel))
				.addComponent(creatorsLabel, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(startGameButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(settingsButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.CENTER)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(titleLabel)
					.addGap(18)
					.addComponent(creatorsLabel)
					.addGap(18)
					.addComponent(startGameButton)
					.addGap(6)
					.addComponent(settingsButton)
					.addGap(6)
					.addComponent(exitButton)
					.addGap(12))
		);
		contentPane.setLayout(gl_contentPane);
		pack();
	}
	public void addExitListener(ActionListener exitButtonAction) {
		exitButton.addActionListener(exitButtonAction);
	}
	public void addStartGameListener(ActionListener startGameButtonAction) {
		startGameButton.addActionListener(startGameButtonAction);
	}
	public void addSettingsListener(ActionListener settingsButtonAction) {
		settingsButton.addActionListener(settingsButtonAction);
	}
}
