package Tasarim;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;

public class Krptlj_win_00 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Krptlj_win_00 window = new Krptlj_win_00();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Krptlj_win_00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Kriptoloji");
		frame.setBounds(100, 100, 635, 395);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("/hosgeldiniz.png")).getImage();
	
		frame.getContentPane().setLayout(null);
		
		JTextPane text_hakkýnda = new JTextPane();
		text_hakkýnda.setText("Enes MERT, Hasan JAMILEH ve Murat Can ORAK tarafýndan yapýlmýþtýr.");
		text_hakkýnda.setBackground(Color.LIGHT_GRAY);
		text_hakkýnda.setBounds(84, 260, 151, 70);
		frame.getContentPane().add(text_hakkýnda);
		text_hakkýnda.setVisible(false);
		
		JButton btn_hakkinda = new JButton("HAKKINDA");
		btn_hakkinda.setBounds(74, 226, 171, 23);
		frame.getContentPane().add(btn_hakkinda);
		btn_hakkinda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				text_hakkýnda.setVisible(true);
			}
		
		});
		
		JButton btn_basla = new JButton("BAÞLA");
		btn_basla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Krptlj_win_01 git =new Krptlj_win_01();
			
				
			}
		});
		btn_basla.setBounds(401, 226, 171, 23);
		frame.getContentPane().add(btn_basla);
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 619, 356);
		background.setIcon(new ImageIcon(img));
		frame.getContentPane().add(background);
	}
	

}
