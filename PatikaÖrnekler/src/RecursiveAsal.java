import java.util.Scanner;

public class RecursiveAsal {

	static boolean Asal(int x, int y) {

		if (x == y || x == 1) {
			return true;
		}
		if (x % y == 0) {
			return false;

		}

		return Asal(x, y + 1);

	}

	public static void main(String[] args) {
		int sayi;
		int i = 2;
		Scanner k = new Scanner(System.in);

		System.out.print("Sayýyý giriniz : ");
		sayi = k.nextInt();

		System.out.println(Asal(sayi, i) ? "Asal" : "Asal deðildir");

	}

}
