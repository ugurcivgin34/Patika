import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int mesafe, yas, tip;
		double normalTutar, yasIndýrýmý, indirimliTutar = 0, gidisDönüsBiletIndirimi, toplamTutar=0;
		Scanner k = new Scanner(System.in);

		System.out.print("Mesafeyi km cinsinden giriniz : ");
		mesafe = k.nextInt();
		normalTutar = mesafe * 0.10;

		System.out.print("Yaþýnýzý giriniz : ");
		yas = k.nextInt();

		if (yas < 12) {
			yasIndýrýmý = normalTutar * 0.50;
			indirimliTutar = normalTutar - yasIndýrýmý;
			
		} else if (12 < yas && yas < 24) {
			yasIndýrýmý = normalTutar * 0.10;
			indirimliTutar = normalTutar - yasIndýrýmý;
			
		} else if (65 < yas) {
			yasIndýrýmý = normalTutar * 0.30;
			indirimliTutar = normalTutar - yasIndýrýmý;
			
		} else {
			System.out.println("Yas indirimi uygulanmadý");
			toplamTutar = normalTutar;
		}

		System.out.print("Yolculuk tipini giriniz (1 => Tek yön , 2 => Gidiþ-Dönüþ Yönü : ");
		tip = k.nextInt();

		switch (tip) {
		case 1:
			System.out.println("Toplam tutar : " + toplamTutar);
			break;

		case 2:
			gidisDönüsBiletIndirimi = indirimliTutar * 0.20;
			toplamTutar = (indirimliTutar -gidisDönüsBiletIndirimi) * 2 ;
			System.out.println("Toplam tutar : " + toplamTutar);
			break;

		default:
			System.out.println("Yanlýþ deðer girdiniz");
		}

	}

}
