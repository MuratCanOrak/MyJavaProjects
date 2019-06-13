package kutuphane;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;

public class GirisFrame {
	Connection conn;
    PreparedStatement psmt;
	private JFrame frame;
	private UyeGirisi uye;
	int a ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GirisFrame window = new GirisFrame();
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
	public GirisFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		
		frame.setResizable(false);
		frame.setBounds(100, 100, 575, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u00DCye Giri\u015Fi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				uye = new UyeGirisi();
				
				uye.setCount(a++);
				uye.setLocationRelativeTo(null);
				uye.setVisible(true);
				
				
				
			}
		});
		btnNewButton.setToolTipText("Uye giri\u015Fi i\u00E7in t\u0131klay\u0131n\u0131z...");
		btnNewButton.setBackground(new Color(0, 250, 154));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(25, 70, 135, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Misafir Giri\u015Fi");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setToolTipText("Misafir giri\u015Fi i\u00E7in t\u0131klay\u0131n\u0131z...");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBackground(new Color(139, 0, 0));
		btnNewButton_1.setBounds(25, 157, 135, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Personel Giri\u015Fi");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PersonelFrame p1 = new PersonelFrame();
			}
		});
		btnNewButton_2.setToolTipText("Personel  giri\u015Fi i\u00E7in t\u0131klay\u0131n\u0131z...");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_2.setBackground(new Color(0, 128, 0));
		btnNewButton_2.setBounds(25, 238, 135, 34);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(GirisFrame.class.getResource("/foto/iconn.jpg")));
		lblNewLabel.setBounds(0, 0, 569, 359);
		frame.getContentPane().add(lblNewLabel);
	}

}
