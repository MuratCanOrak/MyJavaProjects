package Tasarim;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import Krptlj_pkt.Krptlj_class;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import Krptlj_pkt.*;

public class Krptlj_win_01 extends JFrame {
	
	private JFrame frame;


	/**
	 * Create the application.
	 */
	public Krptlj_win_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
						
		frame = new JFrame("BINARY DÜNYASI");
		frame.setBounds(100, 100, 635, 395);
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("/binary.png")).getImage();
		frame.getContentPane().setLayout(null);
		
		JTextArea textMetin = new JTextArea();
		JTextArea textSonuc = new JTextArea();
		JButton btn_asci = new JButton("ASCII Karþýlýðýný Getir");
		btn_asci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Krptlj_class c1 = new Krptlj_class(textMetin.getText().length());
				String name = c1.metinCevirenFonk(textMetin.getText());

								
				textSonuc.setText(name);
			}
		});
		btn_asci.setBounds(384, 47, 214, 23);
		frame.getContentPane().add(btn_asci);
		
		JButton btn_bin = new JButton("Binary Karþýlýðýný Getir");
		btn_bin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Krptlj_class c1 = new Krptlj_class(textMetin.getText().length());
				String name = c1.metinCevirenFonk(textMetin.getText());
				String sonuc = c1.cevirmeBin(textMetin.getText());
				textSonuc.setText(sonuc);
			}
		});
		btn_bin.setBounds(384, 104, 214, 23);
		frame.getContentPane().add(btn_bin);
			
				
		JLabel label_sonuc = new JLabel("Sonuç");
		label_sonuc.setBounds(42, 183, 142, 26);
		label_sonuc.setOpaque(true);
		label_sonuc.setHorizontalAlignment(SwingConstants.CENTER);
		label_sonuc.setBackground(Color.lightGray);
		frame.getContentPane().add(label_sonuc);
		label_sonuc.setOpaque(true);
						
			
		JLabel label_metin = new JLabel("Þifrelenecek Metin");
		label_metin.setBounds(42, 11, 142, 26);
		label_metin.setHorizontalAlignment(SwingConstants.CENTER);
		label_metin.setBackground(Color.lightGray);
		frame.getContentPane().add(label_metin);
		label_metin.setOpaque(true);
		
		JButton btn_xor = new JButton("XOR");
		btn_xor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Krptlj_win_10 git =new Krptlj_win_10();
				

				
			}
		});
		btn_xor.setBounds(394, 254, 89, 23);
		btn_xor.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_xor.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn_xor);
		btn_xor.setVisible(false);
		
		JButton btn_or = new JButton("OR");
		btn_or.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Krptlj_win_20 git =new Krptlj_win_20();

			}
		});
		btn_or.setBounds(493, 254, 89, 23);
		btn_or.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_or.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn_or);
		btn_or.setVisible(false);
		
		JButton btn_and = new JButton("AND");
		btn_and.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Krptlj_win_30 git =new Krptlj_win_30();
			

			}
		});
		btn_and.setBounds(394, 288, 89, 23);
		btn_and.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_and.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn_and);
		btn_and.setVisible(false);
		
		JButton btn_vig = new JButton("VÝGENERE");
		btn_vig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Krptlj_win_40 git =new Krptlj_win_40();
				//frame.setVisible(false);

			}
		});
		btn_vig.setBounds(493, 288, 89, 23);
		btn_vig.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn_vig.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(btn_vig);
		btn_vig.setVisible(false);
		

		JButton btn_islem = new JButton("Ýþleme Tabi Tut");
		btn_islem.setBounds(384, 220, 214, 23);
		btn_islem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btn_islem.setText("Ýslem Seçin");
				btn_xor.setVisible(true);
				btn_or.setVisible(true);
				btn_and.setVisible(true);
				btn_vig.setVisible(true);
			}
		});
		frame.getContentPane().add(btn_islem);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 51, 292, 121);
		frame.getContentPane().add(scrollPane);
		
		
		scrollPane.setViewportView(textMetin);
		textMetin.setLineWrap(true);
		textMetin.setWrapStyleWord(true);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(42, 220, 292, 121);
		frame.getContentPane().add(scrollPane_1);
		
		
		
		scrollPane_1.setViewportView(textSonuc);
		textSonuc.setLineWrap(true);
		textSonuc.setWrapStyleWord(true);
		
		JButton btn_hex = new JButton("Hex Karþýlýðýný Getir");
		btn_hex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Krptlj_class c1 = new Krptlj_class(textMetin.getText().length());
				String name = c1.metinCevirenFonk(textMetin.getText());
				String sonuc = c1.cevirmeBin(textMetin.getText());
				String sonuc2= c1.cevirmeHex( textMetin.getText());
			 	textSonuc.setText(sonuc2);
				
			}
		});
		btn_hex.setBounds(384, 149, 214, 23);
		frame.getContentPane().add(btn_hex);
		
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 622, 358);
		background.setIcon(new ImageIcon(img));
		frame.getContentPane().add(background);
		
	}
}
