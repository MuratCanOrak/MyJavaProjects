package paketAlanHesapla;

import java.util.Scanner;

public class AlanHesabi {
	
	public static void main (String[] args) {
		int a, tabanDik=0, yukseklikDik=0,tabanUc=0, yukseklikUc=0, yaricap=0;
		
		Scanner oku = new Scanner(System.in);
		
		System.out.println("Yapmak istedi�iz i�lem?" );
		System.out.println("1:D�rtgen   2:Ucgen   3:�ember" );
		a=oku.nextInt();
		
		Fonksiyonlar f1 = new Fonksiyonlar();
		
		
		if (a==1) {
		System.out.print("Dikd�rtgenin Taban� giriniz:"+ "(m):");
		tabanDik=oku.nextInt();
		
		System.out.print("Dikd�rtgenin Y�ksekli�i giriniz"+ "(m):");
		yukseklikDik=oku.nextInt(); 
		System.out.println("D�rtgenin Alan�: "+ f1.DortgenAlanBulma(tabanDik, yukseklikDik)+ " m^2'dir.");
		}
		
		
		if(a==2) {
		System.out.print("�cgenin Taban� giriniz:"+ "(m):");
		tabanUc=oku.nextInt();
		
		System.out.print("��genin Y�ksekli�i giriniz"+ "(m):");
		yukseklikUc=oku.nextInt();
		System.out.println("Ucgenin Alan�: "+ f1.UcgenAlanBulma(tabanUc, yukseklikUc)+ " m^2'dir.");
		}
		
		
		if (a==3) {
		System.out.print("�emberin �ap� giriniz"+ "(m):");
		yaricap=oku.nextInt();
		System.out.print("Cemberin Alan�: "+ f1.CemberAlanBulma(yaricap)+ " m^2'dir.");
		}
		
			
				
	}

}
