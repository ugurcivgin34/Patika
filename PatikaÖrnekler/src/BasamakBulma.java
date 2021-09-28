import java.util.Scanner;

public class BasamakBulma {

	public static void main(String[] args) {
		int sayi;
		int basamak ;
		int result =0;
		
		Scanner k =new Scanner(System.in);
		
		System.out.println("Lütfen bir sayý giriniz : ");
		sayi = k.nextInt();
		
		while(sayi != 0) {
			basamak = sayi % 10;
			result = result + basamak;
			sayi = sayi/10;
			
			
		}
		System.out.println("Basamak toplamý " + result);

	}

}
