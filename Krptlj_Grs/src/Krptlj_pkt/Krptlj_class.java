package Krptlj_pkt;

import java.util.ArrayList;

import Tasarim.Krptlj_win_01;

public class Krptlj_class {
	
	
	
	
	
	
private  int  uzunluk;
private String xor="";


public String getXor() {
	return xor;
}

public void setXor(String xor) {
	this.xor = xor;
}
public int[] ascii;
public String[] binary= new String[20];
StringBuilder stryapici = new StringBuilder();
//public char[]  dizi5 = new char[7];
public String strBinary = "",binary2="", bin="",strYazi="",strAscii="",strHex="",strAnd="",strOr="";
//her bir fonksiyonda elde edilen sonuc str"fonkAdi" seklinde tutulmustur.
	
	public int getUzunluk() {
		return uzunluk;
	}

	public void setUzunluk(int uzunluk) {
		this.uzunluk = uzunluk;
	}
	 
		public Krptlj_class(int uzunluk) {
		
		this.uzunluk = uzunluk;
		ascii = new int[uzunluk];
	}
	
		public char[] metinAl(String metin) {//metni parçalyýp diziye atan fonksiyon
			
			String text ="";
			char[] yazi = new char[metin.length()] ;//metni harflere çeviriyor yazi disinde tutuyor
			
			for(int i=0;i<metin.length();i++) {
				yazi[i] = metin.charAt(i);
				
			}
			
			for (int i=metin.length()-1; i>=0; i--) {
				     
				//System.out.print(yazi[i]);
				stryapici.append(yazi[i]);
			}
			
			return yazi;
		}
		
		
		

	public String metinCevirenFonk(String metin) {
				
		
		StringBuilder stryapici2 = new StringBuilder();
		//int[] ascii = new int[metin.length()];

		int i=0;
		
	
		System.out.print("TERSÝ: ");
		

		char[] yazi = metinAl(metin);
		strYazi=stryapici.toString();
		System.out.print(strYazi);
		System.out.println(""+"\n");
		System.out.print("ASCII: ");

		for(int k=metin.length()-1; k>=0; k--) {
			ascii[k]=yazi[k];
			//System.out.print(ascii[0]);
			stryapici2.append(ascii[k]);
		}
		strAscii=stryapici2.toString();
		System.out.println(strAscii);
		
		return strAscii;

	}
	
	public String cevirmeHex(String metin) {
		metinCevirenFonk(metin);
		StringBuilder stryapici = new StringBuilder();

		String hex="";
		int kalan,bolum;
		for (int b=uzunluk-1; b>=0; b--) {
			bolum=ascii[b]/16;
			kalan=ascii[b]%16;
			if(kalan>=0 && kalan<10) {
				hex= Integer.toString(bolum)+Integer.toString(kalan);
				//System.out.print(hex);
				stryapici.append(hex);
				
			 int sonuc =(bolum*10)+kalan;
			}
			else if(kalan==10 ) {
				hex= Integer.toString(bolum)+'A';//integer degiskeni stringe donusturduk 
			//	System.out.print(hex);
				stryapici.append(hex);
			}
			else if(kalan==11) {
				hex= Integer.toString(bolum)+'B';
				//System.out.print(hex);
				stryapici.append(hex);
			}
			else if(kalan==12) {
				hex= Integer.toString(bolum)+'C';
				//System.out.print(hex);
				stryapici.append(hex);
			}
			else if(kalan==13) {
				hex= Integer.toString(bolum)+'D';
				//System.out.print(hex);
				stryapici.append(hex);
			}
			else if(kalan==14 ) {
				hex= Integer.toString(bolum)+'E';
				//System.out.print(hex);
				stryapici.append(hex);
			}
			else if(kalan==15) {
				hex= Integer.toString(bolum)+'F';
				//System.out.print(hex);
				stryapici.append(hex);
			}
			
		}strHex=stryapici.toString();
		System.out.println(strHex);
		return strHex;
	}
	
	

/*	public String parseBinary(String metin) {
		String ol = "";
		metinCevirenFonk(metin);
		String res = "00000000";
	//	int kopru = sayi;
		int[] kopru =  new  int[ascii.length]  ;
		for(int i=0;i<ascii.length;i++)
		{
			kopru[i] = ascii[i];
			
		}
		
		int result = 0;
		int j=7;
		
		String end,beg;
		for(int o = 0;o<kopru.length;o++) {
			res = "00000000";
			j=7; 
			for(int i=0;i<8;i++) {
				
				
				if(kopru[o] - (int)Math.pow(2, j)>=0) {
					
					end = res.substring(i+1);
					beg = res.substring(0, i);
					res = beg +	"1" + end;
					kopru[o] = (int) (kopru[o]- Math.pow(2, j));
					
				}
				else 
				{
					end = res.substring(i+1);
					beg = res.substring(0, i);
					res = beg +	"0" + end;
					
					
					
				}
				j--;
				
			}
			
			
			ol = ol +res;
			System.out.println(res);
			
			
		}
		parcala(ol);
		return ol;
	}*/
	
