package kutuphane;

import java.sql.Connection;
import java.sql.DriverManager;



public class SqlBaglanti {
	
	
	
	private int port = 3306;
	
	static private Connection con ;
	
	

	


	public static Connection Connectiondonder() {
		
		String url = "jdbc:mysql://127.0.0.1:3306/deneme";
		

		try {
			Class.forName("con.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url,"root", "");
			System.out.println("baglantý ok");
			
			return con;
			//Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			System.out.println("mysql connector yok");
			e.printStackTrace();
		
		return con;
	}
	}
	


	

}