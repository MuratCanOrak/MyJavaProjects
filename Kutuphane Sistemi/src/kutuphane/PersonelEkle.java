package Kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PersonelEkle extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdSoyadGiriniz;
	private JTextField txtTcGiriniz;
	private JTextField txtTelefonGiriniz;
	private JTextField txtAdresGiriniz;
	private JTextField txtDepartmannzGiriniz;
	private JTextField txtEmailGiriniz;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelEkle frame = new PersonelEkle();
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
	public PersonelEkle() {
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
		txtAdSoyadGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtAdSoyadGiriniz.setForeground(Color.BLACK);
		txtAdSoyadGiriniz.setBounds(31, 23, 126, 20);
		contentPane.add(txtAdSoyadGiriniz);
		txtAdSoyadGiriniz.setColumns(10);
		
		JButton btnNewButton = new JButton("Personel Ekle");
		btnNewButton.setBounds(127, 266, 120, 23);
		contentPane.add(btnNewButton);
		
		txtTcGiriniz = new JTextField();
		txtTcGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTcGiriniz.setText(null);
			}
		});
		txtTcGiriniz.setText("TC Giriniz...");
		txtTcGiriniz.setForeground(Color.BLACK);
		txtTcGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTcGiriniz.setColumns(10);
		txtTcGiriniz.setBounds(31, 116, 126, 20);
		contentPane.add(txtTcGiriniz);
		
		txtTelefonGiriniz = new JTextField();
		txtTelefonGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefonGiriniz.setText(null);
			}
		});
		txtTelefonGiriniz.setText("Telefon Giriniz...");
		txtTelefonGiriniz.setForeground(Color.BLACK);
		txtTelefonGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtTelefonGiriniz.setColumns(10);
		txtTelefonGiriniz.setBounds(31, 204, 126, 20);
		contentPane.add(txtTelefonGiriniz);
		
		txtAdresGiriniz = new JTextField();
		txtAdresGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdresGiriniz.setText(null);
			}
		});
		txtAdresGiriniz.setText("Adres Giriniz...");
		txtAdresGiriniz.setForeground(Color.BLACK);
		txtAdresGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtAdresGiriniz.setColumns(10);
		txtAdresGiriniz.setBounds(31, 147, 126, 20);
		contentPane.add(txtAdresGiriniz);
		
		txtDepartmannzGiriniz = new JTextField();
		txtDepartmannzGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDepartmannzGiriniz.setText(null);
			}
		});
		txtDepartmannzGiriniz.setText("Departman Giriniz...");
		txtDepartmannzGiriniz.setForeground(Color.BLACK);
		txtDepartmannzGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtDepartmannzGiriniz.setColumns(10);
		txtDepartmannzGiriniz.setBounds(31, 178, 126, 20);
		contentPane.add(txtDepartmannzGiriniz);
		
		txtEmailGiriniz = new JTextField();
		txtEmailGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmailGiriniz.setText(null);
			}
		});
		txtEmailGiriniz.setText("e-mail Giriniz...");
		txtEmailGiriniz.setForeground(Color.BLACK);
		txtEmailGiriniz.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEmailGiriniz.setColumns(10);
		txtEmailGiriniz.setBounds(31, 235, 126, 20);
		contentPane.add(txtEmailGiriniz);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(31, 54, 126, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(31, 85, 126, 20);
		contentPane.add(passwordField_1);
	}
}
