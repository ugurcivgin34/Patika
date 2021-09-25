import java.util.Scanner;

public class ÜslüHesapla {

	static int Power(int x , int y) {
		if(x==1) {
			return 1; }
		else if (y==0) {
			return 1 ;
		} else {
			return x *Power(x,y-1);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int taban ,üs;
		
		Scanner k = new Scanner(System.in);

		System.out.print("Taban deðerini giriniz : ");
		taban = k.nextInt();
		
		System.out.print("Üs deðerini giriniz : ");
		üs = k.nextInt();
		
		System.out.println("Sonuç : " + Power(taban, üs));
	}
	
	

}
