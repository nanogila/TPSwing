import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.*;

public class MainWindow extends JPanel {

    private JPanel panel;
    private JFrame mainWindow;
    private JLabel labelTP;
    private JLabel students;
    private JButton startGameButton;
    private JButton settingsButton;
    private JButton exitButton;

    public MainWindow(){
        mainWindow = new JFrame("Main Menu");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(300,300);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setResizable(false);
        panel = new JPanel();
        labelTP = new JLabel("Trabajo Practico Swing");
        students = new JLabel("Tomas Varela - Ignacio Gilardonni");
        startGameButton = new JButton("Start Game");
        settingsButton = new JButton("Settings");
        exitButton = new JButton("Exit");

    }



    public  void createandShowGUI() {



        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        startGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameWindow game = new GameWindow();
                game.createAndShowGameWindow();
                mainWindow.setVisible(false);
            }
        });

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingsWindow settings = new SettingsWindow();
                settings.createAndShowSettingsWindow();
                mainWindow.setVisible(false);
            }
        });



        JPanel innerPanel1 = new JPanel();
        innerPanel1.setLayout(new BorderLayout());
        JPanel innerPanel2 = new JPanel();
        innerPanel2.setLayout(new BorderLayout());
        JPanel innerPanel3 = new JPanel();
        innerPanel3.setLayout(new BorderLayout());



        innerPanel1.add(startGameButton, BorderLayout.CENTER);
        innerPanel2.add(settingsButton, BorderLayout.CENTER);
        innerPanel3.add(exitButton, BorderLayout.CENTER);



        panel.add(labelTP);
        panel.add(students);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(innerPanel1);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(innerPanel2);
        panel.add(Box.createRigidArea(new Dimension(0,10)));
        panel.add(innerPanel3);
        panel.add(Box.createRigidArea(new Dimension(0,10)));

        mainWindow.getContentPane().add(panel);
        mainWindow.setVisible(true);

    }


}
