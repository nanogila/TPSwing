import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindow {
    private JFrame settingsWindow;
    private JButton backButton;
    private JCheckBox shadows;
    private JCheckBox antiAliasing;
    private JPanel panel;

    public SettingsWindow(){
        settingsWindow= new JFrame("Game Window");
        settingsWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        settingsWindow.setSize(300,300);
        settingsWindow.setLocationRelativeTo(null);
        settingsWindow.setResizable(false);
        panel = new JPanel();
        backButton = new JButton("Back");
        shadows = new JCheckBox();
        antiAliasing = new JCheckBox();

    }

    public void createAndShowSettingsWindow(){
        panel.add(shadows);
        panel.add(antiAliasing);
        panel.add(backButton);
        settingsWindow.getContentPane().add(panel);
        settingsWindow.setVisible(true);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow window = new MainWindow();
                window.createandShowGUI();
                settingsWindow.setVisible(false);
            }
        });


    }

}

