package _01;

import java.util.ArrayList;
import java.lang.Math;

public class MainClass {
	
public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
int sayi2;
	for (int sayi=80; sayi<2000000000; sayi++) {
		int toplam=0;
		sayi2=sayi;
			for (int i =0; sayi2!=0; i++) {
				list.add(sayi2%10);
				sayi2=(sayi2-list.get(i))/10;
			}   
			for (int k=0; k<list.size(); k++) {
				toplam+= list.get(k);	
			}
			for (int k=0; k<list.size(); k++) {
				if((int)Math.pow(toplam, k+1)==sayi) {
				System.out.println("eþit "+sayi+"\n");
				}		
			}
 list.clear();
	}

	
	
	
}
	
	
}