	public String cevirmeBin(String metin) {
		String name = metinCevirenFonk(metin);
		for (int c=0; c<=4; c++) {
			int b=0;
		while(ascii[c]>0) {
			b=ascii[c]%2;
			ascii[c]=ascii[c]/2;
		binary2= Integer.toString(b)+binary2 ; 
		  strBinary =  Integer.toString(b)+strBinary;
		    
		}
		binary[c]=binary2;////////////////////////////////////////////////////////////////////////////////
		binary2="";
		//System.out.println(dizi4[c]+"\n");
		
	//	binary2=Integer.toString(b);
	}	
		
		System.out.println(strBinary);
		return strBinary;
		
	}
	
	public String key(int key) {
		
		int sayi=0;
		if (key>=64) {
			while(key>0) {
			sayi=key%2;
			key=key/2;
			xor=Integer.toString(sayi)+xor;
			//System.out.println(xor);
			}
		}
		else if (32<=key && key<64) {
			while(key>0) {
				sayi=key%2;
				key=key/2;
				xor=Integer.toString(sayi)+xor;
				}
			xor="0"+xor; 
			System.out.println(xor);
		}
		else if (16<=key && key<=31) {
			while(key>0) {
				sayi=key%2;
				key=key/2;
				xor=Integer.toString(sayi)+xor;
				}
			xor="00"+xor; 
			System.out.println(xor);
		}
		else if (8<=key && key<=15) {
			while(key>0) {
				sayi=key%2;
				key=key/2;
				xor=Integer.toString(sayi)+xor;
				}
			xor="000"+xor; 
			System.out.println(xor);
		}
		else if (4<=key && key<=7) {
			while(key>0) {
				sayi=key%2;
				key=key/2;
				xor=Integer.toString(sayi)+xor;
				}
			xor="0000"+xor;
			System.out.println(xor);
		}
	
		else if (key==2||key==3) {
			while(key>0) {
				sayi=key%2;
				key=key/2;
				xor=Integer.toString(sayi)+xor;
				
				
			}xor="00000"+xor; System.out.println(xor);
		}
		else if ( key==1) {
			xor="0000001";
		}
		else if (key==0 ) {
			xor="0000000";
		}
		return xor;
	}
	
public String xor(String metin, int key) {
metinCevirenFonk(metin);
key(key);
cevirmeBin(metin);
	StringBuilder stryapici = new StringBuilder();
	stryapici.append(0);
	for (int c=uzunluk-1; c>=0; c--) {
		stryapici.append(0);
		int v=0; char h=0, g=0;
		while(v<=6) {
			 h=binary[c].charAt(v);
			 g=xor.charAt(v);
			// System.out.print(h+" ");
			 //System.out.print(g+" ");
			 v++;
			/* int dizi4int=Integer.parseInt(dizi4[c]);
			 int xor2 = dizi4int^g;
			 System.out.println(xor2);*/ // xor isleminin baska sekli
			 
			 if(h==g) {
				//	System.out.println(" eþit");
					stryapici.append(0);

				}
			 else {
				// System.out.println("eþit deðil");
					stryapici.append(1);
			 }
			
		}				
		//System.out.println(stryapici.toString()); 
		
	}bin = stryapici.toString(); 
	System.out.print(bin);
	stryapici.setLength(0);
	System.out.println("\n");
	return bin;

	}
		
