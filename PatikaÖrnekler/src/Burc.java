import java.util.Scanner;

public class Burc {

	public static void main(String[] args) {
		int ay , g�n ;
		String burc;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Ay giriniz");
		ay = k.nextInt();
		
		System.out.println("G�n giriniz");
		g�n = k.nextInt();
		
		
		if (ay ==1) {
			if(1<=g�n && g�n<=31) {
				if(g�n<22) {
					System.out.println("O�lak");
				}else {
					System.out.println("Kova");
				}
			}
			else {
				System.out.println("Yanl�� de�er");
			}
		}
		
		else {
			System.out.println("Yanl�� ay d�eri");
		}

	}

}
