import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		int sayi, sayac = 0;
		int min = 0, max = 0;

		System.out.print("Ka� tane say� gireckesiniz : ");
		sayac = k.nextInt();

		for(int i=1;i<=sayac;i++) {
			System.out.println(i + ".ninci say�y� giriniz");
			sayi=k.nextInt();
			if(i==1) {
				max=sayi;
				min=sayi;
			}
			if (sayi>max) {
				max=sayi;
			}
			if(sayi<min) {
				min=sayi;
			}
		}
		System.out.println("En b�y�k sayi" + max);
		System.out.println("En k���k sayi " + min);

	}
}
