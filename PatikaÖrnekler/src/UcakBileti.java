import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int mesafe, yas, tip;
		double normalTutar, yasIndırımı, indirimliTutar = 0, gidisDönüsBiletIndirimi, toplamTutar=0;
		Scanner k = new Scanner(System.in);

		System.out.print("Mesafeyi km cinsinden giriniz : ");
		mesafe = k.nextInt();
		normalTutar = mesafe * 0.10;

		System.out.print("Yaşınızı giriniz : ");
		yas = k.nextInt();

		if (yas < 12) {
			yasIndırımı = normalTutar * 0.50;
			indirimliTutar = normalTutar - yasIndırımı;
			
		} else if (12 < yas && yas < 24) {
			yasIndırımı = normalTutar * 0.10;
			indirimliTutar = normalTutar - yasIndırımı;
			
		} else if (65 < yas) {
			yasIndırımı = normalTutar * 0.30;
			indirimliTutar = normalTutar - yasIndırımı;
			
		} else {
			System.out.println("Yas indirimi uygulanmadı");
			toplamTutar = normalTutar;
		}

		System.out.print("Yolculuk tipini giriniz (1 => Tek yön , 2 => Gidiş-Dönüş Yönü : ");
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
			System.out.println("Yanlış değer girdiniz");
		}

	}

}
