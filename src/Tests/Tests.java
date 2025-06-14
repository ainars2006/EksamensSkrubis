package Tests;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Tests {
	public static void main(String[] args) {
		UIManager.put("OptionPane.background", new java.awt.Color(173, 216, 230));
        UIManager.put("Panel.background", new java.awt.Color(173, 216, 230));
        UIManager.put("OptionPane.messageForeground", java.awt.Color.BLACK);

        while (true) {
            String[] options = {"Pildīt testu", "Aizvērt"};
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Izvēlies:",
                    "Tests",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );
            if (choice == 0) {
            	DaritTestu();
            } else {
                JOptionPane.showMessageDialog(null, "Uzredzēšanos");
                System.exit(0);
            }
        }
	}
	public static void DaritTestu() {
		
	}
}
