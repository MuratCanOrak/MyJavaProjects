package kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PersonelFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelFrame frame = new PersonelFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public PersonelFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Uye i\u015Flemleri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UyeIslemleri uye = new UyeIslemleri();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(183, 26, 135, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Kaynak \u0130\u015Flemleri");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 KaynakIslemleri k1 = new KaynakIslemleri();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(183, 74, 135, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Ceza Sorgulama");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_2.setBounds(183, 120, 135, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u00D6deme");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_3.setBounds(183, 167, 135, 35);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Kaynak Arama");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Uye y2 = new Uye();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_4.setBounds(183, 213, 135, 35);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Personel Islemleri");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_5.setBounds(183, 259, 135, 35);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblNewLabel.setIcon(new ImageIcon(PersonelFrame.class.getResource("/foto/ima.jpg")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
