import javax.swing.*;

import controller.MainController;
import model.Model;
import view.*;
public class Main {
    public static void main(String[] args){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //tell Swing to display GUI components according to the OS style
			new MainController(new Model());
		} catch (Exception e) { //need to handle .setLookAndFeel exceptions
			e.printStackTrace();
		}
    }
}