	public String and(String metin, int key) {
		metinCevirenFonk(metin);
		key(key);
		cevirmeBin(metin);
		StringBuilder stryapici = new StringBuilder();
		stryapici.append(0);
		for (int c=uzunluk-1; c>=0; c--) {
			int v=0; char h=0, g=0;
			while(v<=6) {
				 h=binary[c].charAt(v);
				 g=xor.charAt(v);
				 v++;
				 if(h=='0' || g=='0') {
						stryapici.append(0);
				 }
				 else {
				 stryapici.append(1);
				 }
		
			}strAnd=stryapici.toString();
			System.out.print(strAnd); 
			stryapici.append(0);
			//stryapici.setLength(0);
			}
		
		System.out.println("\n");
		return strAnd;
	}
/*	public void parcala(String arg) {
		
		int k=0;
   	String sekizlik = parseBinary(arg);;
		for(int i=0;i<arg.length();i=i+6) {
			
			
			binary[k] = sekizlik.substring(i, i+6); 
		
			System.out.println(binary[k]  );
			k++;
		}
		
		
		
		
		
		
	}*/
	
	public String or(String metin, int key) {
		metinCevirenFonk(metin);
		key(key);
		cevirmeBin(metin);
		StringBuilder stryapici = new StringBuilder();
		stryapici.append(0);
		for (int c=uzunluk-1; c>=0; c--) {
			int v=0; char h=0, g=0;
			while(v<=6) {
				 h=binary[c].charAt(v);
				 g=xor.charAt(v);
			
				 v++;
				 if(h=='1' || g=='1') {
			
						stryapici.append(1);
				 }
				 else {
				
				 stryapici.append(0);
				 }
		
			}strOr=stryapici.toString();
			System.out.print(strOr); 
			stryapici.append(0);
			//stryapici.setLength(0);
			}
		System.out.println("\n");
		return strOr;
	}
	


	
	
	
	public String vigenere(String metin,String key_metin) //metin_harf_sayisini_bul
	{
		String mod_sonuc="" ; 
		
		
		////////////////////1////2///3//4///5///6///7///8///9///10//11/12//13//14//15//16//17//18//19//20//21//22//23//24//25//26
		char[] harfler =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		char[] yazi = metinAl(metin);	
		char[] key_dizi = metinAl(key_metin);
		ArrayList <Integer> toplam = new ArrayList <Integer>();
		ArrayList <Integer> toplam2 = new ArrayList <Integer>();
		//int [] toplam= new int[metin.length()];
		//int [] toplam2= new int[key_metin.length()];
		
		
		 for(int i=0; i<metin.length(); i++)
		 {
			 for(int a=0; a<26; a++) 
			 {
			if(yazi[i]==harfler[a])
				{
				System.out.print(++a+" ");
				toplam.add(a);
				}
			/*else
				System.out.println(a+"deðil");*/
			 }
		 }
		 System.out.println(" ");

		 
		 for(int i=0; i<key_metin.length(); i++)
		 {
			 for(int a=0; a<26; a++) 
			 {
			if(key_dizi[i]==harfler[a])
				{
				System.out.print(++a+" ");
				toplam2.add(a);
				}
			/*else
				System.out.println(a+"deðil");*/
			 }
			
		 } System.out.println(" ");
		 
		 int x=0,y=0;//x hangi dizi büyükse onun boyutunu tutar. // y hangisi küçükse onun boyutunu tutar.
	
		 if(metin.length()>key_metin.length())
		 {
	        x=metin.length();
	    	y=key_metin.length();
	    	
			 for(int i=y; i<=x; i++)
			 {
				 toplam2.add(i,0);
			 }
		 }
		 else if(key_metin.length()>metin.length())
		 {
			x=key_metin.length();
			y=metin.length();
				
			 for(int i=y; i<=x; i++)
			 {
				 toplam.add(i,0);
			 }
		 }
		 
		 
		ArrayList <Integer> top_sonucu = new ArrayList <Integer>();
		int[] mod_sonucu = new int [x];
		for (int i=0; i<x; i++) {
			top_sonucu.add (toplam.get(i)+toplam2.get(i));
			int mod=top_sonucu.get(i)%26;
			mod_sonucu[i]=mod;
			
			 mod_sonuc= mod_sonuc+Integer.toString(mod_sonucu[i]);
			
		}
		System.out.println(top_sonucu+" ");
		System.out.println(mod_sonucu);
		//String mod_sonuc = Integer.toString(mod_sonucu);
		
		
		return mod_sonuc;
	 }
	
	
	}
