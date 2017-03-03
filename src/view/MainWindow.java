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

public class MainWindow extends JFrame{
	private JPanel contentPane;
	private MainController actionListener;
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
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(startGameButton)
					.addGap(6)
					.addComponent(settingsButton)
					.addGap(6)
					.addComponent(exitButton))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(titleLabel))
				.addComponent(creatorsLabel, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(titleLabel)
					.addGap(17)
					.addComponent(creatorsLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(startGameButton)
						.addComponent(settingsButton)
						.addComponent(exitButton)))
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
