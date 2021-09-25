import java.util.Scanner;

public class Desen {

	static int cikar(int x) {
		System.out.print(x + " ");
		if (x > 0)
			return cikar(x - 5);

		return (x);

	}

	static int ekle(int x, int y) {
		if(x>0)
		System.out.print((x)+" ");
		if (x < y) {

			return ekle(x + 5, y);

		}

		return x;
	}

	public static void main(String[] args) {
		int sayi;
		int a;

		Scanner k = new Scanner(System.in);
		System.out.print("Sayýyý giriniz : ");
		sayi = k.nextInt();

		a = cikar(sayi);
		ekle(a, sayi);

	}

}
