package paketTersCevir;

import java.util.Scanner;

public class SayiCevirici {
	
	private double sayi;
		
	public static void main(String [] args) {
		Scanner al = new Scanner(System.in);
		SayiCevirme kopru = new SayiCevirme(0);
		for(int sayi=0; sayi<100; sayi++) {
			kopru.setSayi(sayi);
		kopru.sTersCevir();	
		kopru.ArmstrongSayi();	
		
		}
		
	
		

		
	}


}
