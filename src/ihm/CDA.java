package ihm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import java.awt.Canvas;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CDA extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CDA frame = new CDA();
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
	public CDA() {
		BorderLayout borderLayout = (BorderLayout) getContentPane().getLayout();
		borderLayout.setVgap(20);
		borderLayout.setHgap(20);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(UIManager.getColor("CheckBox.select"));
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 6));
		lblNewLabel.setIcon(new ImageIcon("/Users/marcsegard/eclipse-workspace/IHM/src/ihm/renault.png"));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setBorder(null);
		getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblCylindree = new JLabel("Cylindrée (cm3) :");
		panel.add(lblCylindree);

		JLabel lblCylindreeValue = new JLabel("2000");
		lblCylindreeValue.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblCylindreeValue);

		JLabel lblNewLabel_4 = new JLabel("Nombre portes : ");
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_2 = new JLabel("5");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Couleur : ");
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_6 = new JLabel("jaune");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_8 = new JLabel("Type carburant : ");
		panel.add(lblNewLabel_8);

		JLabel lblNewLabel_5 = new JLabel("Diesel");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_7 = new JLabel("Options : ");
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_10 = new JLabel("MP3, Vitre électrique");
		panel.add(lblNewLabel_10);

		JLabel lblNewLabel_12 = new JLabel("Prix (€/jour) : ");
		panel.add(lblNewLabel_12);

		JLabel lblNewLabel_9 = new JLabel("43,2");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_9);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("Button.select"));
		getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_20 = new JLabel("Renault Toto");
		lblNewLabel_20.setFont(new Font("Lucida Grande", Font.PLAIN, 23));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_20);
		setSize(800, 400);
	}
}
