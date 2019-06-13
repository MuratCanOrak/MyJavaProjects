package Tasarim;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import Krptlj_pkt.Krptlj_class;

public class Krptlj_win_20 {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public Krptlj_win_20() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
			
		frame = new JFrame("OR ÝLE ÞÝFRELEME");
		frame.setBounds(100, 100, 635, 395);
		frame.setVisible(true);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image img = new ImageIcon(this.getClass().getResource("/bin_or.jpg")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/or.jpg")).getImage();
		
		
		
		
		
		
		
		JTextArea textMetin = new JTextArea();
		textMetin.setBounds(42, 51, 292, 121);
		frame.getContentPane().add(textMetin);
		textMetin.setLineWrap(true);
		textMetin.setWrapStyleWord(true);
		
		
		JTextArea textSonuc = new JTextArea();
		textSonuc.setBounds(42, 220, 292, 121);
		frame.getContentPane().add(textSonuc);
		textSonuc.setLineWrap(true);
		textSonuc.setWrapStyleWord(true);
		
		JTextArea textKey = new JTextArea();
		textKey.setBounds(366, 51, 232, 87);
		frame.getContentPane().add(textKey);
		textKey.setLineWrap(true);
		
		JButton btn_asci = new JButton("OR Ýþlemini Gerçekleþtir");
		btn_asci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Krptlj_class c1 = new Krptlj_class(textMetin.getText().length());
				String name = c1.metinCevirenFonk(textMetin.getText());
				String sonuc = c1.cevirmeBin(textMetin.getText());
				String sonuc2= c1.cevirmeHex( textMetin.getText());
				String sonuc3=c1.xor(textMetin.getText(),Integer.parseInt(textKey.getText()));
				String sonuc4=c1.or(textMetin.getText(),Integer.parseInt(textKey.getText()));
			 	textSonuc.setText(sonuc4);
			}
		});
		btn_asci.setBounds(366, 149, 232, 23);
		frame.getContentPane().add(btn_asci);
		
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
		
		JLabel label_key = new JLabel("Key");
		label_key.setOpaque(true);
		label_key.setHorizontalAlignment(SwingConstants.CENTER);
		label_key.setBackground(Color.LIGHT_GRAY);
		label_key.setBounds(366, 11, 142, 26);
		frame.getContentPane().add(label_key);
		
	
		
		JLabel label = new JLabel("");
		label.setBounds(219, 177, 59, 40);
		frame.getContentPane().add(label);
		label.setIcon(new ImageIcon(img2));
		
		
		
		JLabel background = new JLabel("");
		background.setBounds(0, 0, 619, 356);
		frame.getContentPane().add(background);
		background.setIcon(new ImageIcon(img));
		


		
		
		
		
		
		
		
		
		
		
	}

}
