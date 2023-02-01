package ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {

	public static void main(String[] args) {
		
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}

		//Création du container principal
		JFrame frame = new JFrame("Mon projet");
		//Donner la taille avant de centrer sinon
		//la frame sera centrée vide.
		frame.setSize(300,200);
		
		GridLayout experimentLayout = new GridLayout(0,2);
		//         JPANEL
		JPanel pane = new JPanel();
		pane.setBackground(Color.red);
		pane.setLayout(experimentLayout);
		
		//   JLABEL
		JLabel label_nom = new JLabel("Nom : ");
		pane.add(label_nom);
		
		// JTEXTFIELD
		JTextField input_nom = new JTextField();
		input_nom.setPreferredSize(new Dimension(200,20));
		pane.add(input_nom);
		
		//   JLABEL
		JLabel label_prenom = new JLabel("Prénom : ");
		pane.add(label_prenom);
		
		// JTEXTFIELD
		JTextField input_prenom = new JTextField();
		input_prenom.setPreferredSize(new Dimension(200,20));
		pane.add(input_prenom);

		
		//   JLABEL
		JLabel label_password = new JLabel("Password : ");
		pane.add(label_password);
		// JTEXTFIELD
		JPasswordField input_password = new JPasswordField();
		input_password.setPreferredSize(new Dimension(200,20));
		pane.add(input_password);
		
		
		// JBUTTON
		JButton button = new JButton("Connexion");
		button.setBackground(Color.magenta);
		pane.add(button);
		

		
		//Attention le EXIT_ON_CLOSE arrête le programme et on perd tout
		//par exemple les connections
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Ici le DISPOSE_ON_CLOSE ne ferme pas tout --> check.
		frame.add(pane);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
