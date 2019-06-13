package kutuphane;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class UyeIslemleri extends JFrame {

	
	private JPanel contentPane;
	private JTextField txtAdsoyad;
	private JPanel panel_1;
	private JTextField txtTcNoGiriniz;
	private JTextField txtTelefonGiriniz;
	private JTextField txtAdsoyadGririniz;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_1_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JTextField txtTc;
	private JTextField txtEmail;
	private JTextField txtTelefon;
	private JTextField txtParola;
	private JTextField txtTarih;
	private JTextField txtAdres;
	private JTextField txtSoruNo;
	private JTextField txtHackId;
	private JTextField txtGeciktirmeId;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UyeIslemleri frame = new UyeIslemleri();
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
	public UyeIslemleri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		ButtonGroup x = new ButtonGroup();
		JRadioButton rdbtnUyeEklemekIin = new JRadioButton("Uye eklemek i\u00E7in t\u0131klay\u0131n\u0131z...");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Uye kald\u0131rmak i\u00E7in t\u0131klay\u0131n\u0131z...");
		rdbtnNewRadioButton_2 = new JRadioButton("Uye listesi i\u00E7in t\u0131klay\u0131n\u0131z...");
		rdbtnNewRadioButton_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(false);
				rdbtnNewRadioButton.setBounds(22, 68, 205, 23);
				rdbtnNewRadioButton_2.setBounds(22, 102, 214, 23);
				UyeListele u1 = new UyeListele();
			}
		});

		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				panel.setVisible(false);
				panel_1.setVisible(true);
				rdbtnNewRadioButton.setBounds(22, 68, 205, 23);
				rdbtnNewRadioButton_2.setBounds(22, 240, 205, 23);
				
			}
		});
		rdbtnUyeEklemekIin.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				panel_1.setVisible(false);
				panel.setVisible(true);
				rdbtnNewRadioButton.setBounds(22, 220, 205, 23);
				rdbtnNewRadioButton_2.setBounds(22, 260, 205, 23);
				
			}
			
		});
		rdbtnUyeEklemekIin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnUyeEklemekIin.setBounds(23, 32, 204, 23);
		contentPane.add(rdbtnUyeEklemekIin);
		
		
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		rdbtnNewRadioButton.setBounds(22, 68, 205, 23);
		contentPane.add(rdbtnNewRadioButton);
		x.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton_2.setBounds(22, 102, 204, 23);
		x.add(rdbtnNewRadioButton_2);
		contentPane.add(rdbtnNewRadioButton_2);
		
		
		panel_1.setBounds(23, 100, 513, 99);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtTcNoGiriniz = new JTextField();
		txtTcNoGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtTcNoGiriniz.setText(null);
			}
		});
		txtTcNoGiriniz.setText("Tc No Giriniz...");
		txtTcNoGiriniz.setBounds(10, 11, 105, 32);
		panel_1.add(txtTcNoGiriniz);
		txtTcNoGiriniz.setColumns(10);
		
		txtTelefonGiriniz = new JTextField();
		txtTelefonGiriniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefonGiriniz.setText(null);
			}
		});
		txtTelefonGiriniz.setText("Telefon Giriniz...");
		txtTelefonGiriniz.setBounds(125, 11, 105, 32);
		panel_1.add(txtTelefonGiriniz);
		txtTelefonGiriniz.setColumns(10);
		
		txtAdsoyadGririniz = new JTextField();
		txtAdsoyadGririniz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdsoyadGririniz.setText(null);
			}
		});
		txtAdsoyadGririniz.setText("Ad-Soyad Giriniz...");
		txtAdsoyadGririniz.setBounds(240, 11, 105, 32);
		panel_1.add(txtAdsoyadGririniz);
		txtAdsoyadGririniz.setColumns(10);
		
		btnNewButton_1 = new JButton("Check-Delete");
		btnNewButton_1.setBounds(373, 11, 115, 32);
		panel_1.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("Yukardaki se\u00E7eneklerdenr birini girmeniz yeterlidir...");
		lblNewLabel_1.setBounds(10, 54, 306, 23);
		panel_1.setVisible(false);
		panel_1.add(lblNewLabel_1);
		
		rdbtnNewRadioButton_1_1 = new JRadioButton("Uyeleri listelemek i\u00E7in t\u0131klay\u0131n\u0131z...");
		rdbtnNewRadioButton_1_1.setBounds(0, 7, 202, 23);
		
		
		
		panel.setBounds(23, 60, 513, 142);
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
		txtAdsoyad.setBounds(10, 11, 105, 30);
		panel.add(txtAdsoyad);
		
		txtAdsoyad.setColumns(10);
		
		JButton btnNewButton = new JButton("Check-Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(355, 93, 105, 30);
		panel.add(btnNewButton);
		
		txtTc = new JTextField();
		txtTc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTc.setText(null);
			}
		});
		txtTc.setText("TC");
		txtTc.setColumns(10);
		txtTc.setBounds(125, 11, 105, 30);
		panel.add(txtTc);
		
		txtEmail = new JTextField();
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText(null);
			}
		});
		txtEmail.setText("E-Mail");
		txtEmail.setColumns(10);
		txtEmail.setBounds(240, 11, 105, 30);
		panel.add(txtEmail);
		
		txtTelefon = new JTextField();
		txtTelefon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelefon.setText(null);

			}
		});
		txtTelefon.setText("Telefon");
		txtTelefon.setColumns(10);
		txtTelefon.setBounds(355, 11, 105, 30);
		panel.add(txtTelefon);
		
		txtParola = new JTextField();
		txtParola.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtParola.setText("Telefon");

			}
		});
		txtParola.setText("Parola");
		txtParola.setColumns(10);
		txtParola.setBounds(10, 52, 105, 30);
		panel.add(txtParola);
		
		txtTarih = new JTextField();
		txtTarih.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTarih.setText(null);

			}
		});
		txtTarih.setText("Tarih");
		txtTarih.setColumns(10);
		txtTarih.setBounds(125, 52, 105, 30);
		panel.add(txtTarih);
		
		txtAdres = new JTextField();
		txtAdres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAdres.setText(null);

			}
		});
		txtAdres.setText("Adres");
		txtAdres.setColumns(10);
		txtAdres.setBounds(240, 52, 220, 30);
		panel.add(txtAdres);
		
		txtSoruNo = new JTextField();
		txtSoruNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSoruNo.setText(null);
			}
		});
		txtSoruNo.setText("Soru No");
		txtSoruNo.setColumns(10);
		txtSoruNo.setBounds(10, 93, 105, 30);
		panel.add(txtSoruNo);
		
		txtHackId = new JTextField();
		txtHackId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHackId.setText(null);

			}
		});
		txtHackId.setText("Hack id");
		txtHackId.setColumns(10);
		txtHackId.setBounds(125, 93, 105, 30);
		panel.add(txtHackId);
		
		txtGeciktirmeId = new JTextField();
		txtGeciktirmeId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtGeciktirmeId.setText(null);

			}
		});
		txtGeciktirmeId.setText("Geciktirme id");
		txtGeciktirmeId.setColumns(10);
		txtGeciktirmeId.setBounds(240, 93, 105, 30);
		panel.add(txtGeciktirmeId);
		
		
		x.add(rdbtnUyeEklemekIin);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 559, 348);
		lblNewLabel.setIcon(new ImageIcon(UyeIslemleri.class.getResource("/foto/kitaplar-okumak.png")));
		contentPane.add(lblNewLabel);
		setVisible(true);
		setLocationRelativeTo(null);
		
		
	}
}
