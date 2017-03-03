import javax.swing.*;

import controller.MainController;
import model.Model;
import view.*;
public class Main {
    public static void main(String[] args){
		try { //no nice 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MainController(new Model());
			//prueba.createandShowGUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
