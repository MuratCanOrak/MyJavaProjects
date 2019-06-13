package Kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ParolaUnuttum extends JFrame {

	private JPanel contentPane;
	private JTextField txtTelefonNumaras;
	private JTextField txtCevapGiriniz;
	private JTextField txtTcSon;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParolaUnuttum frame = new ParolaUnuttum();
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
	public ParolaUnuttum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTelefonNumaras = new JTextField();
		txtTelefonNumaras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefonNumaras.setText(null);
			}
		});
		txtTelefonNumaras.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefonNumaras.setText("Telefon Numaras\u0131 Giriniz...");
		txtTelefonNumaras.setForeground(Color.BLACK);
		txtTelefonNumaras.setBounds(39, 44, 186, 31);
		contentPane.add(txtTelefonNumaras);
		txtTelefonNumaras.setColumns(10);
		
		txtCevapGiriniz = new JTextField();
		txtCevapGiriniz.setText("Gizli Soru Cevab\u0131 Giriniz...");
		txtCevapGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtCevapGiriniz.setForeground(Color.BLACK);
		txtCevapGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtCevapGiriniz.setText(null);
				
				
			}
		});
		txtCevapGiriniz.setColumns(10);
		txtCevapGiriniz.setBounds(39, 101, 186, 31);
		contentPane.add(txtCevapGiriniz);
		
		txtTcSon = new JTextField();
		txtTcSon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTcSon.setText(null);
			}
		});
		txtTcSon.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTcSon.setText("TC  Giriniz...");
		txtTcSon.setForeground(Color.BLACK);
		txtTcSon.setColumns(10);
		txtTcSon.setBounds(39, 163, 186, 31);
		contentPane.add(txtTcSon);
		
		btnNewButton = new JButton("Yeni Parola Al");
		btnNewButton.setBounds(145, 225, 116, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ParolaUnuttum.class.getResource("/foto/nmffm.jpg")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
	}
}
