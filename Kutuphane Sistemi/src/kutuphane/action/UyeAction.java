package kutuphane.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import kutuphane.SqlBaglanti;

public class UyeAction {
	 private Connection con;
	 private Statement st;
	 private ResultSet rs;
	
    
    
    
    public UyeAction() {
    		
    	try {
    		String url = "jdbc:mysql://127.0.0.1:3306/deneme";
    		Class.forName("con.mysql.jdbc.Driver");
    		con = (Connection) DriverManager.getConnection(url,"root", "");
    		st = (Statement) con.createStatement();
    		
		} catch (Exception e) {
			System.out.println("error : " + e);
			
		}
    
	}
    
    public void checkUye(String id, String parola) {
    	
    	try {
    		String query = "select * from uye where TC ='"+id+"'";
    		rs = st.executeQuery(query);
    		
    		String passwd = rs.getString("parola");
    		System.out.println(passwd);
    		if(passwd.equals(parola))
    		{
    			
    			System.out.println("oldu");
    		}
		} catch (Exception e) {
			
			
		}
    	
    }
   /* public static void main(String[] args) {
		UyeAction u = new UyeAction();
		u.checkUye("21860400472", "omer");
	}*/
    
}
