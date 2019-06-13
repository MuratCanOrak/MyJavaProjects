package _02;

public class MSayiBul {

	public static void main(String[] args) {

		  for (int sayi = 1; sayi <= 1000; sayi++) {
	    
	        int toplam = 0;
	        for (int i = 1; i < sayi; i++) {
	            if (sayi % i == 0) {
	                toplam += i;
	            }
	        }
	        if (toplam == sayi) {
	           System.out.println("mikemmel" +sayi);
	        } else {
	        System.out.println("deðil");
	        }
	    }
	}

}
