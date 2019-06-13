package kutuphane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KaynakIslemleri extends JFrame {

	private JPanel contentPane;
	private ButtonGroup x;
	private JTextField txtKitapId;
	private JTextField txtKitapAd;
	private JTextField txtYazarAd;
	private JTextField txtIe;
	private JTextField txtTurId;
	private JTextField txtBaskId;
	private JTextField txtSayfa;
	private JTextField txtRafNo;
	private JTextField txtKitaplkId;
	private JTextField txtBask;
	private JPanel panel_1;
	private JTextField txtKitapId_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KaynakIslemleri frame = new KaynakIslemleri();
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
	public KaynakIslemleri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 387);
		x = new ButtonGroup();
		contentPane = new JPanel();
		
		
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Kaynak Eklemek i\u00E7in t\u0131klay\u0131n\u0131z...");
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Kaynak kald\u0131rmak i\u00E7in t\u0131klay\u0131n\u0131z...");
		rdbtnNewRadioButton_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				panel.setVisible(false);
				rdbtnNewRadioButton_1.setBounds(6, 56, 211, 23);
				panel_1.setVisible(true);
				
			}
		});
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			panel_1.setVisible(false);
				panel.setVisible(true);
				rdbtnNewRadioButton_1.setBounds(6, 210, 211, 23);
				
				
			}
		});
		rdbtnNewRadioButton.setBounds(6, 27, 211, 23);
		contentPane.add(rdbtnNewRadioButton);
	
		rdbtnNewRadioButton_1.setBounds(6, 56, 211, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		x.add(rdbtnNewRadioButton);// Gruba ekledik...
		x.add(rdbtnNewRadioButton_1);
		
		panel_1 = new JPanel();
		panel_1.setBounds(6, 87, 543, 53);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		
		txtKitapId_1 = new JTextField();
		txtKitapId_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtKitapId_1.setText(null);
			}
		});
		txtKitapId_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtKitapId_1.setText(null);
			}
		});
		txtKitapId_1.setText("Kitap ID");
		txtKitapId_1.setBounds(10, 11, 128, 31);
		panel_1.add(txtKitapId_1);
		txtKitapId_1.setColumns(10);
		
		btnNewButton_1 = new JButton("Sil");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton_1.setBounds(173, 11, 138, 31);
		panel_1.add(btnNewButton_1);
		
		
		panel.setBounds(6, 57, 543, 142);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setVisible(false);
		
		txtKitapId = new JTextField();
		txtKitapId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtKitapId.setText(null);
			}
		});
		txtKitapId.setText("Kitap ID");
		txtKitapId.setBounds(10, 11, 100, 33);
		panel.add(txtKitapId);
		txtKitapId.setColumns(10);
		
		txtKitapAd = new JTextField();
		txtKitapAd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtKitapAd.setText(null);
			}
		});
		txtKitapAd.setText("Kitap Ad");
		txtKitapAd.setBounds(120, 11, 100, 33);
		panel.add(txtKitapAd);
		txtKitapAd.setColumns(10);
		
		txtYazarAd = new JTextField();
		txtYazarAd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtYazarAd.setText(null);
			}
		});
		txtYazarAd.setText("Yazar Ad");
		txtYazarAd.setBounds(230, 11, 100, 33);
		panel.add(txtYazarAd);
		txtYazarAd.setColumns(10);
		
		txtIe = new JTextField();
		txtIe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIe.setText(null);
			}
		});
		txtIe.setText("\u0130\u00E7erik ID");
		txtIe.setBounds(340, 11, 100, 33);
		panel.add(txtIe);
		txtIe.setColumns(10);
		
		txtTurId = new JTextField();
		txtTurId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTurId.setText(null);
			}
		});
		txtTurId.setText("Tur ID");
		txtTurId.setBounds(450, 11, 86, 33);
		panel.add(txtTurId);
		txtTurId.setColumns(10);
		
		txtBaskId = new JTextField();
		txtBaskId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtBaskId.setText(null);
			}
		});
		txtBaskId.setText("Bask\u0131 ID");
		txtBaskId.setBounds(10, 55, 100, 33);
		panel.add(txtBaskId);
		txtBaskId.setColumns(10);
		
		txtSayfa = new JTextField();
		txtSayfa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtSayfa.setText(null);
			}
		});
		txtSayfa.setText("Sayfa Sayýsý");
		txtSayfa.setBounds(120, 55, 100, 33);
		panel.add(txtSayfa);
		txtSayfa.setColumns(10);
		
		txtRafNo = new JTextField();
		txtRafNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtRafNo.setText(null);
			}
		});
		txtRafNo.setText("Raf No");
		txtRafNo.setBounds(230, 55, 100, 33);
		panel.add(txtRafNo);
		txtRafNo.setColumns(10);
		
		txtKitaplkId = new JTextField();
		txtKitaplkId.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtKitaplkId.setText(null);
			}
		});
		txtKitaplkId.setText("Kitapl\u0131k ID");
		txtKitaplkId.setBounds(340, 55, 100, 33);
		panel.add(txtKitaplkId);
		txtKitaplkId.setColumns(10);
		
		txtBask = new JTextField();
		txtBask.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtBask.setText(null);
			}
		});
		txtBask.setText("Bask\u0131");
		txtBask.setBounds(450, 55, 86, 33);
		panel.add(txtBask);
		txtBask.setColumns(10);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(418, 100, 115, 33);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(KaynakIslemleri.class.getResource("/foto/er.jpg")));
		lblNewLabel.setBounds(0, 0, 559, 348);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
		setLocationRelativeTo(null);
		
	}
}
