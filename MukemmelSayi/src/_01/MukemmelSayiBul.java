package _01;

import java.util.ArrayList;
import java.util.Scanner;

public class MukemmelSayiBul {

	public static void main(String[] args) {
//Scanner scan = new Scanner (System.in);
//int sayi=scan.nextInt();



ArrayList a1 = new ArrayList();
for (int sayi=0; sayi<200000; sayi++) {
	int toplam=0;
	for (int i=1; i<sayi; i++) {
		if((sayi%i)==0)
			toplam+=i;
	//	System.out.println("mer"+toplam);
	}
	if (toplam==sayi)
		a1.add(sayi);
}
System.out.println(a1);
	}

}
