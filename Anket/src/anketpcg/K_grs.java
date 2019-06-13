package anketpcg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class K_grs extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullancAd;
	private JTextField txtParola;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					K_grs frame = new K_grs();
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
	public K_grs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		txtKullancAd = new JTextField();
		txtKullancAd.setText("Kullan\u0131c\u0131 Ad\u0131:");
		txtKullancAd.setBounds(110, 150, 86, 20);
		contentPane.add(txtKullancAd);
		txtKullancAd.setColumns(10);
		
		txtParola = new JTextField();
		txtParola.setText("Parola:");
		txtParola.setBounds(110, 206, 86, 20);
		contentPane.add(txtParola);
		txtParola.setColumns(10);
		
		JTextArea taKadi = new JTextArea();
		taKadi.setBounds(241, 150, 152, 20);
		contentPane.add(taKadi);
		
		JTextArea taParola = new JTextArea();
		taParola.setBounds(241, 209, 152, 20);
		contentPane.add(taParola);
		
		JButton btnGiris = new JButton("Giri\u015F");
		btnGiris.setBounds(304, 285, 89, 23);
		contentPane.add(btnGiris);
		
	}
}
