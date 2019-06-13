package kutuphane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.sql.Statement;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UyeGirisi extends JFrame {

	private Connection con = null;
	private Statement st;  //sql
	private ResultSet rs;

	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	private JPanel contentPane;
	private JTextField txtUyeGiriiIin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { UyeGirisi frame = new UyeGirisi();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */
	/**
	 * Create the frame.
	 */
	
	public void connection() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/deneme";
			con = DriverManager.getConnection(url, "root", "");
			System.out.println("baglantý tmm");

		} catch (Exception e) {
			System.out.println("error : " + e);

		}
	}
	
	public void checkUye(String id, String parola) {
		connection();
		String passwd = null;
		try {
			
			String query = "select * from uye where TC = "+ id +";";
			Statement statement = (Statement) con.createStatement();
			ResultSet result = statement.executeQuery(query);
			while (result.next()) { 
				passwd = result.getString("parola");
						
			}
		
			
		} catch (Exception exc) {

			exc.printStackTrace();
		}
		
		if(passwd.equals(parola))
		{
			System.out.println("login frame");
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Yanlýs TC veya Parola girdiniz...");
		}

	}

	public UyeGirisi() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUyeGiriiIin = new JTextField();
		txtUyeGiriiIin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUyeGiriiIin.setText("");
				txtUyeGiriiIin.setForeground(Color.BLACK);
				txtUyeGiriiIin.setFont(new Font("Tahoma", Font.PLAIN, 11));
			}
		});
		txtUyeGiriiIin.setForeground(Color.GRAY);
		txtUyeGiriiIin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		txtUyeGiriiIin.setText("Uye ID giriniz...");

		txtUyeGiriiIin.setBackground(Color.WHITE);
		txtUyeGiriiIin.setBounds(10, 43, 176, 32);
		contentPane.add(txtUyeGiriiIin);
		txtUyeGiriiIin.setColumns(10);

		JButton btnNewButton = new JButton("Giris");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				checkUye(txtUyeGiriiIin.getText(),passwordField.getText());
				System.out.println("dene");

			}
		});

		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setToolTipText("Giris");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.setBounds(46, 199, 140, 32);
		contentPane.add(btnNewButton);

		passwordField = new JPasswordField();
		passwordField.setForeground(Color.GRAY);
		passwordField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		passwordField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				passwordField.setEchoChar('*');
				passwordField.setText(null);
				passwordField.setForeground(Color.BLACK);
				passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
			}
		});
		passwordField.setColumns(10);
		passwordField.setBackground(Color.WHITE);
		passwordField.setEchoChar((char) 0);
		passwordField.setText("Paralo Giriniz...");
		passwordField.setBounds(10, 126, 176, 37);

		contentPane.add(passwordField);

		JButton btnNewButton_1 = new JButton("\u015Eifremi Unuttum");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setToolTipText("Sifremi unuttum");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnNewButton_1.setBounds(46, 261, 140, 32);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setIcon(new ImageIcon(UyeGirisi.class.getResource("/foto/ican2.jpg")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
	}
}
