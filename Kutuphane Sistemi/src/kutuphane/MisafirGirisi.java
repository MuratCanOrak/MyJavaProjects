package Kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class MisafirGirisi extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdSoyadGiriniz;
	private JTextField txtEmailGiriniz;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MisafirGirisi frame = new MisafirGirisi();
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
	public MisafirGirisi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAdSoyadGiriniz = new JTextField();
		txtAdSoyadGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdSoyadGiriniz.setText(null);
			}
		});
		txtAdSoyadGiriniz.setText("Ad Soyad Giriniz...");
		txtAdSoyadGiriniz.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		txtAdSoyadGiriniz.setForeground(Color.GRAY);
		txtAdSoyadGiriniz.setBounds(37, 59, 120, 30);
		contentPane.add(txtAdSoyadGiriniz);
		txtAdSoyadGiriniz.setColumns(10);
		
		JButton btnGiri = new JButton("Giri\u015F");
		btnGiri.setBounds(127, 179, 89, 23);
		contentPane.add(btnGiri);
		
		txtEmailGiriniz = new JTextField();
		txtEmailGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmailGiriniz.setText(null);
			}
		});
		txtEmailGiriniz.setText("e-mail Giriniz...");
		txtEmailGiriniz.setForeground(Color.GRAY);
		txtEmailGiriniz.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		txtEmailGiriniz.setColumns(10);
		txtEmailGiriniz.setBounds(37, 111, 120, 30);
		contentPane.add(txtEmailGiriniz);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MisafirGirisi.class.getResource("/foto/Ads\u0131zd.png")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
	}

}
