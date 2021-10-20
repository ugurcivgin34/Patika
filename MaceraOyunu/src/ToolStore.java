

public class ToolStore extends NormalLoca {

	public ToolStore(Player player) {
		super(player, "Ma�aza");

	}

	@Override
	boolean onLocation() {
		System.out.println("------ Ma�azaya ho�geldiniz ! ------ ");
		boolean showMenu = true;
		while(showMenu) {
		
		System.out.println("1 - Silahlar ");
		System.out.println("2 - Z�rhlar ");
		System.out.println("3 - ��k�� Yap ");
		System.out.print("Se�iminiz : ");
		int selectCase = input.nextInt();
		while (selectCase < 1 || selectCase > 3) {
			System.out.print("Ge�ersiz de�er , tekrar giriniz : ");
			selectCase = input.nextInt();

		}
		switch (selectCase) {
		case 1:
			printWeapon();
			buyWeapon();
			break;

		case 2:
			printArmor();
			buyArmor();
			break;

		case 3:
			System.out.println("Bir daha bekleriz");
			showMenu = false;
			break;

		}
		}
		return true;
		
	}

	public void printWeapon() {
		System.out.println("-----Silahlar-----");

		for (Weapon w : Weapon.weapons()) {
			System.out.println(
					w.getId() + "-" + w.getName() + " <Para : " + w.getPrice() + " , Hasar : " + w.getDamage());
		}
		System.out.println("0 - ��k�� yap");

	}

	public void buyWeapon() {

		System.out.println("Bir silah se�iniz : ");
		int selectWeaponID = input.nextInt();

		while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
			System.out.print("Ge�ersiz de�er , tekrar giriniz : ");
			selectWeaponID = input.nextInt();
		}

		if(selectWeaponID !=0) {
			Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
			if (selectedWeapon != null) {
				if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yeterli paran�z bulunmamaktad�r !");
				} else {
					// Sat�n alman�n ger�ekle�ti�i alan
					System.out.println(selectedWeapon.getName() + " Silah�n� sat�n ald�n�z ! ");
					int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Kapan paran�z : " + this.getPlayer().getMoney());
					System.out.println("�nceki silah�n�z : " + this.getPlayer().getInventory().getWeapon().getName());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					System.out.println("Yeni silah�m�z : " + this.getPlayer().getInventory().getWeapon().getName());

				}
			}
		}
		

	}

	public void printArmor() {
		System.out.println("-----Z�rhlar-----");

		for (Armor a : Armor.armors()) {
			System.out.println(
					a.getId() + " - " + a.getName() + "<Para : " + a.getPrice() + ", Z�rh" + a.getBlock() + " >");
		}
		System.out.println("0 - ��k�� Yap");
	}
	
	public void buyArmor() {
		System.out.println("Bir silah se�iniz : ");
		int selectArmorID = input.nextInt();

		while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
			System.out.print("Ge�ersiz de�er , tekrar giriniz : ");
			selectArmorID = input.nextInt();
		}
		
		if(selectArmorID != 0) {
			Armor selectedArmor =Armor.getArmorObjById(selectArmorID);
			
			if(selectedArmor != null) {
				if(selectedArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yeterli paran�z bulunmamaktad�r !");
				} else {
					System.out.println(selectedArmor.getName() + "Z�rh�n� sat�n ald�n�z");
					int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
					this.getPlayer().setMoney(balance);
					this.getPlayer().getInventory().setArmor(selectedArmor);
					System.out.println("Kapan paran�z : " + this.getPlayer().getMoney());
				}
			}
		}
	}

}
