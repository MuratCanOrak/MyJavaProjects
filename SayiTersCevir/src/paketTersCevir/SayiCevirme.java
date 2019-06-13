package paketTersCevir;

public class SayiCevirme {
  double[] dizi = new double[20];
	double sayi;
	double sayi2;
	
	int sayac=0;
	public SayiCevirme (int sayi) {
		
		this.sayi=sayi;
	}
	public void sTersCevir() {
		double sonRakam;
		sayi2=sayi;
		for(int i=0; sayi!=0; i++) {
			sonRakam=sayi%10;
			
			sayi=(sayi-sonRakam)/10;
			dizi[i]=sonRakam;
			
			
			
			sayac++;
			
		}
		
	
	 SayiBirlesme();//KOMPOZÝSYON OLAYI
	}
	
	public void SayiBirlesme() { 
		int a = sayac;
		double b=0;
		for(int i=0;i<=(sayac-1);i++) {
				
				 b=dizi[i]*Math.pow(10,(a-1))+b;
						a--;
		}
		System.out.println((int)b);
		
		}
	
	public void ArmstrongSayi() {
		int a =0;
		System.out.println(sayac);
		for(int i=0; i<sayac; i++) {
			
				a=	(int)Math.pow(dizi[i], sayac)+a;
				
			}
		if(a==sayi2) {
				System.out.println("sayi amstrongdur");
				
		}
	}
	
	

public void setSayi(int sayi) {
	this.sayi=sayi;
}
public double getSayi() {
	return sayi;
}

}