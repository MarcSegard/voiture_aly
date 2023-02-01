package demo;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel jp = new JPanel();
		jp.setBackground(Color.red);
		frame.add(jp);
		
		
		
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
