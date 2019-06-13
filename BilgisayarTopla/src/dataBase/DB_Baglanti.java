package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.cj.jdbc.*;
import com.mysql.cj.xdevapi.Statement;

public class DB_Baglanti {
	
	public void connect() {
		Connection conn = null;
		  try {
			  Class.forName("com.mysql.cj.jdbc.Driver");

			  conn = DriverManager
	                    .getConnection("jdbc:mysql://localhost:3306/db_toplama?verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey"
	                            , "root","root");
	         
	          System.out.println("baglandi");
	      } catch (Exception ex) {
	          
	    	  System.out.println("hata");
	      }
		
	}
	
	
	
	

	//   verifyServerCertificate=false&useSSL=true&useLagacyDatetimeCode=false&serverTimezone=Turkey
	
}
