package Kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PersonelGiris extends JFrame {

	private JPanel contentPane;
	private JTextField txtPersonelId;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelGiris frame = new PersonelGiris();
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
	public PersonelGiris() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPersonelId = new JTextField();
		txtPersonelId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPersonelId.setText(null);
			}
		});
		txtPersonelId.setText("Personel ID Giriniz...");
		txtPersonelId.setForeground(Color.BLACK);
		txtPersonelId.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtPersonelId.setBackground(new Color(255, 255, 255));
		txtPersonelId.setBounds(37, 55, 129, 26);
		contentPane.add(txtPersonelId);
		txtPersonelId.setColumns(10);
		
		JButton btnLogin = new JButton("Giri\u015F");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(109, 156, 129, 23);
		contentPane.add(btnLogin);
		
		JButton btnifremiUnuttum = new JButton("\u015Eifremi Unuttum");
		btnifremiUnuttum.setBounds(109, 190, 129, 23);
		contentPane.add(btnifremiUnuttum);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(36, 92, 130, 26);
		contentPane.add(passwordField);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PersonelGiris.class.getResource("/foto/kjb.Jpeg")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
