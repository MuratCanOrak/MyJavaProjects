package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class GirisSayfasi extends JFrame {

	private JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisSayfasi frame = new GirisSayfasi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public GirisSayfasi() {
		setTitle("BÝLGÝSAYAR TOPLAMA SÝHÝRBAZI");
		initialize();
	}
	
	
	private void initialize() {
				
		setBounds(-7, 0, 1650,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBaslik = new JLabel("BÝLGÝSAYAR TOPLAMA SÝHÝRBAZI");
		lblBaslik.setHorizontalTextPosition(SwingConstants.CENTER);
		lblBaslik.setHorizontalAlignment(SwingConstants.CENTER);
		lblBaslik.setForeground(Color.BLACK);
		lblBaslik.setBackground(new Color(200, 75, 94));
		lblBaslik.setOpaque(true);
		lblBaslik.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 30));
		lblBaslik.setBounds(453, 208, 473, 54);
		lblBaslik.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblBaslik);
		
		
		
		JLabel lblAltBaslik = new JLabel("Bir segment seçiniz");
		lblAltBaslik.setHorizontalTextPosition(SwingConstants.CENTER);
		lblAltBaslik.setHorizontalAlignment(SwingConstants.CENTER);	
		lblAltBaslik.setForeground(Color.BLACK);
		lblAltBaslik.setBackground(new Color(230, 75, 94));
		lblAltBaslik.setOpaque(true);
		lblAltBaslik.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 20));	
		lblAltBaslik.setBounds(573, 356, 219, 37);
		lblAltBaslik.setBorder(BorderFactory.createLineBorder(Color.black));
		contentPane.add(lblAltBaslik);
		
		
		
		JButton btnNewButton = new JButton("Giriþ Seviye");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GirisSeviye git = new GirisSeviye();
				git.setVisible(true);
			}
		});
		btnNewButton.setBounds(427, 474, 147, 37);
		contentPane.add(btnNewButton);
		
		JButton btnOrtaSeviye = new JButton("Orta Seviye");
		btnOrtaSeviye.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		btnOrtaSeviye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrtaSeviye git = new OrtaSeviye();
				git.setVisible(true);
			}
		});
		btnOrtaSeviye.setBounds(779, 474, 147, 37);
		contentPane.add(btnOrtaSeviye);
		
		JButton btnYksekSeviye = new JButton("Yüksek Seviye");
		btnYksekSeviye.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		btnYksekSeviye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YuksekSeviye git = new YuksekSeviye();
				git.setVisible(true);
			}
		});
		btnYksekSeviye.setBounds(427, 547, 147, 37);
		contentPane.add(btnYksekSeviye);
		
		JButton btnProfesyonel = new JButton("Profesyonel");
		btnProfesyonel.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		btnProfesyonel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Profesyonel git = new Profesyonel();
				git.setVisible(true);
			}
		});
		btnProfesyonel.setBounds(779, 547, 147, 37);
		contentPane.add(btnProfesyonel);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(GirisSayfasi.class.getResource("/img/bilg6.jpg")));
		lblBackground.setBounds(0, 0, 1370, 749);
		contentPane.add(lblBackground);
		
		
	}
}
