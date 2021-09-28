import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		String userName , password ,password2;
		String select ;
		
		Scanner k = new Scanner(System.in);
		
		
		System.out.println("Kullanýcý adýný giriniz : ");
		userName = k.nextLine();
		
		System.out.println("Þifreniz : ");
		password = k.nextLine();

		if (userName.equals("ucivgin")) {
			System.out.println("Doðru");
		} else {
			System.out.println("Kullanýcý adý yanlýþ");
		}
		
		if(password.equals("123")) {
			System.out.println("Doðru");
		}else {
			System.out.println("Þifre yanlýþ sýfýrlamak istermisiniz");
			System.out.println("1-Evet\n2-Hayýr");
			select = k.nextLine();
			password2=password;
			
			switch (select) {
			case "Evet":
				System.out.println("yeni þifre giriniz");
				password=k.nextLine();
				if(password.equals(password2)) {
					System.out.println("Þifre oluþtrulamadý farklý þifre giriniz");
				}else {
					System.out.println("Þifre oluþturuldu");
				}
				break;
			
			case "Hayýr":
				System.out.println("Þifre oluþturulmadý");
				break;
			
			default:
				System.out.println("Farklý iþlem yapýldý");
			}
			
		}
		
	}

}
