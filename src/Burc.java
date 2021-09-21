import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		int ay , gün ;
		String burc;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Ay giriniz");
		ay = k.nextInt();
		
		System.out.println("Gün giriniz");
		gün = k.nextInt();
		
		
		if (ay ==1) {
			if(1<=gün && gün<=31) {
				if(gün<22) {
					System.out.println("Oðlak");
				}else {
					System.out.println("Kova");
				}
			}
			else {
				System.out.println("Yanlýþ deðer");
			}
		}
		
		else {
			System.out.println("Yanlýþ ay dðeri");
		}

	}

}
