package GUI;
import javax.swing.*;
public class prueba {
    public static void createandShowGUI() {
        JFrame mainWindow = new JFrame("Main Menu");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labelTP = new JLabel("Trabajo Practico Swing");
        JLabel students = new JLabel(" Tomas Varela - Ignacio Gilardonni");
        JButton startGameButton = new JButton("Start Game");
        JButton settingsButton = new JButton("Settings");
        JButton exitButton = new JButton("Exit");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        panel.add(labelTP);
        panel.add(students);
        panel.add(startGameButton);
        panel.add(settingsButton);
        panel.add(exitButton);
        mainWindow.getContentPane().add(panel);
        mainWindow.pack();
        mainWindow.setVisible(true);

    }

}
