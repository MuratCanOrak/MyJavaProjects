package Kutuphane;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class Baglanti {

	private String kullaniciId = "root";
	private String parola = "";
	private String host = "127.0.0.1";
	private String db = "omer";
	
	private int port = 3306;
	
	private Connection con = null;
	
	public void initilize() {
		
		String url = "jdbc:mysql://localhost:3306/deneme";
		
	//	String url = "jdbc:mysql://127.0.0.1"
		//		+ "/otomasyon";
		try {
		  this.con  = (Connection) DriverManager.getConnection(url, "root", "");
			System.out.println("baglantý ok");
			//Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			System.out.println("mysql connector yok");
			e.printStackTrace();
		}/*	try {
			
			con = DriverManager.getConnection(url,"root","");
			
		} catch (SQLException e) {
			
			System.out.println("baglanti basarisiz");
			e.printStackTrace();
		}
		if(con != null)
		{
			System.out.println("basardik");
		}
		else
		{
			System.out.println("kudur :D");
		}*/
	}
	
	

public static void main(String[] args) {
		
		Baglanti b1 = new Baglanti();
		
		b1.initilize();
		
				
	}
}
