import java.util.Scanner;

public class Ters�cgen {

	public static void main(String[] args) {
		int basamak;
		Scanner klv = new Scanner(System.in);

		System.out.print("Say� giriniz : ");
		basamak = klv.nextInt();

		for (int i = basamak; i >= 1; i--) {
			for (int k = 1; k <= (basamak - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
