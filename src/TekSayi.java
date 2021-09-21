import java.util.Scanner;

public class TekSayi {

	public static void main(String[] args) {
		
		int n ;
		int toplam = 0;
		Scanner k = new Scanner(System.in);
		
		do {
			System.out.println("Sayý giriniz :");
			n = k.nextInt();
			if(n % 4 == 0) {
				toplam = toplam + n;
			} else {
				break;
			}
					
		}while(n>0);
		
		System.out.println("Toplam : "+ toplam);
		
		
	}

}
