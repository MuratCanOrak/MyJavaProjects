package paketYasHesapla;

import java.util.Scanner;

public class Fonksiyonlar {
	
	
	
	public static void main(String[] args) {
	
		
		YasBulma kopru = new YasBulma(null,0,0,0,0);
		
		Scanner al = new Scanner(System.in);
		
		System.out.print("L�tfen isminizi giriniz: ");
		kopru.setIsim(al.nextLine());
		System.out.println("Merhaba "+ kopru.getIsim() + " Ho� Geldin Brem�n :)");
		
		System.out.println("L�tfen se�iniz:");
		System.out.println("1:Do�um y�l�m 2:Bulundu�um y�l 3:Ya��m");
		kopru.setSecim(al.nextInt());
		
		switch(kopru.getSecim()) {
		case 1:
			System.out.print("L�tfen do�um y�l�n�z� giriniz: ");
			kopru.setDog_yili(al.nextInt());
			System.out.print("L�tfen bulundu�unuz y�l� giriniz: ");
			kopru.setSim_yil(al.nextInt());
			kopru.yasBul1( kopru.getDog_yili() ,kopru.getSim_yil() );
		break;
		
		case 2:
			System.out.print("L�tfen do�um y�l�n�z� giriniz: ");
			kopru.setDog_yili(al.nextInt());
			System.out.print("L�tfen ya��n�z� giriniz: ");
			kopru.setYas(al.nextInt());
			kopru.yasBul2(kopru.getYas() , kopru.getDog_yili());
		break;
		
		case 3: 
			System.out.print("L�tfen bulundu�unuz y�l� giriniz: ");
			kopru.setSim_yil(al.nextInt());
			System.out.print("L�tfen ya��n�z� giriniz: ");
			kopru.setYas(al.nextInt());
			kopru.yasBul3(kopru.getSim_yil(), kopru.getYas() );
		break;
	
	
		}
		
		
		
		
		
		
	}




	

}
