import java.util.Scanner;

public class Yildiz {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.print("Bir Sayý Giriniz :");
		int n = klavye.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2 * i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1 ; i>=1 ; i--) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2 * i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
