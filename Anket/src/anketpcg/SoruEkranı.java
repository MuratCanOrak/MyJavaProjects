package anketpcg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class SoruEkraný extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SoruEkraný frame = new SoruEkraný();
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
	public SoruEkraný() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 770, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(30, 11, 681, 33);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		JRadioButton rb11 = new JRadioButton("");
		rb11.setBounds(30, 67, 109, 23);
		contentPane.add(rb11);
		
		JRadioButton rb12 = new JRadioButton("");
		rb12.setBounds(30, 103, 109, 23);
		contentPane.add(rb12);
		
		JRadioButton rb22 = new JRadioButton("");
		rb22.setBounds(30, 221, 109, 23);
		contentPane.add(rb22);
		
		JRadioButton rb21 = new JRadioButton("");
		rb21.setBounds(30, 185, 109, 23);
		contentPane.add(rb21);
		
		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(30, 129, 681, 33);
		contentPane.add(tf2);
		
		JRadioButton rb32 = new JRadioButton("");
		rb32.setBounds(30, 349, 109, 23);
		contentPane.add(rb32);
		
		JRadioButton rb31 = new JRadioButton("");
		rb31.setBounds(30, 313, 109, 23);
		contentPane.add(rb31);
		
		tf3 = new JTextField();
		tf3.setColumns(10);
		tf3.setBounds(30, 257, 681, 33);
		contentPane.add(tf3);
		
		JButton btnGonder = new JButton("G\u00F6nder");
		btnGonder.setBounds(319, 435, 89, 23);
		contentPane.add(btnGonder);
	}
}
