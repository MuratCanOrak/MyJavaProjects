package oyun;

import java.awt.BorderLayout;
import image.*;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame_01 extends JFrame {

	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame_01 frame = new Frame_01();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame_01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_img_1 = new JLabel("");
		lbl_img_1.setBounds(10, 11, 232, 232);
		contentPane.add(lbl_img_1);
		
		JLabel lbl_img_2 = new JLabel("");
		lbl_img_2.setBounds(311, 33, 217, 209);
		contentPane.add(lbl_img_2);
		
		JLabel lbl_isim_01 = new JLabel("zar ismi");
		lbl_isim_01.setBounds(62, 316, 46, 14);
		contentPane.add(lbl_isim_01);
		
	/*	JLabel lbl_isim_02 = new JLabel("zar ismi");
		lbl_isim_02.setBounds(392, 316, 46, 14);
		contentPane.add(lbl_isim_02);*/
		
		JLabel lbl_isim_02 = new JLabel("se");
		lbl_isim_02.setBounds(392, 316, 46, 14);
		contentPane.add(lbl_isim_02);
		
		JLabel lbl_num_01 = new JLabel("numara");
		lbl_num_01.setBounds(62, 358, 46, 14);
		contentPane.add(lbl_num_01);
		
		JLabel lbl_num_02 = new JLabel("numara");
		lbl_num_02.setBounds(392, 358, 46, 14);
		contentPane.add(lbl_num_02);
		
		 
		Image img1 = new ImageIcon(this.getClass().getResource("zar_1.png")).getImage();                       //                "zar_2.jpg"
		Image img2 = new ImageIcon(this.getClass().getResource("zar_2.jpg")).getImage();
		Image img3 = new ImageIcon(this.getClass().getResource("zar_3.jpg")).getImage();
		Image img4 = new ImageIcon(this.getClass().getResource("zar_4.jpg")).getImage();
		Image img5 = new ImageIcon(this.getClass().getResource("zar_5.jpg")).getImage();
		Image img6 = new ImageIcon(this.getClass().getResource("zar_6.jpg")).getImage();
		
		
		String[] sayilar = {"1","2","3","4","5","6"};
		String[] isimler ={"yek","dü","se","cihar","penç","þeþ"};
		Image[] image = {img1,img2,img3,img4,img5,img6};
		
		Random rnd = new Random();
		int rand = rnd.nextInt(6);
		int rand2 = rnd.nextInt(6);
		
		lbl_img_1.setIcon(new ImageIcon(image[rand]));
		lbl_img_2.setIcon(new ImageIcon(image[rand2]) );
		
		
		lbl_isim_01.setText(isimler[rand]);
		lbl_isim_02.setText(isimler[rand2]);
		
		lbl_num_01.setText(sayilar[rand]);
		lbl_num_02.setText(sayilar[rand2]);
		
		JButton btnTekrar = new JButton("TEKRAR");
		btnTekrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int rand = rnd.nextInt(6);
				int rand2 = rnd.nextInt(6);
				
				lbl_img_1.setIcon(new ImageIcon(image[rand]));
				lbl_img_2.setIcon(new ImageIcon(image[rand2]) );
				
				
				lbl_isim_01.setText(isimler[rand]);
				lbl_isim_02.setText(isimler[rand2]);
				
				lbl_num_01.setText(sayilar[rand]);
				lbl_num_02.setText(sayilar[rand2]);
			}
		});
		btnTekrar.setBounds(508, 343, 89, 23);
		contentPane.add(btnTekrar);
		

		
	}
	

}
