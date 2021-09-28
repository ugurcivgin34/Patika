import java.util.Scanner;

public class Mükemmelsayi {

	public static void main(String[] args) {
		int sayi;
		int toplam =0;
		Scanner k =new Scanner(System.in);

		do {
			System.out.print("Sayý giriniz :");
			sayi = k.nextInt();
			for(int i =1;i<sayi;i++) {
				if(sayi%i==0) {
					toplam = toplam + i ;
				}
				
			}
			if(sayi==toplam) {
				System.out.println("Mükemmel sayýdýr :" +toplam);
				toplam=0;
			}else {
				System.out.println("Mükemmel sayý deðildir");
				toplam=0;
			}
			
		}
		while (sayi>0);
		
			
		 	
			}
		
	}


