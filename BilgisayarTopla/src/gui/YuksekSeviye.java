package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class YuksekSeviye extends JFrame {
	
	public String fiyat="";
	double anaToplam = 0;
    public String fiyat_il;
    public String soket= "";
    public String soket1= "";
    public String soket_il="";
	
	private JPanel contentPane;
	
	//Baglanti bag = new Baglanti();

	public String getIliski() {
		return fiyat_il;
	}

	public void setIliski(String iliski) {
		this.fiyat_il = iliski;
	}

	public YuksekSeviye() {
		
		setTitle("YÜKSEK SEVÝYE BÝLGÝSAYAR TOPLAMA");
	
				
		setBounds(-7, 0, 1650,1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JLabel lblKasa = new JLabel("KASA");
		lblKasa.setBounds(10, 598, 118, 20);
		contentPane.add(lblKasa);
				
		JLabel lblIslemci = new JLabel("ÝÞLEMCÝ");
		lblIslemci.setBounds(10, 22, 118, 20);
		contentPane.add(lblIslemci);
		
		JLabel lblAnakart = new JLabel("ANAKART");
		lblAnakart.setBounds(10, 106, 118, 20);
		contentPane.add(lblAnakart);
		
		JLabel lblRam = new JLabel("RAM");
		lblRam.setBounds(10, 198, 118, 20);
		contentPane.add(lblRam);
				
		JLabel lblEkranKart = new JLabel("EKRAN KARTI");
		lblEkranKart.setBounds(10, 278, 118, 20);
		contentPane.add(lblEkranKart);
		
		JLabel lblSabitDisk = new JLabel("SABÝT DÝSK");
		lblSabitDisk.setBounds(10, 358, 118, 20);
		contentPane.add(lblSabitDisk);
		
		JLabel lblGucKaynagý = new JLabel("GÜÇ KAYNAÐI");
		lblGucKaynagý.setBounds(10, 438, 118, 20);
		contentPane.add(lblGucKaynagý);
		
		JLabel lblIslemciSogutucu = new JLabel("ÝÞLEMCÝ SOÐUTUCU");
		lblIslemciSogutucu.setBounds(10, 518, 118, 20);
		contentPane.add(lblIslemciSogutucu);
		
		
		
		JLabel lblOzRam = new JLabel("");
		lblOzRam.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzRam.setBounds(138, 219, 463, 60);
		contentPane.add(lblOzRam);
		
		
		JLabel lblOzEkranKarti = new JLabel("");
		lblOzEkranKarti.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzEkranKarti.setBounds(138, 299, 463, 60);
		contentPane.add(lblOzEkranKarti);
		
		JLabel lblOzSabitDisk = new JLabel("");
		lblOzSabitDisk.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzSabitDisk.setBounds(138, 379, 463, 60);
		contentPane.add(lblOzSabitDisk);
		
		JLabel lblOzGucKaynagi = new JLabel("");
		lblOzGucKaynagi.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzGucKaynagi.setBounds(138, 459, 463, 60);
		contentPane.add(lblOzGucKaynagi);
		
		JLabel lblOzIslemciSog = new JLabel("");
		lblOzIslemciSog.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzIslemciSog.setBounds(138, 539, 463, 60);
		contentPane.add(lblOzIslemciSog);
		
		JLabel lblOzKasa = new JLabel("");
		lblOzKasa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzKasa.setBounds(138, 619, 463, 60);
		contentPane.add(lblOzKasa);
		
		JLabel lblOzAnakart = new JLabel("");
		lblOzAnakart.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzAnakart.setBounds(138, 128, 463, 64);
		contentPane.add(lblOzAnakart);
		
		JLabel lblOzIslemci = new JLabel("");
		lblOzIslemci.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOzIslemci.setBounds(138, 43, 463, 60);
		contentPane.add(lblOzIslemci);
		
		
		
		
		JLabel lblFiyIslemci = new JLabel("");
		lblFiyIslemci.setBounds(632, 22, 96, 20);
		contentPane.add(lblFiyIslemci);
				
		JLabel lblFiyRam = new JLabel("");
		lblFiyRam.setBounds(632, 198, 96, 20);
		contentPane.add(lblFiyRam);
		
		JLabel lblFiyEkranKarti = new JLabel("");
		lblFiyEkranKarti.setBounds(632, 278, 96, 20);
		contentPane.add(lblFiyEkranKarti);
		
		JLabel lblFiySabitDisk = new JLabel("");
		lblFiySabitDisk.setBounds(632, 358, 96, 20);
		contentPane.add(lblFiySabitDisk);
		
		JLabel lblFiyGucKaynagi = new JLabel("");
		lblFiyGucKaynagi.setBounds(632, 438, 96, 20);
		contentPane.add(lblFiyGucKaynagi);
		
		JLabel lblFiyIslemciSog = new JLabel("");
		lblFiyIslemciSog.setBounds(632, 518, 96, 20);
		contentPane.add(lblFiyIslemciSog);
		
		JLabel lblFiyKasa = new JLabel("");
		lblFiyKasa.setBounds(632, 598, 96, 20);
		contentPane.add(lblFiyKasa);
			
		JLabel lblFiyAnakart = new JLabel("");
		lblFiyAnakart.setBounds(632, 106, 96, 20);
		contentPane.add(lblFiyAnakart);
		
		JLabel lblToplam = new JLabel("");
		lblToplam.setBounds(927, 660, 118, 32);
		contentPane.add(lblToplam);
		
		
		
		
		JComboBox cbIslemci = new JComboBox();
		
		cbIslemci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbIslemci, lblFiyIslemci,"islemci");
				
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbIslemci.setBounds(138, 22, 463, 20);
		contentPane.add(cbIslemci);
		
		
		
		
		
		JComboBox cbRam = new JComboBox();
		cbRam.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbRam, lblFiyRam,"ram");
			
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbRam.setBounds(138, 198, 463, 20);
		contentPane.add(cbRam);
		
		
		
		JComboBox cbEkranKarti = new JComboBox();
		cbEkranKarti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbEkranKarti, lblFiyEkranKarti,"ekrankarti");
			
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbEkranKarti.setBounds(138, 278, 463, 20);
		contentPane.add(cbEkranKarti);
		
		
		
		
		JComboBox cbSabitDisk = new JComboBox();
		cbSabitDisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbSabitDisk, lblFiySabitDisk,"sabitdisk");
			
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbSabitDisk.setBounds(138, 358, 463, 20);
		contentPane.add(cbSabitDisk);
		
		
		
		
		JComboBox cbGucKaynagi = new JComboBox();
		cbGucKaynagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbGucKaynagi, lblFiyGucKaynagi,"powersupply");
			
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbGucKaynagi.setBounds(138, 438, 463, 20);
		contentPane.add(cbGucKaynagi);
		
		
		
		
		
		JComboBox cbKasa = new JComboBox();
		cbKasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbKasa, lblFiyKasa,"kasa");
			
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbKasa.setBounds(138, 598, 463, 20);
		contentPane.add(cbKasa);
		

		JComboBox cbIslemciSog = new JComboBox();
		cbIslemciSog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelFiyat(cbIslemciSog, lblFiyIslemciSog,"sogutucu");
			
				anaToplam += StringDonustur(fiyat);
			}
		});
		cbIslemciSog.setBounds(138, 518, 463, 20);
		contentPane.add(cbIslemciSog);
	
		
		JComboBox cbAnakart = new JComboBox();
				cbAnakart.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				doldurLabelFiyat(cbAnakart, lblFiyAnakart,"anakart");
			   
				anaToplam += StringDonustur(fiyat);
	
			}
		});
		cbAnakart.setBounds(138, 106, 463, 20);
		contentPane.add(cbAnakart);
	
		
		
		doldurComboBox("select Model from islemci where Fiyat<1549 && Fiyat>1305", cbIslemci);//ComboBox'a DB'den veri çekme iþlemi yapan fonksiyon
		
		//soket1 =soketCek(cbIslemci, "islemci");
		
		doldurComboBox("select Model from ekrankarti where Fiyat>1250 && Fiyat<2801", cbEkranKarti);
		
		doldurComboBox("select Model from powersupply", cbGucKaynagi);
		
		doldurComboBox("select Model from kasa", cbKasa);
		
		

		doldurComboBox("select Model from sabitdisk", cbSabitDisk);
		
		doldurComboBox("select Model from sogutucu", cbIslemciSog);
		
		doldurComboBox("select Model from ram where Fiyat>284", cbRam);
		
		
		
		
		
		JButton btnHesapla = new JButton("Hesapla");
		btnHesapla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(fiyat);
				//double toplam = StringDonustur(fiyat);
				//String fiyatS = Double.toString(anaToplam);
				//JOptionPane.showMessageDialog(null, "Toplam Fiyat: "+fiyatS+" TL");
				//lblToplam.setText(fiyatS+"TL");
			//	JOptionPane.showMessageDialog(null,fiyatS+" TL", "Toplam Fiyat: ", JOptionPane.INFORMATION_MESSAGE);
				String fiyatS = Double.toString(anaToplam);
				JOptionPane.showMessageDialog(null,fiyatS+" TL", "Toplam Fiyat: ", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnHesapla.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		btnHesapla.setBounds(754, 660, 145, 32);
		contentPane.add(btnHesapla);
		
		JButton btnzellikleriGr = new JButton("Özellikleri Gör");
		btnzellikleriGr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doldurLabelOzellik(cbIslemci, lblOzIslemci,"islemci");
				doldurLabelOzellik(cbRam, lblOzRam,"ram");
				doldurLabelOzellik(cbAnakart, lblOzAnakart, "anakart");
				doldurLabelOzellik(cbIslemciSog, lblOzIslemciSog,"sogutucu");
				doldurLabelModel(cbKasa, lblOzKasa,"kasa");
				doldurLabelModel(cbGucKaynagi, lblOzGucKaynagi,"powersupply");
				doldurLabelOzellik(cbSabitDisk, lblOzSabitDisk,"sabitdisk");
				doldurLabelOzellik(cbEkranKarti, lblOzEkranKarti,"ekrankarti");



			}
		});
		btnzellikleriGr.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		btnzellikleriGr.setBounds(754, 619, 145, 32);
		contentPane.add(btnzellikleriGr);
		
		JButton btnUyumlu = new JButton("Uyumlu Anakartlarý Getir");
		btnUyumlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbAnakart.removeAllItems( );
				soket1 =soketCek(cbIslemci, "islemci");
				doldurComboBox("select Model from anakart where SoketTipi='"+soket1+"'", cbAnakart);
				
			}
		});
		btnUyumlu.setBounds(749, 21, 200, 20);
		contentPane.add(btnUyumlu);
		

		
	}
	


	public void doldurComboBox(String sql, JComboBox cb) {
		
		try { 
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
            String query = sql;
            PreparedStatement pst = connection.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
           
            
            String model;
            
            while (rs.next())
            {      
               model = rs.getString("Model");         
               cb.addItem(model);
               
            }
            rs.close();

            connection.close();
            } catch (Exception e) {
                 e.printStackTrace();
            }
	}
	
	public void doldurLabelFiyat(JComboBox cb, JLabel lbl , String tabloAdi) {
		
	
			
				 Connection connection;
				try {
					
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
					  fiyat_il = cb.getSelectedItem().toString();
						 String lblFiyatQuery = "select Fiyat from "+tabloAdi+" where Model='"+fiyat_il+"'"; 
						 PreparedStatement pst = connection.prepareStatement(lblFiyatQuery);
						 ResultSet rs = pst.executeQuery();
						 
				
						 while (rs.next()) { 							
							 
							 fiyat = rs.getString(1);
				
							lbl.setText("Fiyat: "+fiyat +" TL");
					        }     
						 
				        		 connection.close();
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
	
		
	}
	
	public void doldurLabelOzellik(JComboBox cb, JLabel lbl ,String tabloAdi) {
				
		 Connection connection;
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
			  fiyat_il = cb.getSelectedItem().toString();
				 String lblFiyatQuery = "select Ozellik from "+tabloAdi+" where Model='"+fiyat_il+"'";
				 PreparedStatement pst = connection.prepareStatement(lblFiyatQuery);
				 ResultSet rs = pst.executeQuery();
				 String ozellik="";
		
				 while (rs.next()) { 							
					 
					 ozellik = rs.getString(1);
		
				//	lbl.setText("Ürün Özellikleri: "+ozellik);
					 lbl.setText("<html>"+ozellik+"</html>");							 

			        }     
				 
		        		 connection.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}


}
	
	public void doldurLabelModel(JComboBox cb, JLabel lbl ,String tabloAdi) {
	
		 Connection connection;
		try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
			  fiyat_il = cb.getSelectedItem().toString();
				 String lblFiyatQuery = "select Model from "+tabloAdi+" where Model='"+fiyat_il+"'";
				 PreparedStatement pst = connection.prepareStatement(lblFiyatQuery);
				 ResultSet rs = pst.executeQuery();
				 String ozellik="";
		
				 while (rs.next()) { 							
					 
					 ozellik = rs.getString(1);
		
				//	lbl.setText("Ürün Özellikleri:  "+ozellik);
					 lbl.setText("<html>"+ozellik+"</html>");							 

			        }     
				 
		        		 connection.close();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}


}
	
	public double StringDonustur (String label) {
		
		double miktar = Double.parseDouble( label.replace(",",".") );
		
	return miktar;
	}
	
	
	
	public String soketCek(JComboBox cb, String tabloAdi) {
		
		
		 Connection connection;
			try {
				
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
				  soket_il = cb.getSelectedItem().toString();
					 String lblFiyatQuery = "select SoketTipi from "+tabloAdi+" where Model='"+soket_il+"'"; 
					 PreparedStatement pst = connection.prepareStatement(lblFiyatQuery);
					 ResultSet rs = pst.executeQuery();
					 
			
					 while (rs.next()) { 							
						 
						 soket = rs.getString(1);
			
						
				        }     
					 
			        		 connection.close();
				
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		
		
		
		
		return soket;
	}
	
	
	
}
