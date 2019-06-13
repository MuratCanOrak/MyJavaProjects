package TekMiCiftMi;
import java.util.Scanner;
public class AnaSinif {
	
	public static void main (String[] args) {
		Scanner deg = new Scanner(System.in);
		int sayi;
		
		IslemSinifi tekCift = new IslemSinifi();
		
		System.out.print("Lutfen sayi giriniz: ");
		sayi = deg.nextInt();
		
		tekCift.teKCift(sayi );
						
		
	}

}
