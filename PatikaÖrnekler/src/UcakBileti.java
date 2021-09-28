import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int mesafe, yas, tip;
		double normalTutar, yasInd�r�m�, indirimliTutar = 0, gidisD�n�sBiletIndirimi, toplamTutar=0;
		Scanner k = new Scanner(System.in);

		System.out.print("Mesafeyi km cinsinden giriniz : ");
		mesafe = k.nextInt();
		normalTutar = mesafe * 0.10;

		System.out.print("Ya��n�z� giriniz : ");
		yas = k.nextInt();

		if (yas < 12) {
			yasInd�r�m� = normalTutar * 0.50;
			indirimliTutar = normalTutar - yasInd�r�m�;
			
		} else if (12 < yas && yas < 24) {
			yasInd�r�m� = normalTutar * 0.10;
			indirimliTutar = normalTutar - yasInd�r�m�;
			
		} else if (65 < yas) {
			yasInd�r�m� = normalTutar * 0.30;
			indirimliTutar = normalTutar - yasInd�r�m�;
			
		} else {
			System.out.println("Yas indirimi uygulanmad�");
			toplamTutar = normalTutar;
		}

		System.out.print("Yolculuk tipini giriniz (1 => Tek y�n , 2 => Gidi�-D�n�� Y�n� : ");
		tip = k.nextInt();

		switch (tip) {
		case 1:
			System.out.println("Toplam tutar : " + toplamTutar);
			break;

		case 2:
			gidisD�n�sBiletIndirimi = indirimliTutar * 0.20;
			toplamTutar = (indirimliTutar -gidisD�n�sBiletIndirimi) * 2 ;
			System.out.println("Toplam tutar : " + toplamTutar);
			break;

		default:
			System.out.println("Yanl�� de�er girdiniz");
		}

	}

}
