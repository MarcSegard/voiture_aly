package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.BoxLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Results extends JFrame {
	private static final long serialVersionUID = 1L;
	//private JTable result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Results frame = new Results();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Results() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 834, 644);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		/********** affichage dispos  ***********************/
		JPanel afficheResults = new JPanel();
		getContentPane().add(afficheResults, BorderLayout.WEST);
		afficheResults.setLayout(new GridLayout(0, 1, 0, 0));
		JPanel afficheResults_1 = new JPanel();
		JPanel afficheResults_2 = new JPanel();
		afficheResults_2.setLayout(new GridLayout(0, 1, 0, 0));

		
		afficheResults_1.setLayout(new BorderLayout(0, 0));
		JLabel lblNewLabel_vehiculeDispo = new JLabel("Véhicules disponible à la location : ");
		lblNewLabel_vehiculeDispo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_vehiculeDispo.setFont(new Font("SansSerif", Font.PLAIN, 14));
		afficheResults_1.add(lblNewLabel_vehiculeDispo, BorderLayout.NORTH);

		String header[] = { "Marque", "Carburant", "Prix (€/jour)" };
		Object data[][] = { { "Renault", "Diesel", "45,5" }, { "Peugeot", "Super", "24,5" },
				{ "Citroën", "Electrique", "56" }, { "Renault", "Hybride", "34,6" } };

		JTable table = new JTable(data, header);
		table.setBackground(UIManager.getColor("Button.select"));
		table.setForeground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		afficheResults_1.add(new JScrollPane(table),BorderLayout.CENTER);
		
		afficheResults.add(afficheResults_1);
		
		JLabel lblNewLabel_date_debut = new JLabel("Date de début de location :  ");
		lblNewLabel_date_debut.setFont(new Font("Nanum Gothic", Font.PLAIN, 14));
		afficheResults_2.add(lblNewLabel_date_debut);
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		afficheResults_2.add(datePicker);
		JButton btnNewButton_debutLoc = new JButton("Selectionner la date de début de location");
		afficheResults_2.add(btnNewButton_debutLoc);
		
		JLabel lblNewLabel_date_fin= new JLabel("Date de fin de location :  ");
		lblNewLabel_date_fin.setFont(new Font("SansSerif", Font.PLAIN, 14));
		afficheResults_2.add(lblNewLabel_date_fin);
		UtilDateModel model2 = new UtilDateModel();
		JDatePanelImpl datePanel2 = new JDatePanelImpl(model2);
		JDatePickerImpl datePicker2 = new JDatePickerImpl(datePanel2);
		afficheResults_2.add(datePicker2);
		JButton btnNewButton_finLoc = new JButton("Selectionner la date de fin de location");
		afficheResults_2.add(btnNewButton_finLoc);
		
		afficheResults.add(afficheResults_2);
		
		JPanel naviguation = new JPanel();
		getContentPane().add(naviguation, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Louer");
		naviguation.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deconnexion");
		naviguation.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quitter");
		naviguation.add(btnNewButton_2);
		

		JLabel lblNewLabel = new JLabel("Agence Aly & Marc");
		lblNewLabel.setFont(new Font("Monaco", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JPanel presentationVoiture = new JPanel();
		getContentPane().add(presentationVoiture, BorderLayout.CENTER);
		presentationVoiture.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 0, 368, 288);
		presentationVoiture.add(panel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("/Users/marcsegard/eclipse-workspace/IHM/src/ihm/renault.png"));

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 288, 368, 288);
		presentationVoiture.add(panel_3);
		panel_3.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Cynlindrée (cm3) : ");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_4);
		JLabel lblNewLabel_3 = new JLabel("2000");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_3);

		JLabel lblNewLabel_2 = new JLabel("Nombre de portes : ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("5");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Couleur : ");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_5 = new JLabel("Jaune canari");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_10 = new JLabel("Type carburant : ");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Diesel");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_7 = new JLabel("Prix : ");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("45,5");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_9);

	}

}
