package kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Uye extends JFrame {

	private JPanel contentPane;
	private JTextField txtKaynakArama;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uye frame = new Uye();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Uye() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtKaynakArama = new JTextField();
		txtKaynakArama.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtKaynakArama.setText(null);
			}
		});
		txtKaynakArama.setText("Kaynak Arama...");
		txtKaynakArama.setBounds(37, 72, 279, 37);
		contentPane.add(txtKaynakArama);
		txtKaynakArama.setColumns(10);
		
		JComboBox comboBox =  new JComboBox();
		comboBox.setBounds(345, 73, 77, 35);
		
		comboBox.addItem("Tümü");
		comboBox.addItem("Ad");
		comboBox.addItem("Yazar");
		comboBox.addItem("Eser ID");
		comboBox.addItem("Tür");
		comboBox.addItem("Alt Tür");
		comboBox.addItem("Sayfa Sayýsý");
		contentPane.add(comboBox);
		JButton btnNewButton = new JButton("Bul");
		btnNewButton.setBounds(432, 75, 89, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Uye.class.getResource("/foto/indir.jpg")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}
