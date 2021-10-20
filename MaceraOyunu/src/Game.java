import java.util.Scanner;

public class Game {
	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.println("Macera oyununa hoþgeldiniz !");
		System.out.print("Lütfen bir isim giriniz :  ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println(player.getName() + " Hoþgeldin! ");
		System.out.println("Lütfen bir karakter seçiniz ! ");

		player.selectChar();
		Location location = null;
		while (true) {
			player.printInfo();
			System.out.println();
			System.out.println("############Bölgeler#################");
			System.out.println();
			System.out.println("Bölgeler");
			System.out.println("1 - Güvenli Ev -->Burasý sizin için güvenli bir ev , düþman yoktur !" );
			System.out.println("2 - Eþya Dükkaný --> Silah veya Zýrh satýn alabilirsiniz !");
			System.out.println("3 - Maðara --> Ödül <Yemek> , dikkatli ol zombi çýkabilir");
			System.out.println("4 - Orman --> Ödül <Odun> , dikkatli ol vampir çýkabilir");
			System.out.println("5 - Nehir --> Ödül <Su> , dikkatli ol ayý çýkabilir");
			System.out.println("0 - Çýkýþ yap -->Oyunu sonlandýr ");
			System.out.println("Lütfen gitmek istediðiniz bölgeyi seçiniz : ");
			int selecLoc = input.nextInt();
			switch (selecLoc) {
			case 0:
				location = null;
				break;
			case 1:
				location = new SafeHouse(player);
				break;

			case 2:
				location = new ToolStore(player);
				break;
				
			case 3:
				location = new Cave(player);
				break;
			case 4:
				location = new Forest(player);
				break;
				
			case 5:
				location = new River(player);
				break;

			default:
				System.out.println("Lütfen geçerli bölge giriniz");
			}
			if(location == null) {
				System.out.println("Oyun btti. Yine bekleriz");
				break;
			}
			
			if (!location.onLocation()) {
				System.out.println("GAME OVER!");
				break;
			}
		}

	}
}
