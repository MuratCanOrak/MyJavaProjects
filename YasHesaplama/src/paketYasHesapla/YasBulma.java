

package paketYasHesapla;

public class YasBulma {
	private String isim;
	private int dog_yili, sim_yil, yas,secim;


	
	public void yasBul1(int dog_yili , int sim_yil ) {
		
		int sonuc=sim_yil-dog_yili;
		
		System.out.println("Yaþýnýz:"+ sonuc);
		
	}
	
	public void yasBul2(int yas , int dog_yili) {
		
		int sonuc=dog_yili+yas;
		System.out.println("Bulunduðunuz yýl:"+ sonuc);
		
	}
	public YasBulma(String isim, int dog_yili, int sim_yil, int yas, int secim) {
	
		this.isim = isim;
		this.dog_yili = dog_yili;
		this.sim_yil = sim_yil;
		this.yas = yas;
		this.secim = secim;
	}

	
	public void yasBul3(int sim_yil, int yas ) {
		int sonuc= sim_yil-yas;
		System.out.println("Doðum tarihiniz:"+sonuc);
	}
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getDog_yili() {
		return dog_yili;
	}

	public void setDog_yili(int dog_yili) {
		this.dog_yili = dog_yili;
	}

	public int getSim_yil() {
		return sim_yil;
	}

	public void setSim_yil(int sim_yil) {
		this.sim_yil = sim_yil;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public int getSecim() {
		return secim;
	}

	public void setSecim(int secim) {
		this.secim = secim;
	}

}