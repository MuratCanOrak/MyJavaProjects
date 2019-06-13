package _03;

public class MSBul {

		public static void main(String[] args) {

			  for (int i = 1; i <= 1000; i++) {
		            if (mukemmelMi(i)) {
		               System.out.println("O bir mükemmel sayi"+i);
		            }
		        }

		}
		  public static boolean  mukemmelMi(int sayi) {
		        int toplam = 0;
		        for (int i = 1; i < sayi; i++) {
		            if (sayi % i == 0) {
		                toplam += i;
		            }
		        }
		        if (toplam == sayi) {
		           return  true;
		        } else {
		         return false;
		        }
		    }
	}

