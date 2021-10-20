import java.util.Scanner;

public class Game {
	private Scanner input = new Scanner(System.in);

	public void start() {
		System.out.println("Macera oyununa ho�geldiniz !");
		System.out.print("L�tfen bir isim giriniz :  ");
		String playerName = input.nextLine();
		Player player = new Player(playerName);
		System.out.println(player.getName() + " Ho�geldin! ");
		System.out.println("L�tfen bir karakter se�iniz ! ");

		player.selectChar();
		Location location = null;
		while (true) {
			player.printInfo();
			System.out.println();
			System.out.println("############B�lgeler#################");
			System.out.println();
			System.out.println("B�lgeler");
			System.out.println("1 - G�venli Ev -->Buras� sizin i�in g�venli bir ev , d��man yoktur !" );
			System.out.println("2 - E�ya D�kkan� --> Silah veya Z�rh sat�n alabilirsiniz !");
			System.out.println("3 - Ma�ara --> �d�l <Yemek> , dikkatli ol zombi ��kabilir");
			System.out.println("4 - Orman --> �d�l <Odun> , dikkatli ol vampir ��kabilir");
			System.out.println("5 - Nehir --> �d�l <Su> , dikkatli ol ay� ��kabilir");
			System.out.println("0 - ��k�� yap -->Oyunu sonland�r ");
			System.out.println("L�tfen gitmek istedi�iniz b�lgeyi se�iniz : ");
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
				System.out.println("L�tfen ge�erli b�lge giriniz");
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
