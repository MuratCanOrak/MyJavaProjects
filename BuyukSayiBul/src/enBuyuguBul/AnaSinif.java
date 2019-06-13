package enBuyuguBul;
import java.util.Scanner;
public class AnaSinif {

	public static void main (String[] args) {
		Scanner deg = new Scanner(System.in);
		 int a=0,b=0,c=0,d=0;
		 
		
		IslemSinifi bulma = new IslemSinifi();
		
				
		System.out.println("Birinci sayiyi giriniz:");
		a = deg.nextInt();
		
		System.out.println("Ikinci sayiyi giriniz:");
		b = deg.nextInt();
		
		System.out.println("Ucuncu sayiyi giriniz:");
		c = deg.nextInt();
		
		
		System.out.println("Dorduncu sayiyi giriniz:");
		d = deg.nextInt();
				
				
		int sonuc = bulma.buyukBulma(a,b,c,d);
		
		System.out.println(sonuc);
		
		
		
		
	}
	
	
}
