import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tomy on 06/03/2017.
 */
public class GameWindow extends JFrame{
    private JFrame gameWindow;
    private JPanel panel;
    private JButton backButton;
    private ImageIcon image;
    private JLabel gameImage;

    public GameWindow(){
        gameWindow= new JFrame("Game Window");
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(300,300);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setResizable(false);
        panel = new JPanel();
        backButton = new JButton("Back");
        image = new ImageIcon("src/pacman3.jpg");
        gameImage = new JLabel(image);


    }

    public void createAndShowGameWindow(){
        panel.setLayout(new BorderLayout());
        panel.add(backButton, BorderLayout.PAGE_END);
        panel.add(gameImage, BorderLayout.CENTER);
        gameWindow.getContentPane().add(panel);
        gameWindow.setVisible(true);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow window = new MainWindow();
                window.createandShowGUI();
                gameWindow.setVisible(false);

            }
        });

    }

}
