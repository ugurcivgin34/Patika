
import java.util.Scanner;

public class GirilenSayi {

	public static void main(String[] args) {
		
		int sonuc=0;
		int sayi;
		int sayac=0;
		int ortalama;

		Scanner k = new Scanner(System.in);
		
		System.out.println("Sayý giriniz");
		sayi = k.nextInt();

		for (int i = 0; i <= sayi; i++) {
			if(i==0) {
				continue;
			}
			if(i%4==0 && i%3==0) {
				sonuc = sonuc + i ;
				sayac++;
				
			}
		}
		ortalama = sonuc/sayac;
		System.out.println(ortalama);
	}

}
