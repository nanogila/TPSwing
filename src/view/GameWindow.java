package view;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * View class for the game window
 */
public class GameWindow extends JFrame{

    private JPanel panel;
    private JButton backButton;
    private JLabel gameImage;
    public GameWindow(){
       setTitle("Game Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        setResizable(false);
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        backButton = new JButton("Back");
        gameImage = new JLabel(new ImageIcon(GameWindow.class.getResource("/view/pacman3.jpg")));
        panel.setLayout(new BorderLayout(5,5));
        panel.add(backButton, BorderLayout.PAGE_END);
        panel.add(gameImage, BorderLayout.CENTER);
        getContentPane().add(panel);
        pack();
    }
	/**
	 *  Method to add a listener to back button
	 * @param backButtonAction
	 * an ActionListener to link to this toggle
	 */
    public void addBackButtonListener(ActionListener backButtonAction){
backButton.addActionListener(backButtonAction);
    }

}
