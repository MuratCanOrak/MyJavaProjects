package paketAlanHesapla;

import java.util.Scanner;

public class AlanHesabi {
	
	public static void main (String[] args) {
		int a, tabanDik=0, yukseklikDik=0,tabanUc=0, yukseklikUc=0, yaricap=0;
		
		Scanner oku = new Scanner(System.in);
		
		System.out.println("Yapmak istediðiz iþlem?" );
		System.out.println("1:Dörtgen   2:Ucgen   3:Çember" );
		a=oku.nextInt();
		
		Fonksiyonlar f1 = new Fonksiyonlar();
		
		
		if (a==1) {
		System.out.print("Dikdörtgenin Tabaný giriniz:"+ "(m):");
		tabanDik=oku.nextInt();
		
		System.out.print("Dikdörtgenin Yüksekliði giriniz"+ "(m):");
		yukseklikDik=oku.nextInt(); 
		System.out.println("Dörtgenin Alaný: "+ f1.DortgenAlanBulma(tabanDik, yukseklikDik)+ " m^2'dir.");
		}
		
		
		if(a==2) {
		System.out.print("Ücgenin Tabaný giriniz:"+ "(m):");
		tabanUc=oku.nextInt();
		
		System.out.print("Üçgenin Yüksekliði giriniz"+ "(m):");
		yukseklikUc=oku.nextInt();
		System.out.println("Ucgenin Alaný: "+ f1.UcgenAlanBulma(tabanUc, yukseklikUc)+ " m^2'dir.");
		}
		
		
		if (a==3) {
		System.out.print("Çemberin Çapý giriniz"+ "(m):");
		yaricap=oku.nextInt();
		System.out.print("Cemberin Alaný: "+ f1.CemberAlanBulma(yaricap)+ " m^2'dir.");
		}
		
			
				
	}

}
