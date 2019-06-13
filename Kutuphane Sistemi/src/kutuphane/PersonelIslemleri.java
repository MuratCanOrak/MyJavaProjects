package kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PersonelIslemleri extends JFrame {

	private JPanel contentPane;
	private JTextField txtAdsoyad;
	private JTextField txtTc;
	private JTextField txtParola;
	private JTextField txtAdress;
	private JTextField txtSoruNo;
	private JTextField txtTelefon;
	private JTextField txtTarih;
	private JTextField txtEmail;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JTextField txtTcNumaras;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonelIslemleri frame = new PersonelIslemleri();
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
	public PersonelIslemleri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		contentPane = new JPanel();
		ButtonGroup x = new ButtonGroup();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Personel Eklemek Icin T\u0131klay\u0131n\u0131z...");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Personel Kald\u0131rmak Icin T\u0131klay\u0131n\u0131z...");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				panel.setVisible(false);
				rdbtnNewRadioButton_1.setBounds(6, 53, 252, 23);
				panel_1.setVisible(true);
			}
		});
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);	
			rdbtnNewRadioButton_1.setBounds(6, 164, 252, 23);
			
			
			}
		});
		rdbtnNewRadioButton.setBounds(6, 25, 252, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		
		rdbtnNewRadioButton_1.setBounds(6, 53, 252, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		x.add(rdbtnNewRadioButton);
		x.add(rdbtnNewRadioButton_1);
		
		
		panel.setBounds(6, 55, 539, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		txtAdsoyad = new JTextField();
		txtAdsoyad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdsoyad.setText(null);
			}
		});
		txtAdsoyad.setText("Ad-Soyad");
		txtAdsoyad.setBounds(10, 11, 95, 33);
		panel.add(txtAdsoyad);
		txtAdsoyad.setColumns(10);
		
		txtTc = new JTextField();
		txtTc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtTc.setText(null);
			}
		});
		txtTc.setText("TC");
		txtTc.setColumns(10);
		txtTc.setBounds(115, 11, 95, 33);
		panel.add(txtTc);
		
		txtParola = new JTextField();
		txtParola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtParola.setText(null);
			}
		});
		txtParola.setText("Parola");
		txtParola.setColumns(10);
		txtParola.setBounds(220, 11, 95, 33);
		panel.add(txtParola);
		
		txtAdress = new JTextField();
		txtAdress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdress.setText(null);
			}
		});
		txtAdress.setText("Adres");
		txtAdress.setColumns(10);
		txtAdress.setBounds(325, 11, 95, 33);
		panel.add(txtAdress);
		
		txtSoruNo = new JTextField();
		txtSoruNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSoruNo.setText(null);
			}
		});
		txtSoruNo.setText("Soru No");
		txtSoruNo.setColumns(10);
		txtSoruNo.setBounds(430, 11, 95, 33);
		panel.add(txtSoruNo);
		
		txtTelefon = new JTextField();
		txtTelefon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefon.setText(null);
			}
		});
		txtTelefon.setText("Telefon");
		txtTelefon.setColumns(10);
		txtTelefon.setBounds(10, 55, 95, 33);
		panel.add(txtTelefon);
		
		txtTarih = new JTextField();
		txtTarih.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTarih.setText(null);
			}
			
		});
		txtTarih.setText("Tarih");
		txtTarih.setColumns(10);
		txtTarih.setBounds(115, 55, 95, 33);
		panel.add(txtTarih);
		
		txtEmail = new JTextField();
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText(null);
			}
		});
		txtEmail.setText("E-Mail");
		txtEmail.setColumns(10);
		txtEmail.setBounds(220, 55, 200, 33);
		panel.add(txtEmail);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(430, 55, 89, 33);
		panel.add(btnNewButton);
		
		panel_1 = new JPanel();
		panel_1.setBounds(6, 85, 539, 50);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		txtTcNumaras = new JTextField();
		txtTcNumaras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtTcNumaras.setText(null);
			}
		});
		txtTcNumaras.setText("TC Numaras\u0131");
		txtTcNumaras.setBounds(10, 11, 126, 28);
		panel_1.add(txtTcNumaras);
		txtTcNumaras.setColumns(10);
		
		
		btnNewButton_1 = new JButton("Kald\u0131r");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(171, 11, 156, 28);
		panel_1.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PersonelIslemleri.class.getResource("/foto/hebele.jpg")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
		
	}
}
