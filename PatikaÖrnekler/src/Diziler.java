import java.util.Arrays;
import java.util.Scanner;

public class Diziler {

	public static void main(String[] args) {
		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int[] temp = new int[list.length];
		int[] temp2 = new int[list.length];

		int max1 = 0;

		Scanner k = new Scanner(System.in);
		int sayi;

		System.out.println("Bir sayý giriniz");
		sayi = k.nextInt();

		for (int i = 0; i < list.length; i++) {
			if (sayi > list[i]) {
				temp[i] = list[i];
			} else {
				temp2[i] = list[i];
			}

		}

		Arrays.sort(temp);
		Arrays.sort(temp2);
		max1 = temp2[0];

		for (int i = 0; i < temp2.length; i++) {
			if (max1 < temp2[i]) {
				max1 = temp2[i];
				break;

			}

		}

		System.out.println(Arrays.toString(temp));
		System.out.println("Girilen sayýdan küçük en yakýn sayý : " + temp[temp.length - 1]);

		System.out.println(Arrays.toString(temp2));
		System.out.println("Girilen sayýdan büyük en yakýn sayý : " + max1);

	}
}
