import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName , password ,password2;
		String select ;
		
		Scanner k = new Scanner(System.in);
		
		
		System.out.println("Kullan�c� ad�n� giriniz : ");
		userName = k.nextLine();
		
		System.out.println("�ifreniz : ");
		password = k.nextLine();

		if (userName.equals("ucivgin")) {
			System.out.println("Do�ru");
		} else {
			System.out.println("Kullan�c� ad� yanl��");
		}
		
		if(password.equals("123")) {
			System.out.println("Do�ru");
		}else {
			System.out.println("�ifre yanl�� s�f�rlamak istermisiniz");
			System.out.println("1-Evet\n2-Hay�r");
			select = k.nextLine();
			password2=password;
			
			switch (select) {
			case "Evet":
				System.out.println("yeni �ifre giriniz");
				password=k.nextLine();
				if(password.equals(password2)) {
					System.out.println("�ifre olu�trulamad� farkl� �ifre giriniz");
				}else {
					System.out.println("�ifre olu�turuldu");
				}
				break;
			
			case "Hay�r":
				System.out.println("�ifre olu�turulmad�");
				break;
			
			default:
				System.out.println("Farkl� i�lem yap�ld�");
			}
			
		}
		
	}

}
