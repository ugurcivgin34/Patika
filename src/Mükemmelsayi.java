import java.util.Scanner;

public class M�kemmelsayi {

	public static void main(String[] args) {
		int sayi;
		int toplam =0;
		Scanner k =new Scanner(System.in);

		do {
			System.out.print("Say� giriniz :");
			sayi = k.nextInt();
			for(int i =1;i<sayi;i++) {
				if(sayi%i==0) {
					toplam = toplam + i ;
				}
				
			}
			if(sayi==toplam) {
				System.out.println("M�kemmel say�d�r :" +toplam);
				toplam=0;
			}else {
				System.out.println("M�kemmel say� de�ildir");
				toplam=0;
			}
			
		}
		while (sayi>0);
		
			
		 	
			}
		
	}


