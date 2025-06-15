package Tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Tests {
	public static void main(String[] args) {
		UIManager.put("OptionPane.background", new java.awt.Color(173, 216, 230));
        UIManager.put("Panel.background", new java.awt.Color(173, 216, 230));
        UIManager.put("OptionPane.messageForeground", java.awt.Color.BLACK);
        while (true) {
            String[] opcijas = {"Pildīt testu", "Aizvērt"};
            int izvele = JOptionPane.showOptionDialog(
                    null,
                    "Izvēlies:",
                    "Tests",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcijas,
                    opcijas[0]
            );
            if (izvele == 0) {
            	DaritTestu();
            } else {
                JOptionPane.showMessageDialog(null, "Uzredzēšanos");
                System.exit(0);
            }
        }
	}
	public static void DaritTestu() {
	    List<VairakAtbilzJaut> saraksts = new ArrayList<>();

	    try (BufferedReader r = new BufferedReader(new FileReader("Jaut.txt"))) {
	        String rinda;
	        while ((rinda = r.readLine()) != null) {
	            String[] dalas = rinda.split(";");
	            if (dalas.length < 6) continue;

	            String jautajums = dalas[0].trim();
	            String[] atbildes = new String[] {
	                dalas[1].trim(),
	                dalas[2].trim(),
	                dalas[3].trim(),
	                dalas[4].trim()
	            };
	            int pareizaAtbilde = Integer.parseInt(dalas[5].trim());

	            VairakAtbilzJaut jaut = new VairakAtbilzJaut(jautajums, atbildes, pareizaAtbilde);
	            saraksts.add(jaut);
	        }
	    } catch (IOException e) {
	        JOptionPane.showMessageDialog(null, "Kļūda lasot jautājumus");
	        return;
	    }

	    int rezult = 0;
	    List<String> nepareizaAtb = new ArrayList<>();

	    for (int i = 0; i < saraksts.size(); i++) {
	        VairakAtbilzJaut q = saraksts.get(i);

	        int atbilde = JOptionPane.showOptionDialog(
	            null,
	            q.getJautajums(),
	            "Jautājums " + (i + 1),
	            JOptionPane.DEFAULT_OPTION,
	            JOptionPane.QUESTION_MESSAGE,
	            null,
	            q.getAtbildes(),
	            q.getAtbildes()[0]
	        );

	        if (atbilde == q.getPareizaAtbilde()) {
	        	rezult++;
	        } else if (atbilde >= 0) {
	        	nepareizaAtb.add(q.getJautajums() +
	                "\n   Tava atbilde: " + q.getAtbildes()[atbilde] +
	                "\n   Pareizā atbilde: " + q.getAtbildes()[q.getPareizaAtbilde()] + "\n");
	        } else {
	            JOptionPane.showMessageDialog(null, "Tests pārtraukts.");
	            return;
	        }
	    }
	    String rezultats = "Tests pabeigts!\nTavs rezultāts: " + rezult + " no " + saraksts.size();
	    int skats = JOptionPane.showOptionDialog(null,rezultats,"Rezultāts",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,new String[] {"Rādīt kļūdas", "Aizvērt"},"Rādīt kļūdas");
	    if (skats == JOptionPane.YES_OPTION && !nepareizaAtb.isEmpty()) {
	        JTextArea zona = new JTextArea(String.join("\n", nepareizaAtb));
	        zona.setEditable(false);
	        JScrollPane scroll = new JScrollPane(zona);
	        scroll.setPreferredSize(new java.awt.Dimension(500, 300));
	        JOptionPane.showMessageDialog(null, scroll, "Nepareizās atbildes", JOptionPane.INFORMATION_MESSAGE);
	    } else if (skats == JOptionPane.YES_OPTION) {
	        JOptionPane.showMessageDialog(null, "Visi jautājumi atbildēti pareizi!", "Lieliski!", JOptionPane.INFORMATION_MESSAGE);
	    }
	}
}