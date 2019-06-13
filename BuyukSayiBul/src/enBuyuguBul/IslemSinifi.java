package enBuyuguBul;

public class IslemSinifi {
	
 int son;
 
	

	public int buyukBulma(int a , int b , int c, int d) {
		if(a>b && a>c && a>d)
			son=a;
		else if(b>a && b>c && b>d)
			son=b;
		else if(c>a && c>b && c>d)
			son=c;
		else if(d>a && d>b && d>c)
			son=d;
		else
			son = a;
		
		
		return son;
		
		
	}
	
	
}
