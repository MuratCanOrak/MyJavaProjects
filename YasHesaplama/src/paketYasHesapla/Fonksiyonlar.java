package paketYasHesapla;

import java.util.Scanner;

public class Fonksiyonlar {
	
	
	
	public static void main(String[] args) {
	
		
		YasBulma kopru = new YasBulma(null,0,0,0,0);
		
		Scanner al = new Scanner(System.in);
		
		System.out.print("Lütfen isminizi giriniz: ");
		kopru.setIsim(al.nextLine());
		System.out.println("Merhaba "+ kopru.getIsim() + " Hoþ Geldin Bremýn :)");
		
		System.out.println("Lütfen seçiniz:");
		System.out.println("1:Doðum yýlým 2:Bulunduðum yýl 3:Yaþým");
		kopru.setSecim(al.nextInt());
		
		switch(kopru.getSecim()) {
		case 1:
			System.out.print("Lütfen doðum yýlýnýzý giriniz: ");
			kopru.setDog_yili(al.nextInt());
			System.out.print("Lütfen bulunduðunuz yýlý giriniz: ");
			kopru.setSim_yil(al.nextInt());
			kopru.yasBul1( kopru.getDog_yili() ,kopru.getSim_yil() );
		break;
		
		case 2:
			System.out.print("Lütfen doðum yýlýnýzý giriniz: ");
			kopru.setDog_yili(al.nextInt());
			System.out.print("Lütfen yaþýnýzý giriniz: ");
			kopru.setYas(al.nextInt());
			kopru.yasBul2(kopru.getYas() , kopru.getDog_yili());
		break;
		
		case 3: 
			System.out.print("Lütfen bulunduðunuz yýlý giriniz: ");
			kopru.setSim_yil(al.nextInt());
			System.out.print("Lütfen yaþýnýzý giriniz: ");
			kopru.setYas(al.nextInt());
			kopru.yasBul3(kopru.getSim_yil(), kopru.getYas() );
		break;
	
	
		}
		
		
		
		
		
		
	}




	

}
