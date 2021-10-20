

public class ToolStore extends NormalLoca {

	public ToolStore(Player player) {
		super(player, "Maðaza");

	}

	@Override
	boolean onLocation() {
		System.out.println("------ Maðazaya hoþgeldiniz ! ------ ");
		boolean showMenu = true;
		while(showMenu) {
		
		System.out.println("1 - Silahlar ");
		System.out.println("2 - Zýrhlar ");
		System.out.println("3 - Çýkýþ Yap ");
		System.out.print("Seçiminiz : ");
		int selectCase = input.nextInt();
		while (selectCase < 1 || selectCase > 3) {
			System.out.print("Geçersiz deðer , tekrar giriniz : ");
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
		System.out.println("0 - Çýkýþ yap");

	}

	public void buyWeapon() {

		System.out.println("Bir silah seçiniz : ");
		int selectWeaponID = input.nextInt();

		while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
			System.out.print("Geçersiz deðer , tekrar giriniz : ");
			selectWeaponID = input.nextInt();
		}

		if(selectWeaponID !=0) {
			Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
			if (selectedWeapon != null) {
				if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yeterli paranýz bulunmamaktadýr !");
				} else {
					// Satýn almanýn gerçekleþtiði alan
					System.out.println(selectedWeapon.getName() + " Silahýný satýn aldýnýz ! ");
					int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
					this.getPlayer().setMoney(balance);
					System.out.println("Kapan paranýz : " + this.getPlayer().getMoney());
					System.out.println("Önceki silahýnýz : " + this.getPlayer().getInventory().getWeapon().getName());
					this.getPlayer().getInventory().setWeapon(selectedWeapon);
					System.out.println("Yeni silahýmýz : " + this.getPlayer().getInventory().getWeapon().getName());

				}
			}
		}
		

	}

	public void printArmor() {
		System.out.println("-----Zýrhlar-----");

		for (Armor a : Armor.armors()) {
			System.out.println(
					a.getId() + " - " + a.getName() + "<Para : " + a.getPrice() + ", Zýrh" + a.getBlock() + " >");
		}
		System.out.println("0 - Çýkýþ Yap");
	}
	
	public void buyArmor() {
		System.out.println("Bir silah seçiniz : ");
		int selectArmorID = input.nextInt();

		while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
			System.out.print("Geçersiz deðer , tekrar giriniz : ");
			selectArmorID = input.nextInt();
		}
		
		if(selectArmorID != 0) {
			Armor selectedArmor =Armor.getArmorObjById(selectArmorID);
			
			if(selectedArmor != null) {
				if(selectedArmor.getPrice() > this.getPlayer().getMoney()) {
					System.out.println("Yeterli paranýz bulunmamaktadýr !");
				} else {
					System.out.println(selectedArmor.getName() + "Zýrhýný satýn aldýnýz");
					int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
					this.getPlayer().setMoney(balance);
					this.getPlayer().getInventory().setArmor(selectedArmor);
					System.out.println("Kapan paranýz : " + this.getPlayer().getMoney());
				}
			}
		}
	}

}
